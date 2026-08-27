class blc extends blh {
   protected blc(bli $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bmo $$0, int $$1) {
      return $$0.fk() > 0.0F || $$0.dL().B;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void b(bmo $$0, int $$1) {
      super.b($$0, $$1);
      $$0.x(Math.max($$0.fk(), (float)(4 * (1 + $$1))));
   }
}
