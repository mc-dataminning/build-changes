class bsf extends bry {
   protected bsf(brz $$0, int $$1, lg $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 1;
   }

   @Override
   public boolean a(btn $$0, int $$1) {
      if ($$0 instanceof arf $$2 && !$$0.N_()) {
         are $$3 = $$2.z();
         iz $$4 = $$2.ae();
         if ($$4 != null) {
            $$3.z().a($$2, $$4);
            $$2.ad();
            return false;
         }
      }

      return true;
   }
}
