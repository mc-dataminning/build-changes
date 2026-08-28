class bsx extends btc {
   protected bsx(btd $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(buv $$0, int $$1) {
      if ($$0 instanceof arn $$2 && !$$2.R_()) {
         arm $$3 = $$2.B();
         if ($$3.am() != brv.a && $$3.c($$2.dx())) {
            cpv $$4 = $$3.d($$2.dx());
            if ($$4 == null || $$4.m() < $$4.l()) {
               $$2.a(new bte(btg.I, 600, $$1));
               $$2.c($$2.dx());
               return false;
            }
         }
      }

      return true;
   }
}
