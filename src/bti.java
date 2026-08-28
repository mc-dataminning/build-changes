class bti extends btl {
   protected bti(btm $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bve $$0, int $$1) {
      if ($$0 instanceof cor $$2) {
         $$2.G(0.005F * (float)($$1 + 1));
      }

      return true;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }
}
