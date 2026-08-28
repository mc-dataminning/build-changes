class btx extends btn {
   protected btx(btp $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(arp $$0, bvh $$1, int $$2) {
      if ($$1 instanceof cou $$3) {
         $$3.gr().a($$2 + 1, 1.0F);
      }

      return true;
   }
}
