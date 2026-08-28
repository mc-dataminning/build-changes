class btb extends bth {
   protected btb(bti $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bva $$0, int $$1) {
      return $$0.fy() > 0.0F || $$0.dX().C;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void b(bva $$0, int $$1) {
      super.b($$0, $$1);
      $$0.E(Math.max($$0.fy(), (float)(4 * (1 + $$1))));
   }
}
