public abstract class clz extends crf {
   protected clz(bvi<? extends clz> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
   }

   public clz.a j() {
      return clz.a.a;
   }

   @Override
   public boolean c(bvy $$0) {
      return $$0 instanceof coy && $$0.n_() ? false : super.c($$0);
   }

   @Override
   protected boolean t(bva $$0) {
      if (super.t($$0)) {
         return true;
      } else {
         return !$$0.aq().a(awt.z) ? false : this.cq() == null && $$0.cq() == null;
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

   protected class b extends cdo {
      public b(final crf $$1) {
         super($$1, false);
      }

      @Override
      public boolean b() {
         return super.b() && clz.this.gG();
      }
   }
}
