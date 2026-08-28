public abstract class cnr extends cta {
   protected cnr(bwr<? extends cnr> $$0, djh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
   }

   public cnr.a j() {
      return cnr.a.a;
   }

   @Override
   public boolean c(bxj $$0) {
      return $$0 instanceof cqq && $$0.n_() ? false : super.c($$0);
   }

   @Override
   protected boolean t(bwi $$0) {
      if (super.t($$0)) {
         return true;
      } else {
         return !$$0.an().a(axf.z) ? false : this.cp() == null && $$0.cp() == null;
      }
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g,
      h;
   }

   protected class b extends cex {
      public b(final cta $$1) {
         super($$1, false);
      }

      @Override
      public boolean b() {
         return super.b() && cnr.this.gH();
      }
   }
}
