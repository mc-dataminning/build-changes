class bne extends bmz {
   protected bne(bna $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bog $$0, int $$1) {
      if ($$0.ew() > 1.0F) {
         $$0.a($$0.dN().o(), 1.0F);
      }

      return true;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      int $$2 = 25 >> $$1;
      return $$2 > 0 ? $$0 % $$2 == 0 : true;
   }
}
