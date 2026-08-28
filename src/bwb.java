class bwb extends bwg {
   protected bwb(bwh $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(asb $$0, byf $$1, int $$2) {
      if ($$1 instanceof asc $$3 && !$$3.ak() && $$0.an() != buz.a && $$0.c($$3.dv())) {
         cty $$4 = $$0.d($$3.dv());
         if ($$4 == null || $$4.l() < $$4.k()) {
            $$3.a(new bwi(bwk.I, 600, $$2));
            $$3.c($$3.dv());
            return false;
         }
      }

      return true;
   }
}
