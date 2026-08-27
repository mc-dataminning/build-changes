public class cki extends cle {
   public cki(cle.a $$0) {
      super($$0);
   }

   @Override
   public bix a(cnt $$0) {
      csa $$1 = $$0.q();
      ht $$2 = $$0.a();
      dhi $$3 = $$1.a_($$2);
      if (!$$3.a(cvc.fy) || $$3.c(cxp.c)) {
         return bix.d;
      } else if ($$1.B) {
         return bix.a;
      } else {
         dhi $$4 = $$3.a(cxp.c, Boolean.valueOf(true));
         cva.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, cvc.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dhn.b $$5 = cxp.b().a($$1, $$2);
         if ($$5 != null) {
            ht $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), cvc.fx.o(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bix.b;
      }
   }

   @Override
   public biy<clj> a(csa $$0, cdu $$1, biw $$2) {
      clj $$3 = $$1.b($$2);
      ejq $$4 = a($$0, $$1, crj.b.a);
      if ($$4.c() == ejs.a.b && $$0.a_($$4.a()).a(cvc.fy)) {
         return biy.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof ame $$5) {
            ht $$6 = $$5.a(arr.a, $$1.dn(), 100, false);
            if ($$6 != null) {
               cef $$7 = new cef($$0, $$1.ds(), $$1.e(0.5), $$1.dy());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dls.K, $$7.dl(), dls.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof amf) {
                  al.m.a((amf)$$1, $$6);
               }

               $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), aqr.hv, aqs.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dn(), 0);
               if (!$$1.fU().d) {
                  $$3.h(1);
               }

               $$1.b(arb.c.b(this));
               $$1.a($$2, true);
               return biy.a($$3);
            }
         }

         return biy.b($$3);
      }
   }
}
