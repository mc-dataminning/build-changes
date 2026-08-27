public class cpo extends cqf {
   public cpo(cqf.a $$0) {
      super($$0);
   }

   @Override
   public bnc a(csu $$0) {
      cwz $$1 = $$0.q();
      ib $$2 = $$0.a();
      dmz $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dao.h($$3) && !dap.g($$3) && !daq.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (czn.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, czn.a($$1, $$2));
            $$1.a($$0.o(), drn.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dnp.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), drn.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bnc.a($$1.B);
      } else {
         return bnc.e;
      }
   }

   private void a(cwz $$0, ib $$1) {
      axd $$2 = $$0.E_();
      $$0.a(null, $$1, aty.iz, atz.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }
}
