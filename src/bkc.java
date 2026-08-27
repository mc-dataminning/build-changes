class bkc extends bkg {
   protected bkc(bkh $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void a(bll $$0, int $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof amj $$2 && !$$0.P_()) {
         ami $$3 = $$2.z();
         if ($$3.aj() == biy.a) {
            return;
         }

         if ($$3.b($$0.dn())) {
            $$3.y().a($$2);
         }
      }
   }
}
