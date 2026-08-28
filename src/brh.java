class brh extends brm {
   protected brh(brn $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(btb $$0, int $$1) {
      if ($$0 instanceof aqn $$2 && !$$2.N_()) {
         aqm $$3 = $$2.z();
         if ($$3.al() != bqd.a && $$3.c($$2.dq())) {
            cnv $$4 = $$3.d($$2.dq());
            if ($$4 == null || $$4.m() < $$4.l()) {
               $$2.b(new bro(brq.I, 600, $$1));
               $$2.c($$2.dq());
               return false;
            }
         }
      }

      return true;
   }
}
