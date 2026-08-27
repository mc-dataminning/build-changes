public class coc extends coy {
   public coc(coy.a $$0) {
      super($$0);
   }

   @Override
   public blw a(crm $$0) {
      cvr $$1 = $$0.q();
      hz $$2 = $$0.a();
      dlj $$3 = $$1.a_($$2);
      if (!$$3.a(cyu.fy) || $$3.c(dbh.c)) {
         return blw.d;
      } else if ($$1.B) {
         return blw.a;
      } else {
         dlj $$4 = $$3.a(dbh.c, Boolean.valueOf(true));
         cys.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, cyu.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dlo.b $$5 = dbh.b().a($$1, $$2);
         if ($$5 != null) {
            hz $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), cyu.fx.o(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return blw.b;
      }
   }

   @Override
   public blx<cpd> a(cvr $$0, chl $$1, blv $$2) {
      cpd $$3 = $$1.b($$2);
      env $$4 = a($$0, $$1, cva.b.a);
      if ($$4.c() == enx.a.b && $$0.a_($$4.a()).a(cyu.fy)) {
         return blx.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof aow $$5) {
            hz $$6 = $$5.a(aul.a, $$1.dm(), 100, false);
            if ($$6 != null) {
               chw $$7 = new chw($$0, $$1.dr(), $$1.e(0.5), $$1.dx());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dpw.K, $$7.dk(), dpw.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof aox) {
                  am.n.a((aox)$$1, $$6);
               }

               $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), atl.hU, atm.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dm(), 0);
               if (!$$1.fU().d) {
                  $$3.h(1);
               }

               $$1.b(atv.c.b(this));
               $$1.a($$2, true);
               return blx.a($$3);
            }
         }

         return blx.b($$3);
      }
   }
}
