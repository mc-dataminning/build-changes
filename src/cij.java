public abstract class cij extends cni {
   protected cij(bsa<? extends cij> $$0, dax $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
   }

   public cij.a s() {
      return cij.a.a;
   }

   @Override
   public boolean c(bso $$0) {
      return $$0 instanceof cle && $$0.p_() ? false : super.c($$0);
   }

   @Override
   public boolean s(bru $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return !$$0.ak().a(avz.z) ? false : this.cj() == null && $$0.cj() == null;
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

   protected class b extends cae {
      public b(cni $$1) {
         super($$1, false);
      }

      @Override
      public boolean a() {
         return super.a() && cij.this.gG();
      }
   }
}
