class bti extends bto {
   protected bti(btp $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(arp $$0, bvh $$1, int $$2) {
      return $$1.fu() > 0.0F;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void a(bvh $$0, int $$1) {
      super.a($$0, $$1);
      $$0.E(Math.max($$0.fu(), (float)(4 * (1 + $$1))));
   }
}
