public abstract class cnu extends ctd {
   protected cnu(bwr<? extends cnu> $$0, djm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
   }

   public cnu.a j() {
      return cnu.a.a;
   }

   @Override
   public boolean c(bxj $$0) {
      return $$0 instanceof cqt && $$0.n_() ? false : super.c($$0);
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
      public b(final ctd $$1) {
         super($$1, false);
      }

      @Override
      public boolean b() {
         return super.b() && cnu.this.gH();
      }
   }
}
