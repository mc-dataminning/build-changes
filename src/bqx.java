class bqx extends brc {
   protected bqx(brd $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(bsq $$0, int $$1) {
      if ($$0 instanceof aqo $$2 && !$$2.N_()) {
         aqn $$3 = $$2.z();
         if (!$$3.J().b(coo.c)) {
            return this.a($$2, $$3);
         }

         if ($$3.ak() != bpt.a && $$3.c($$2.dp())) {
            cnj $$4 = $$3.d($$2.dp());
            if ($$4 == null || $$4.m() < $$4.l()) {
               $$2.b(new bre(brg.I, 600, $$1));
               $$2.d($$2.dp());
               return false;
            }
         }
      }

      return true;
   }

   private boolean a(aqo $$0, aqn $$1) {
      io $$2 = $$0.dp();
      if ($$1.ak() != bpt.a && $$1.c($$2)) {
         $$1.z().a($$0, $$2);
      }

      return true;
   }
}
