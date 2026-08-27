public class cih extends civ {
   public cih(civ.a $$0) {
      super($$0);
   }

   @Override
   public bgt a(clk $$0) {
      cbp $$1 = $$0.o();
      cpq $$2 = $$0.q();
      gw $$3 = $$0.a();
      dfe $$4 = $$2.a_($$3);
      if (!ctd.h($$4) && !cte.g($$4) && !ctf.g($$4)) {
         gw $$5 = $$3.a($$0.k());
         if (cse.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, aoz.hS, apa.e, 1.0F, $$2.y_().i() * 0.4F + 0.8F);
            dfe $$6 = cse.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, djo.i, $$3);
            cja $$7 = $$0.n();
            if ($$1 instanceof ako) {
               al.y.a((ako)$$1, $$5, $$7);
               $$7.a(1, $$1, $$1x -> $$1x.d($$0.p()));
            }

            return bgt.a($$2.r_());
         } else {
            return bgt.e;
         }
      } else {
         $$2.a($$1, $$3, aoz.hS, apa.e, 1.0F, $$2.y_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dfu.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, djo.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, $$1x -> $$1x.d($$0.p()));
         }

         return bgt.a($$2.r_());
      }
   }
}
