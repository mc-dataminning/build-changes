class bsj extends bso {
   protected bsj(bsp $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(buf $$0, int $$1) {
      if ($$0 instanceof arh $$2 && !$$2.P_()) {
         arg $$3 = $$2.B();
         if ($$3.am() != brh.a && $$3.c($$2.ds())) {
            cpc $$4 = $$3.d($$2.ds());
            if ($$4 == null || $$4.m() < $$4.l()) {
               $$2.b(new bsq(bss.I, 600, $$1));
               $$2.c($$2.ds());
               return false;
            }
         }
      }

      return true;
   }
}
