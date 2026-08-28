class bve extends bvk {
   protected bve(bvl $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(arq $$0, bxj $$1, int $$2) {
      return $$1.fv() > 0.0F;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void a(bxj $$0, int $$1) {
      super.a($$0, $$1);
      $$0.E(Math.max($$0.fv(), (float)(4 * (1 + $$1))));
   }
}
