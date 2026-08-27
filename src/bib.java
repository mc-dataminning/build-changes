class bib extends bih {
   protected bib(bii $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(bjm $$0, int $$1) {
      super.a($$0, $$1);
      if ($$0.fk() <= 0.0F && !$$0.dL().B) {
         $$0.d(this);
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void b(bjm $$0, int $$1) {
      super.b($$0, $$1);
      $$0.y(Math.max($$0.fk(), (float)(4 * (1 + $$1))));
   }
}
