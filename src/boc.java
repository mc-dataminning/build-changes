class boc extends boh {
   protected boc(boi $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bpo $$0, int $$1) {
      return $$0.fp() > 0.0F || $$0.dM().B;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void b(bpo $$0, int $$1) {
      super.b($$0, $$1);
      $$0.A(Math.max($$0.fp(), (float)(4 * (1 + $$1))));
   }
}
