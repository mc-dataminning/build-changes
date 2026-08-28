class brx extends bsa {
   protected brx(bsb $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(btp $$0, int $$1) {
      if ($$0 instanceof cmx $$2) {
         $$2.C(0.005F * (float)($$1 + 1));
      }

      return true;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }
}
