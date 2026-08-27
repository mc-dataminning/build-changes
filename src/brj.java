class brj extends brc {
   protected brj(brd $$0, int $$1, kw $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 1;
   }

   @Override
   public boolean a(bsq $$0, int $$1) {
      if ($$0 instanceof aqo $$2 && !$$0.N_()) {
         aqn $$3 = $$2.z();
         io $$4 = $$2.ae();
         if ($$4 != null) {
            $$3.z().a($$2, $$4);
            $$2.ad();
            return false;
         }
      }

      return true;
   }
}
