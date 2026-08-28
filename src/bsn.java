class bsn extends bst {
   protected bsn(bsu $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(buk $$0, int $$1) {
      return $$0.fs() > 0.0F || $$0.dS().B;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void b(buk $$0, int $$1) {
      super.b($$0, $$1);
      $$0.E(Math.max($$0.fs(), (float)(4 * (1 + $$1))));
   }
}
