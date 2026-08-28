class bts extends btl {
   protected bts(btm $$0, int $$1, lq $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 1;
   }

   @Override
   public boolean a(bve $$0, int $$1) {
      if ($$0 instanceof arr $$2 && !$$0.R_()) {
         arq $$3 = $$2.B();
         jh $$4 = $$2.ah();
         if ($$4 != null) {
            $$3.z().a($$2, $$4);
            $$2.ag();
            return false;
         }
      }

      return true;
   }
}
