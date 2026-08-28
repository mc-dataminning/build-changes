public abstract class cng extends cso {
   protected cng(bwm<? extends cng> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
   }

   public cng.a j() {
      return cng.a.a;
   }

   @Override
   public boolean c(bxc $$0) {
      return $$0 instanceof cqf && $$0.n_() ? false : super.c($$0);
   }

   @Override
   protected boolean t(bwd $$0) {
      if (super.t($$0)) {
         return true;
      } else {
         return !$$0.aq().a(axf.z) ? false : this.cr() == null && $$0.cr() == null;
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

   protected class b extends ceq {
      public b(final cso $$1) {
         super($$1, false);
      }

      @Override
      public boolean b() {
         return super.b() && cng.this.gE();
      }
   }
}
