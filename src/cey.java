public class cey extends cfu {
   public cey(cfu.a $$0) {
      super($$0);
   }

   @Override
   public bdx a(cij $$0) {
      cmm $$1 = $$0.q();
      gu $$2 = $$0.a();
      dcb $$3 = $$1.a_($$2);
      if (!$$3.a(cpo.fy) || $$3.c(cry.b)) {
         return bdx.d;
      } else if ($$1.B) {
         return bdx.a;
      } else {
         dcb $$4 = $$3.a(cry.b, Boolean.valueOf(true));
         cpn.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, cpo.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dcg.b $$5 = cry.a().a($$1, $$2);
         if ($$5 != null) {
            gu $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), cpo.fx.n(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bdx.b;
      }
   }

   @Override
   public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
      cfz $$3 = $$1.b($$2);
      eee $$4 = a($$0, $$1, clv.b.a);
      if ($$4.c() == eeg.a.b && $$0.a_($$4.a()).a(cpo.fy)) {
         return bdy.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof aif $$5) {
            gu $$6 = $$5.a(anh.a, $$1.di(), 100, false);
            if ($$6 != null) {
               byz $$7 = new byz($$0, $$1.dn(), $$1.e(0.5), $$1.dt());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dgl.L, $$7.dg(), dgl.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof aig) {
                  ai.m.a((aig)$$1, $$6);
               }

               $$0.a(null, $$1.dn(), $$1.dp(), $$1.dt(), amh.hb, ami.g, 0.5F, 0.4F / ($$0.y_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.di(), 0);
               if (!$$1.fO().d) {
                  $$3.h(1);
               }

               $$1.b(amr.c.b(this));
               $$1.a($$2, true);
               return bdy.a($$3);
            }
         }

         return bdy.b($$3);
      }
   }
}
