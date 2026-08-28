class bwa extends bwg {
   protected bwa(bwh $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(asb $$0, byf $$1, int $$2) {
      return $$1.fw() > 0.0F;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void a(byf $$0, int $$1) {
      super.a($$0, $$1);
      $$0.E(Math.max($$0.fw(), (float)(4 * (1 + $$1))));
   }
}
