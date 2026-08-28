class btg extends btl {
   protected btg(btm $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(bve $$0, int $$1) {
      if ($$0 instanceof arr $$2 && !$$2.R_()) {
         arq $$3 = $$2.B();
         if ($$3.ak() != bse.a && $$3.c($$2.dy())) {
            cqe $$4 = $$3.d($$2.dy());
            if ($$4 == null || $$4.m() < $$4.l()) {
               $$2.a(new btn(btp.I, 600, $$1));
               $$2.c($$2.dy());
               return false;
            }
         }
      }

      return true;
   }
}
