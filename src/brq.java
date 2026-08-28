class brq extends brv {
   protected brq(brw $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(btk $$0, int $$1) {
      if ($$0 instanceof arc $$2 && !$$2.N_()) {
         arb $$3 = $$2.z();
         if (!$$3.J().b(cpi.c)) {
            return this.a($$2, $$3);
         }

         if ($$3.al() != bqm.a && $$3.c($$2.dp())) {
            cod $$4 = $$3.d($$2.dp());
            if ($$4 == null || $$4.m() < $$4.l()) {
               $$2.b(new brx(brz.I, 600, $$1));
               $$2.d($$2.dp());
               return false;
            }
         }
      }

      return true;
   }

   private boolean a(arc $$0, arb $$1) {
      iz $$2 = $$0.dp();
      return $$1.al() != bqm.a && $$1.c($$2) ? $$1.z().a($$0, $$2) == null : true;
   }
}
