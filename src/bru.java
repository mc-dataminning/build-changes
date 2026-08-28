class bru extends brm {
   protected bru(brn $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(btb $$0, int $$1) {
      if ($$0.ex() < $$0.eO()) {
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
