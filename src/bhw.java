class bhw extends bhr {
   protected bhw(bhs $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(biw $$0, int $$1) {
      super.a($$0, $$1);
      if ($$0.et() > 1.0F) {
         $$0.a($$0.dL().o(), 1.0F);
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      int $$2 = 25 >> $$1;
      return $$2 > 0 ? $$0 % $$2 == 0 : true;
   }
}
