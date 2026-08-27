class bii extends bid {
   protected bii(bie $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(bji $$0, int $$1) {
      super.a($$0, $$1);
      if ($$0.eu() > 1.0F) {
         $$0.a($$0.dM().o(), 1.0F);
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      int $$2 = 25 >> $$1;
      return $$2 > 0 ? $$0 % $$2 == 0 : true;
   }
}
