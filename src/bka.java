class bka extends bkg {
   protected bka(bkh $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(bll $$0, int $$1) {
      super.a($$0, $$1);
      if ($$0.fl() <= 0.0F && !$$0.dN().B) {
         $$0.d(this);
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void b(bll $$0, int $$1) {
      super.b($$0, $$1);
      $$0.y(Math.max($$0.fl(), (float)(4 * (1 + $$1))));
   }
}
