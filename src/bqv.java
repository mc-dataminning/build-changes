class bqv extends bra {
   protected bqv(brb $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(bso $$0, int $$1) {
      if ($$0 instanceof aqn $$2 && !$$2.N_()) {
         aqm $$3 = $$2.z();
         if (!$$3.J().b(col.c)) {
            return this.a($$2, $$3);
         }

         if ($$3.ak() != bpr.a && $$3.c($$2.dp())) {
            cnh $$4 = $$3.d($$2.dp());
            if ($$4 == null || $$4.m() < $$4.l()) {
               $$2.b(new brc(bre.I, 600, $$1));
               $$2.d($$2.dp());
               return false;
            }
         }
      }

      return true;
   }

   private boolean a(aqn $$0, aqm $$1) {
      io $$2 = $$0.dp();
      if ($$1.ak() != bpr.a && $$1.c($$2)) {
         $$1.z().a($$0, $$2);
      }

      return true;
   }
}
