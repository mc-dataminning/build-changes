public class chv extends cir {
   public chv(cir.a $$0) {
      super($$0);
   }

   @Override
   public bgo a(clg $$0) {
      cpk $$1 = $$0.q();
      gv $$2 = $$0.a();
      dey $$3 = $$1.a_($$2);
      if (!$$3.a(csl.fy) || $$3.c(cuv.b)) {
         return bgo.d;
      } else if ($$1.B) {
         return bgo.a;
      } else {
         dey $$4 = $$3.a(cuv.b, Boolean.valueOf(true));
         csk.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, csl.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dfd.b $$5 = cuv.a().a($$1, $$2);
         if ($$5 != null) {
            gv $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), csl.fx.n(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bgo.b;
      }
   }

   @Override
   public bgp<ciw> a(cpk $$0, cbl $$1, bgn $$2) {
      ciw $$3 = $$1.b($$2);
      ehb $$4 = a($$0, $$1, cot.b.a);
      if ($$4.c() == ehd.a.b && $$0.a_($$4.a()).a(csl.fy)) {
         return bgp.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof aki $$5) {
            gv $$6 = $$5.a(apu.a, $$1.dk(), 100, false);
            if ($$6 != null) {
               cbw $$7 = new cbw($$0, $$1.dp(), $$1.e(0.5), $$1.dv());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dji.K, $$7.di(), dji.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof akj) {
                  ai.m.a((akj)$$1, $$6);
               }

               $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), aou.hb, aov.g, 0.5F, 0.4F / ($$0.y_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dk(), 0);
               if (!$$1.fR().d) {
                  $$3.h(1);
               }

               $$1.b(ape.c.b(this));
               $$1.a($$2, true);
               return bgp.a($$3);
            }
         }

         return bgp.b($$3);
      }
   }
}
