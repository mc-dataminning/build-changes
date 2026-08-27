class bhv extends bib {
   protected bhv(bic $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(bjg $$0, int $$1) {
      super.a($$0, $$1);
      if ($$0.fj() <= 0.0F && !$$0.dL().B) {
         $$0.d(this);
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void b(bjg $$0, int $$1) {
      super.b($$0, $$1);
      $$0.y(Math.max($$0.fj(), (float)(4 * (1 + $$1))));
   }
}
