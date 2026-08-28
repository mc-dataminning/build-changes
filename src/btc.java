class btc extends bth {
   protected btc(bti $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(bva $$0, int $$1) {
      if ($$0 instanceof aro $$2 && !$$2.R_()) {
         arn $$3 = $$2.B();
         if ($$3.ak() != bsa.a && $$3.c($$2.dx())) {
            cqa $$4 = $$3.d($$2.dx());
            if ($$4 == null || $$4.m() < $$4.l()) {
               $$2.a(new btj(btl.I, 600, $$1));
               $$2.c($$2.dx());
               return false;
            }
         }
      }

      return true;
   }
}
