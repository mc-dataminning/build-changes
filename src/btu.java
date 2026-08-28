class btu extends btn {
   protected btu(bto $$0, int $$1, lr $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 1;
   }

   @Override
   public boolean a(ard $$0, bvg $$1, int $$2) {
      if ($$1 instanceof are $$3 && !$$1.Z_()) {
         ji $$4 = $$3.ag();
         if ($$4 != null) {
            $$0.B().a($$3, $$4);
            $$3.af();
            return false;
         }
      }

      return true;
   }
}
