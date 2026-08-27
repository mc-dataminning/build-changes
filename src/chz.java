public class chz extends civ {
   public chz(civ.a $$0) {
      super($$0);
   }

   @Override
   public bgt a(clk $$0) {
      cpq $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfe $$3 = $$1.a_($$2);
      if (!$$3.a(csr.fy) || $$3.c(cvb.b)) {
         return bgt.d;
      } else if ($$1.B) {
         return bgt.a;
      } else {
         dfe $$4 = $$3.a(cvb.b, Boolean.valueOf(true));
         csq.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, csr.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dfj.b $$5 = cvb.a().a($$1, $$2);
         if ($$5 != null) {
            gw $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), csr.fx.n(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bgt.b;
      }
   }

   @Override
   public bgu<cja> a(cpq $$0, cbp $$1, bgs $$2) {
      cja $$3 = $$1.b($$2);
      ehe $$4 = a($$0, $$1, coz.b.a);
      if ($$4.c() == ehg.a.b && $$0.a_($$4.a()).a(csr.fy)) {
         return bgu.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof akn $$5) {
            gw $$6 = $$5.a(apz.a, $$1.dk(), 100, false);
            if ($$6 != null) {
               cca $$7 = new cca($$0, $$1.dp(), $$1.e(0.5), $$1.dv());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(djo.K, $$7.di(), djo.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof ako) {
                  al.m.a((ako)$$1, $$6);
               }

               $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), aoz.hb, apa.g, 0.5F, 0.4F / ($$0.y_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dk(), 0);
               if (!$$1.fR().d) {
                  $$3.h(1);
               }

               $$1.b(apj.c.b(this));
               $$1.a($$2, true);
               return bgu.a($$3);
            }
         }

         return bgu.b($$3);
      }
   }
}
