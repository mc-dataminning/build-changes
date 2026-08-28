class btd extends bsw {
   protected btd(bsx $$0, int $$1, lm $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 1;
   }

   @Override
   public boolean a(bun $$0, int $$1) {
      if ($$0 instanceof ark $$2 && !$$0.Q_()) {
         arj $$3 = $$2.B();
         jf $$4 = $$2.ah();
         if ($$4 != null) {
            $$3.z().a($$2, $$4);
            $$2.ag();
            return false;
         }
      }

      return true;
   }
}
