public abstract class cij extends cnn {
   protected cij(bsb<? extends cij> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected void y() {
      super.y();
   }

   public cij.a r() {
      return cij.a.a;
   }

   @Override
   public boolean c(bso $$0) {
      return $$0 instanceof clg && $$0.o_() ? false : super.c($$0);
   }

   @Override
   public boolean s(brv $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return !$$0.ak().a(awh.z) ? false : this.co() == null && $$0.co() == null;
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

   protected class b extends cad {
      public b(cnn $$1) {
         super($$1, false);
      }

      @Override
      public boolean a() {
         return super.a() && cij.this.gN();
      }
   }
}
