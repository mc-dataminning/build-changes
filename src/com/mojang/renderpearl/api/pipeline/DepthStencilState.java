package com.mojang.renderpearl.api.pipeline;

import org.jspecify.annotations.Nullable;

public record DepthStencilState(CompareOp depthTest, boolean writeDepth, float depthBiasScaleFactor, float depthBiasConstant, @Nullable StencilTest stencilTest) {
   public static final DepthStencilState DEFAULT = new DepthStencilState(CompareOp.GREATER_THAN_OR_EQUAL, true);

   public DepthStencilState(final StencilTest stencilTest) {
      this(CompareOp.ALWAYS_PASS, false, 0.0F, 0.0F, stencilTest);
   }

   public DepthStencilState(final CompareOp depthTest, final boolean depthWrite) {
      this(depthTest, depthWrite, 0.0F, 0.0F, null);
   }

   public DepthStencilState(final CompareOp depthTest, final boolean depthWrite, final float depthBiasScaleFactor, final float depthBiasConstant) {
      this(depthTest, depthWrite, depthBiasScaleFactor, depthBiasConstant, null);
   }

   public DepthStencilState(final CompareOp depthTest, final boolean depthWrite, final StencilTest stencilTest) {
      this(depthTest, depthWrite, 0.0F, 0.0F, stencilTest);
   }
}
