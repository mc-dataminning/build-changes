class bso extends bst {
   protected bso(bsu $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(buk $$0, int $$1) {
      if ($$0 instanceof ari $$2 && !$$2.P_()) {
         arh $$3 = $$2.B();
         if ($$3.am() != brm.a && $$3.c($$2.ds())) {
            cpi $$4 = $$3.d($$2.ds());
            if ($$4 == null || $$4.m() < $$4.l()) {
               $$2.a(new bsv(bsx.I, 600, $$1));
               $$2.c($$2.ds());
               return false;
            }
         }
      }

      return true;
   }
}
