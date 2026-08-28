class bux extends bvc {
   protected bux(bvd $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(aro $$0, bwz $$1, int $$2) {
      if ($$1 instanceof arp $$3 && !$$3.U_() && $$0.an() != btv.a && $$0.c($$3.dv())) {
         csh $$4 = $$0.d($$3.dv());
         if ($$4 == null || $$4.m() < $$4.l()) {
            $$3.a(new bve(bvg.I, 600, $$2));
            $$3.c($$3.dv());
            return false;
         }
      }

      return true;
   }
}
