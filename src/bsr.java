class bsr extends bsw {
   protected bsr(bsx $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(bun $$0, int $$1) {
      if ($$0 instanceof ark $$2 && !$$2.Q_()) {
         arj $$3 = $$2.B();
         if ($$3.am() != brp.a && $$3.c($$2.ds())) {
            cpl $$4 = $$3.d($$2.ds());
            if ($$4 == null || $$4.m() < $$4.l()) {
               $$2.a(new bsy(bta.I, 600, $$1));
               $$2.c($$2.ds());
               return false;
            }
         }
      }

      return true;
   }
}
