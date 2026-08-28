class brs extends brx {
   protected brs(bry $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(btn $$0, int $$1) {
      if ($$0 instanceof aqv $$2 && !$$2.R_()) {
         aqu $$3 = $$2.A();
         if ($$3.al() != bqo.a && $$3.c($$2.do())) {
            coi $$4 = $$3.d($$2.do());
            if ($$4 == null || $$4.m() < $$4.l()) {
               $$2.b(new brz(bsb.I, 600, $$1));
               $$2.c($$2.do());
               return false;
            }
         }
      }

      return true;
   }
}
