public class cmg extends cnb {
   public cmg(cnb.a $$0) {
      super($$0);
   }

   @Override
   public bkc a(cpr $$0) {
      ctx $$1 = $$0.q();
      hx $$2 = $$0.a();
      djp $$3 = $$1.a_($$2);
      if (!$$3.a(cxa.fy) || $$3.c(czn.c)) {
         return bkc.d;
      } else if ($$1.B) {
         return bkc.a;
      } else {
         djp $$4 = $$3.a(czn.c, Boolean.valueOf(true));
         cwy.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, cxa.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dju.b $$5 = czn.b().a($$1, $$2);
         if ($$5 != null) {
            hx $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), cxa.fx.o(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bkc.b;
      }
   }

   @Override
   public bkd<cng> a(ctx $$0, cfq $$1, bkb $$2) {
      cng $$3 = $$1.b($$2);
      ely $$4 = a($$0, $$1, ctg.b.a);
      if ($$4.c() == ema.a.b && $$0.a_($$4.a()).a(cxa.fy)) {
         return bkd.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof ane $$5) {
            hx $$6 = $$5.a(ast.a, $$1.dl(), 100, false);
            if ($$6 != null) {
               cgb $$7 = new cgb($$0, $$1.dq(), $$1.e(0.5), $$1.dw());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dnz.K, $$7.dj(), dnz.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof anf) {
                  am.n.a((anf)$$1, $$6);
               }

               $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), art.hT, aru.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dl(), 0);
               if (!$$1.fT().d) {
                  $$3.h(1);
               }

               $$1.b(asd.c.b(this));
               $$1.a($$2, true);
               return bkd.a($$3);
            }
         }

         return bkd.b($$3);
      }
   }
}
