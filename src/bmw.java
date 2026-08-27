class bmw extends bnb {
   protected bmw(bnc $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(boi $$0, int $$1) {
      return $$0.fk() > 0.0F || $$0.dM().B;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void b(boi $$0, int $$1) {
      super.b($$0, $$1);
      $$0.y(Math.max($$0.fk(), (float)(4 * (1 + $$1))));
   }
}
