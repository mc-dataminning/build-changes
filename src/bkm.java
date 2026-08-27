class bkm extends bkq {
   protected bkm(bkr $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void a(blv $$0, int $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof amq $$2 && !$$0.P_()) {
         amp $$3 = $$2.z();
         if ($$3.aj() == bji.a) {
            return;
         }

         if ($$3.b($$0.dm())) {
            $$3.y().a($$2);
         }
      }
   }
}
