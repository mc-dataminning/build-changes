class bhx extends bhr {
   protected bhx(bhs $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(biw $$0, int $$1) {
      super.a($$0, $$1);
      if ($$0.et() < $$0.eK()) {
         $$0.b(1.0F);
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      int $$2 = 50 >> $$1;
      return $$2 > 0 ? $$0 % $$2 == 0 : true;
   }
}
