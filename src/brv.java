class brv extends bsa {
   protected brv(bsb $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(btp $$0, int $$1) {
      if ($$0 instanceof arg $$2 && !$$2.N_()) {
         arf $$3 = $$2.z();
         if (!$$3.J().b(cpn.c)) {
            return this.a($$2, $$3);
         }

         if ($$3.al() != bqr.a && $$3.c($$2.dp())) {
            coi $$4 = $$3.d($$2.dp());
            if ($$4 == null || $$4.m() < $$4.l()) {
               $$2.b(new bsc(bse.I, 600, $$1));
               $$2.d($$2.dp());
               return false;
            }
         }
      }

      return true;
   }

   private boolean a(arg $$0, arf $$1) {
      iz $$2 = $$0.dp();
      return $$1.al() != bqr.a && $$1.c($$2) ? $$1.z().a($$0, $$2) == null : true;
   }
}
