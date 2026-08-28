class bvs extends bvx {
   protected bvs(bvy $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(aru $$0, bxw $$1, int $$2) {
      if ($$1 instanceof arv $$3 && !$$3.Z_() && $$0.an() != buq.a && $$0.c($$3.dv())) {
         ctp $$4 = $$0.d($$3.dv());
         if ($$4 == null || $$4.l() < $$4.k()) {
            $$3.a(new bvz(bwb.I, 600, $$2));
            $$3.c($$3.dv());
            return false;
         }
      }

      return true;
   }
}
