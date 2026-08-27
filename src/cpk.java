public class cpk extends cqf {
   public cpk(cqf.a $$0) {
      super($$0);
   }

   @Override
   public bnc a(csu $$0) {
      cwz $$1 = $$0.q();
      ib $$2 = $$0.a();
      dmz $$3 = $$1.a_($$2);
      if (!$$3.a(dac.fy) || $$3.c(dcp.c)) {
         return bnc.d;
      } else if ($$1.B) {
         return bnc.a;
      } else {
         dmz $$4 = $$3.a(dcp.c, Boolean.valueOf(true));
         daa.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dac.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dne.b $$5 = dcp.b().a($$1, $$2);
         if ($$5 != null) {
            ib $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dac.fx.o(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bnc.b;
      }
   }

   @Override
   public bnd<cqk> a(cwz $$0, cis $$1, bnb $$2) {
      cqk $$3 = $$1.b($$2);
      epn $$4 = a($$0, $$1, cwi.b.a);
      if ($$4.c() == epp.a.b && $$0.a_($$4.a()).a(dac.fy)) {
         return bnd.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof apf $$5) {
            ib $$6 = $$5.a(auz.a, $$1.dm(), 100, false);
            if ($$6 != null) {
               cjd $$7 = new cjd($$0, $$1.dr(), $$1.e(0.5), $$1.dx());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(drn.K, $$7.dk(), drn.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof apg) {
                  am.n.a((apg)$$1, $$6);
               }

               $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), aty.hX, atz.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dm(), 0);
               $$3.a(1, $$1);
               $$1.b(aui.c.b(this));
               $$1.a($$2, true);
               return bnd.a($$3);
            }
         }

         return bnd.b($$3);
      }
   }
}
