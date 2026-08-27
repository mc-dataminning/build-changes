class bln extends blh {
   protected bln(bli $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bmo $$0, int $$1) {
      if ($$0.ev() < $$0.eM()) {
         $$0.b(1.0F);
      }

      return true;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      int $$2 = 50 >> $$1;
      return $$2 > 0 ? $$0 % $$2 == 0 : true;
   }
}
