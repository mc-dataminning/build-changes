public class cii extends cja {
   public cii(cja.a $$0) {
      super($$0);
   }

   @Override
   public bgy a(clp $$0) {
      cpv $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfj $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!cti.h($$3) && !ctj.g($$3) && !ctk.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (csj.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, csj.a($$1, $$2));
            $$1.a($$0.o(), djt.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dfz.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), djt.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bgy.a($$1.B);
      } else {
         return bgy.e;
      }
   }

   private void a(cpv $$0, gw $$1) {
      asc $$2 = $$0.D_();
      $$0.a(null, $$1, ape.hD, apf.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }
}
