public abstract class clz extends crg {
   protected clz(bvm<? extends clz> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
   }

   public clz.a m() {
      return clz.a.a;
   }

   @Override
   public boolean c(bwb $$0) {
      return $$0 instanceof coz && $$0.e_() ? false : super.c($$0);
   }

   @Override
   protected boolean t(bvf $$0) {
      if (super.t($$0)) {
         return true;
      } else {
         return !$$0.aq().a(axy.z) ? false : this.cr() == null && $$0.cr() == null;
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

   protected class b extends cdr {
      public b(final crg $$1) {
         super($$1, false);
      }

      @Override
      public boolean b() {
         return super.b() && clz.this.gC();
      }
   }
}
