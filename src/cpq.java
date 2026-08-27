public class cpq extends cqh {
   public cpq(cqh.a $$0) {
      super($$0);
   }

   @Override
   public bnd a(csw $$0) {
      cxb $$1 = $$0.q();
      ib $$2 = $$0.a();
      dnb $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!daq.h($$3) && !dar.g($$3) && !das.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (czp.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, czp.a($$1, $$2));
            $$1.a($$0.o(), drp.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dnr.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), drp.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bnd.a($$1.B);
      } else {
         return bnd.e;
      }
   }

   private void a(cxb $$0, ib $$1) {
      axd $$2 = $$0.E_();
      $$0.a(null, $$1, aty.iD, atz.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }
}
