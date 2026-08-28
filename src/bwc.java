class bwc extends bvv {
   protected bwc(bvw $$0, int $$1, lw $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 1;
   }

   @Override
   public boolean a(ars $$0, bxu $$1, int $$2) {
      if ($$1 instanceof art $$3 && !$$1.Z_()) {
         iv $$4 = $$3.ad();
         if ($$4 != null) {
            $$0.B().a($$3, $$4);
            $$3.ac();
            return false;
         }
      }

      return true;
   }
}
