class btj extends btc {
   protected btj(btd $$0, int $$1, lo $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 1;
   }

   @Override
   public boolean a(buv $$0, int $$1) {
      if ($$0 instanceof arn $$2 && !$$0.R_()) {
         arm $$3 = $$2.B();
         jg $$4 = $$2.ah();
         if ($$4 != null) {
            $$3.z().a($$2, $$4);
            $$2.ag();
            return false;
         }
      }

      return true;
   }
}
