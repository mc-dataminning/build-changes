class bvc extends buu {
   protected bvc(buv $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(arn $$0, bwr $$1, int $$2) {
      if ($$1.eF() < $$1.eT()) {
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
