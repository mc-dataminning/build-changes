class bwn extends bwg {
   protected bwn(bwh $$0, int $$1, lx $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 1;
   }

   @Override
   public boolean a(asb $$0, byf $$1, int $$2) {
      if ($$1 instanceof asc $$3 && !$$1.ak()) {
         iw $$4 = $$3.ac();
         if ($$4 != null) {
            $$0.B().a($$3, $$4);
            $$3.ab();
            return false;
         }
      }

      return true;
   }
}
