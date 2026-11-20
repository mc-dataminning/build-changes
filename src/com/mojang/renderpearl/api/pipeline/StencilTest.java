package com.mojang.renderpearl.api.pipeline;

public record StencilTest(StencilTest.PerFace front, StencilTest.PerFace back) {
   public enum Op {
      KEEP,
      ZERO,
      REPLACE,
      INCREMENT_CLAMP,
      DECREEMENT_CLAMP,
      INVERT,
      INCREMENT_WRAP,
      DECREMENT_WRAP;
   }

   public record PerFace(
      StencilTest.Op fail, StencilTest.Op pass, StencilTest.Op depthFail, CompareOp compare, byte compareMask, byte writeMask, byte reference
   ) {
   }
}
