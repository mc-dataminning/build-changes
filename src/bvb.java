class bvb extends bvh {
   protected bvb(bvi $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(arq $$0, bxe $$1, int $$2) {
      return $$1.fw() > 0.0F;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void a(bxe $$0, int $$1) {
      super.a($$0, $$1);
      $$0.E(Math.max($$0.fw(), (float)(4 * (1 + $$1))));
   }
}
