package com.entity.vo;

import com.entity.ShetuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 社团
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-07 17:17:58
 */
public class ShetuanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 社团名称
	 */
	
	private String shetuanmingcheng;
		
	/**
	 * 社团地址
	 */
	
	private String shetuandizhi;
		
	/**
	 * 社长姓名
	 */
	
	private String shezhangxingming;
		
	/**
	 * 社团电话
	 */
	
	private String shetuandianhua;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：社团名称
	 */
	 
	public void setShetuanmingcheng(String shetuanmingcheng) {
		this.shetuanmingcheng = shetuanmingcheng;
	}
	
	/**
	 * 获取：社团名称
	 */
	public String getShetuanmingcheng() {
		return shetuanmingcheng;
	}
				
	
	/**
	 * 设置：社团地址
	 */
	 
	public void setShetuandizhi(String shetuandizhi) {
		this.shetuandizhi = shetuandizhi;
	}
	
	/**
	 * 获取：社团地址
	 */
	public String getShetuandizhi() {
		return shetuandizhi;
	}
				
	
	/**
	 * 设置：社长姓名
	 */
	 
	public void setShezhangxingming(String shezhangxingming) {
		this.shezhangxingming = shezhangxingming;
	}
	
	/**
	 * 获取：社长姓名
	 */
	public String getShezhangxingming() {
		return shezhangxingming;
	}
				
	
	/**
	 * 设置：社团电话
	 */
	 
	public void setShetuandianhua(String shetuandianhua) {
		this.shetuandianhua = shetuandianhua;
	}
	
	/**
	 * 获取：社团电话
	 */
	public String getShetuandianhua() {
		return shetuandianhua;
	}
			
}
