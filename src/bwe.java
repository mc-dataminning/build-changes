class bwe extends bvx {
   protected bwe(bvy $$0, int $$1, lx $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 1;
   }

   @Override
   public boolean a(aru $$0, bxw $$1, int $$2) {
      if ($$1 instanceof arv $$3 && !$$1.Z_()) {
         iw $$4 = $$3.ad();
         if ($$4 != null) {
            $$0.B().a($$3, $$4);
            $$3.ac();
            return false;
         }
      }

      return true;
   }
}
