public class cid extends civ {
   public cid(civ.a $$0) {
      super($$0);
   }

   @Override
   public bgt a(clk $$0) {
      cpq $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfe $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!ctd.h($$3) && !cte.g($$3) && !ctf.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (cse.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, cse.a($$1, $$2));
            $$1.a($$0.o(), djo.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dfu.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), djo.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bgt.a($$1.B);
      } else {
         return bgt.e;
      }
   }

   private void a(cpq $$0, gw $$1) {
      arx $$2 = $$0.y_();
      $$0.a(null, $$1, aoz.hD, apa.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }
}
