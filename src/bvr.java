class bvr extends bvk {
   protected bvr(bvl $$0, int $$1, lw $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 1;
   }

   @Override
   public boolean a(arq $$0, bxj $$1, int $$2) {
      if ($$1 instanceof arr $$3 && !$$1.V_()) {
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
