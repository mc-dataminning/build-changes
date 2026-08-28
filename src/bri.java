class bri extends brn {
   protected bri(bro $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(btc $$0, int $$1) {
      if ($$0 instanceof aqn $$2 && !$$2.N_()) {
         aqm $$3 = $$2.A();
         if ($$3.al() != bqe.a && $$3.c($$2.dr())) {
            cnw $$4 = $$3.d($$2.dr());
            if ($$4 == null || $$4.m() < $$4.l()) {
               $$2.b(new brp(brr.I, 600, $$1));
               $$2.c($$2.dr());
               return false;
            }
         }
      }

      return true;
   }
}
