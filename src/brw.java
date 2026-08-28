class brw extends bsb {
   protected brw(bsc $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(btq $$0, int $$1) {
      if ($$0 instanceof arg $$2 && !$$2.N_()) {
         arf $$3 = $$2.z();
         if (!$$3.J().b(cpo.c)) {
            return this.a($$2, $$3);
         }

         if ($$3.al() != bqs.a && $$3.c($$2.dp())) {
            coj $$4 = $$3.d($$2.dp());
            if ($$4 == null || $$4.m() < $$4.l()) {
               $$2.b(new bsd(bsf.I, 600, $$1));
               $$2.d($$2.dp());
               return false;
            }
         }
      }

      return true;
   }

   private boolean a(arg $$0, arf $$1) {
      iz $$2 = $$0.dp();
      return $$1.al() != bqs.a && $$1.c($$2) ? $$1.z().a($$0, $$2) == null : true;
   }
}
