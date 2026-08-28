class brg extends brm {
   protected brg(brn $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(btb $$0, int $$1) {
      return $$0.fp() > 0.0F || $$0.dQ().B;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void b(btb $$0, int $$1) {
      super.b($$0, $$1);
      $$0.B(Math.max($$0.fp(), (float)(4 * (1 + $$1))));
   }
}
