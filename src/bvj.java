class bvj extends bvc {
   protected bvj(bvd $$0, int $$1, lv $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 1;
   }

   @Override
   public boolean a(aro $$0, bwz $$1, int $$2) {
      if ($$1 instanceof arp $$3 && !$$1.U_()) {
         iu $$4 = $$3.ag();
         if ($$4 != null) {
            $$0.B().a($$3, $$4);
            $$3.af();
            return false;
         }
      }

      return true;
   }
}
