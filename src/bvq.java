class bvq extends bvv {
   protected bvq(bvw $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(ars $$0, bxu $$1, int $$2) {
      if ($$1 instanceof art $$3 && !$$3.Z_() && $$0.an() != buo.a && $$0.c($$3.dv())) {
         ctn $$4 = $$0.d($$3.dv());
         if ($$4 == null || $$4.l() < $$4.k()) {
            $$3.a(new bvx(bvz.I, 600, $$2));
            $$3.c($$3.dv());
            return false;
         }
      }

      return true;
   }
}
