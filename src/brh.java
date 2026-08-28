class brh extends brn {
   protected brh(bro $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(btc $$0, int $$1) {
      return $$0.fq() > 0.0F || $$0.dR().B;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void b(btc $$0, int $$1) {
      super.b($$0, $$1);
      $$0.B(Math.max($$0.fq(), (float)(4 * (1 + $$1))));
   }
}
