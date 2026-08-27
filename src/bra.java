class bra extends brf {
   protected bra(brg $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bso $$0, int $$1) {
      return $$0.fB() > 0.0F || $$0.dU().C;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void b(bso $$0, int $$1) {
      super.b($$0, $$1);
      $$0.A(Math.max($$0.fB(), (float)(4 * (1 + $$1))));
   }
}
