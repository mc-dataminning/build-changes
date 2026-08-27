class bkh extends bkb {
   protected bkh(bkc $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(blg $$0, int $$1) {
      super.a($$0, $$1);
      if ($$0.ew() < $$0.eN()) {
         $$0.b(1.0F);
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      int $$2 = 50 >> $$1;
      return $$2 > 0 ? $$0 % $$2 == 0 : true;
   }
}
