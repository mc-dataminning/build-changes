class bpr extends bpv {
   protected bpr(bpw $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(bre $$0, int $$1) {
      if ($$0 instanceof aqf $$2 && !$$0.N_()) {
         aqe $$3 = $$2.z();
         if ($$3.ak() != bon.a && $$3.c($$0.dn())) {
            $$3.z().a($$2);
         }
      }

      return true;
   }
}
