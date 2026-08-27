class bla extends blg {
   protected bla(blh $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(bml $$0, int $$1) {
      super.a($$0, $$1);
      if ($$0.fk() <= 0.0F && !$$0.dM().B) {
         $$0.d(this);
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void b(bml $$0, int $$1) {
      super.b($$0, $$1);
      $$0.y(Math.max($$0.fk(), (float)(4 * (1 + $$1))));
   }
}
