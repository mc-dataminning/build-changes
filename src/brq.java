class brq extends brj {
   protected brq(brk $$0, int $$1, lh $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 1;
   }

   @Override
   public boolean a(bsy $$0, int $$1) {
      if ($$0 instanceof aql $$2 && !$$0.N_()) {
         aqk $$3 = $$2.z();
         ja $$4 = $$2.ae();
         if ($$4 != null) {
            $$3.z().a($$2, $$4);
            $$2.ad();
            return false;
         }
      }

      return true;
   }
}
