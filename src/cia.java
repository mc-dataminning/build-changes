public class cia extends cis {
   public cia(cis.a $$0) {
      super($$0);
   }

   @Override
   public bgq a(clh $$0) {
      cpl $$1 = $$0.q();
      gu $$2 = $$0.a();
      dez $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!csy.h($$3) && !csz.g($$3) && !cta.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (crz.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, crz.a($$1, $$2));
            $$1.a($$0.o(), djj.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dfp.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), djj.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bgq.a($$1.B);
      } else {
         return bgq.e;
      }
   }

   private void a(cpl $$0, gu $$1) {
      aru $$2 = $$0.y_();
      $$0.a(null, $$1, aow.hD, aox.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }
}
