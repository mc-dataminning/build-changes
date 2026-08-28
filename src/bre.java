class bre extends brj {
   protected bre(brk $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(bsy $$0, int $$1) {
      if ($$0 instanceof aql $$2 && !$$2.N_()) {
         aqk $$3 = $$2.z();
         if ($$3.al() != bqa.a && $$3.c($$2.dp())) {
            cns $$4 = $$3.d($$2.dp());
            if ($$4 == null || $$4.m() < $$4.l()) {
               $$2.b(new brl(brn.I, 600, $$1));
               $$2.c($$2.dp());
               return false;
            }
         }
      }

      return true;
   }
}
