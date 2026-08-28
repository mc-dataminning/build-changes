class btv extends bto {
   protected btv(btp $$0, int $$1, lq $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 1;
   }

   @Override
   public boolean a(arp $$0, bvh $$1, int $$2) {
      if ($$1 instanceof arq $$3 && !$$1.Y_()) {
         jh $$4 = $$3.ag();
         if ($$4 != null) {
            $$0.A().a($$3, $$4);
            $$3.af();
            return false;
         }
      }

      return true;
   }
}
