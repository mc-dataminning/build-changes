class bwd extends bvv {
   protected bwd(bvw $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(ars $$0, bxu $$1, int $$2) {
      if ($$1.eG() < $$1.eU()) {
         $$1.c(1.0F);
      }

      return true;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      int $$2 = 50 >> $$1;
      return $$2 > 0 ? $$0 % $$2 == 0 : true;
   }
}
