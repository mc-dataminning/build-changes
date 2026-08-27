public class ckn extends clj {
   public ckn(clj.a $$0) {
      super($$0);
   }

   @Override
   public bjb a(cny $$0) {
      csf $$1 = $$0.q();
      hx $$2 = $$0.a();
      dhn $$3 = $$1.a_($$2);
      if (!$$3.a(cvh.fy) || $$3.c(cxu.c)) {
         return bjb.d;
      } else if ($$1.B) {
         return bjb.a;
      } else {
         dhn $$4 = $$3.a(cxu.c, Boolean.valueOf(true));
         cvf.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, cvh.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dhs.b $$5 = cxu.b().a($$1, $$2);
         if ($$5 != null) {
            hx $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), cvh.fx.o(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bjb.b;
      }
   }

   @Override
   public bjc<clo> a(csf $$0, cdz $$1, bja $$2) {
      clo $$3 = $$1.b($$2);
      ejv $$4 = a($$0, $$1, cro.b.a);
      if ($$4.c() == ejx.a.b && $$0.a_($$4.a()).a(cvh.fy)) {
         return bjc.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof ami $$5) {
            hx $$6 = $$5.a(arv.a, $$1.dn(), 100, false);
            if ($$6 != null) {
               cek $$7 = new cek($$0, $$1.ds(), $$1.e(0.5), $$1.dy());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dlx.K, $$7.dl(), dlx.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof amj) {
                  al.m.a((amj)$$1, $$6);
               }

               $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), aqv.hv, aqw.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dn(), 0);
               if (!$$1.fU().d) {
                  $$3.h(1);
               }

               $$1.b(arf.c.b(this));
               $$1.a($$2, true);
               return bjc.a($$3);
            }
         }

         return bjc.b($$3);
      }
   }
}
