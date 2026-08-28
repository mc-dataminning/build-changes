class btw extends buc {
   protected btw(bud $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(ard $$0, bvy $$1, int $$2) {
      return $$1.fy() > 0.0F;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void a(bvy $$0, int $$1) {
      super.a($$0, $$1);
      $$0.F(Math.max($$0.fy(), (float)(4 * (1 + $$1))));
   }
}
