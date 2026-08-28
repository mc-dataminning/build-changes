public abstract class cme extends crl {
   protected cme(bvr<? extends cme> $$0, dhi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
   }

   public cme.a m() {
      return cme.a.a;
   }

   @Override
   public boolean c(bwg $$0) {
      return $$0 instanceof cpe && $$0.e_() ? false : super.c($$0);
   }

   @Override
   protected boolean t(bvk $$0) {
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

   protected class b extends cdw {
      public b(final crl $$1) {
         super($$1, false);
      }

      @Override
      public boolean b() {
         return super.b() && cme.this.gE();
      }
   }
}
