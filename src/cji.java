public class cji extends cke {
   public cji(cke.a $$0) {
      super($$0);
   }

   @Override
   public bib a(cmt $$0) {
      cqz $$1 = $$0.q();
      ht $$2 = $$0.a();
      dgb $$3 = $$1.a_($$2);
      if (!$$3.a(cuc.fy) || $$3.c(cwn.c)) {
         return bib.d;
      } else if ($$1.B) {
         return bib.a;
      } else {
         dgb $$4 = $$3.a(cwn.c, Boolean.valueOf(true));
         cua.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, cuc.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dgg.b $$5 = cwn.b().a($$1, $$2);
         if ($$5 != null) {
            ht $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), cuc.fx.o(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bib.b;
      }
   }

   @Override
   public bic<ckj> a(cqz $$0, ccx $$1, bia $$2) {
      ckj $$3 = $$1.b($$2);
      eib $$4 = a($$0, $$1, cqi.b.a);
      if ($$4.c() == eid.a.b && $$0.a_($$4.a()).a(cuc.fy)) {
         return bic.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof alq $$5) {
            ht $$6 = $$5.a(ard.a, $$1.dl(), 100, false);
            if ($$6 != null) {
               cdi $$7 = new cdi($$0, $$1.dq(), $$1.e(0.5), $$1.dw());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dkl.K, $$7.dj(), dkl.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof alr) {
                  al.m.a((alr)$$1, $$6);
               }

               $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), aqd.hd, aqe.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dl(), 0);
               if (!$$1.fT().d) {
                  $$3.h(1);
               }

               $$1.b(aqn.c.b(this));
               $$1.a($$2, true);
               return bic.a($$3);
            }
         }

         return bic.b($$3);
      }
   }
}
