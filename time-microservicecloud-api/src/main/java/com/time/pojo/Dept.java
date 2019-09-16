package com.time.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)

public class Dept implements Serializable {

	private static final long serialVersionUID = 8993574387459842399L;


	//@Column(name = "tradeNo", length = 50, nullable = false)
	private Long deptNo;  //主键

	private String deptName;  //部门名称

	private String dbSource;  //来自哪一个数据库,因为微服务可以一个服务对应一个数据库

	public static void main(String[] args) {
		Dept dept = new Dept();
		dept.setDeptNo(1L).setDeptName("RD").setDbSource("DB02");
	}
}
