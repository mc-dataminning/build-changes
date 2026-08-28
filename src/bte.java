class bte extends bsw {
   protected bte(bsx $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bun $$0, int $$1) {
      if ($$0.eB() < $$0.eQ()) {
         $$0.c(1.0F);
      }

      return true;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      int $$2 = 50 >> $$1;
      return $$2 > 0 ? $$0 % $$2 == 0 : true;
   }
}
