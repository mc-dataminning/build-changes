public abstract class cji extends coh {
   protected cji(bsy<? extends cji> $$0, dbw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
   }

   public cji.a s() {
      return cji.a.a;
   }

   @Override
   public boolean c(btn $$0) {
      return $$0 instanceof cmd && $$0.p_() ? false : super.c($$0);
   }

   @Override
   public boolean s(bss $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return !$$0.ak().a(aws.z) ? false : this.cj() == null && $$0.cj() == null;
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

   protected class b extends cbd {
      public b(final coh $$1) {
         super($$1, false);
      }

      @Override
      public boolean a() {
         return super.a() && cji.this.gH();
      }
   }
}
