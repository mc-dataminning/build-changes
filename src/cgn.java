public abstract class cgn extends clm {
   protected cgn(bqg<? extends cgn> $$0, czg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
   }

   public cgn.a r() {
      return cgn.a.a;
   }

   @Override
   public boolean c(bqt $$0) {
      return $$0 instanceof cji && $$0.p_() ? false : super.c($$0);
   }

   @Override
   public boolean s(bqa $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return !$$0.ai().a(avh.z) ? false : this.cg() == null && $$0.cg() == null;
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

   protected class b extends byi {
      public b(clm $$1) {
         super($$1, false);
      }

      @Override
      public boolean a() {
         return super.a() && cgn.this.gC();
      }
   }
}
