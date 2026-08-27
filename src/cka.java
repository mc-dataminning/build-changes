public class cka extends ckw {
   public cka(ckw.a $$0) {
      super($$0);
   }

   @Override
   public biq a(cnl $$0) {
      crs $$1 = $$0.q();
      ht $$2 = $$0.a();
      dgw $$3 = $$1.a_($$2);
      if (!$$3.a(cuv.fy) || $$3.c(cxh.c)) {
         return biq.d;
      } else if ($$1.B) {
         return biq.a;
      } else {
         dgw $$4 = $$3.a(cxh.c, Boolean.valueOf(true));
         cut.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, cuv.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dhb.b $$5 = cxh.b().a($$1, $$2);
         if ($$5 != null) {
            ht $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), cuv.fx.o(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return biq.b;
      }
   }

   @Override
   public bir<clb> a(crs $$0, cdm $$1, bip $$2) {
      clb $$3 = $$1.b($$2);
      eje $$4 = a($$0, $$1, crb.b.a);
      if ($$4.c() == ejg.a.b && $$0.a_($$4.a()).a(cuv.fy)) {
         return bir.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof ama $$5) {
            ht $$6 = $$5.a(arn.a, $$1.dl(), 100, false);
            if ($$6 != null) {
               cdx $$7 = new cdx($$0, $$1.dq(), $$1.e(0.5), $$1.dw());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dlg.K, $$7.dj(), dlg.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof amb) {
                  al.m.a((amb)$$1, $$6);
               }

               $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), aqn.hf, aqo.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dl(), 0);
               if (!$$1.fT().d) {
                  $$3.h(1);
               }

               $$1.b(aqx.c.b(this));
               $$1.a($$2, true);
               return bir.a($$3);
            }
         }

         return bir.b($$3);
      }
   }
}
