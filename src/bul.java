class bul extends bue {
   protected bul(buf $$0, int $$1, lq $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 1;
   }

   @Override
   public boolean a(arx $$0, bvx $$1, int $$2) {
      if ($$1 instanceof ary $$3 && !$$1.aa_()) {
         jh $$4 = $$3.ag();
         if ($$4 != null) {
            $$0.B().a($$3, $$4);
            $$3.af();
            return false;
         }
      }

      return true;
   }
}
