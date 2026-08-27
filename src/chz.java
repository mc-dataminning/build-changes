public class chz extends cir {
   public chz(cir.a $$0) {
      super($$0);
   }

   @Override
   public bgo a(clg $$0) {
      cpk $$1 = $$0.q();
      gv $$2 = $$0.a();
      dey $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!csx.h($$3) && !csy.g($$3) && !csz.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (cry.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, cry.a($$1, $$2));
            $$1.a($$0.o(), dji.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dfo.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dji.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bgo.a($$1.B);
      } else {
         return bgo.e;
      }
   }

   private void a(cpk $$0, gv $$1) {
      art $$2 = $$0.y_();
      $$0.a(null, $$1, aou.hD, aov.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }
}
