class bhn extends bht {
   protected bhn(bhu $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(biy $$0, int $$1) {
      super.a($$0, $$1);
      if ($$0.fi() <= 0.0F) {
         $$0.d(this);
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void b(biy $$0, int $$1) {
      super.b($$0, $$1);
      $$0.y($$0.fi() + (float)(4 * (1 + $$1)));
   }
}
