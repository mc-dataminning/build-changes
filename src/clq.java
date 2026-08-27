public class clq extends cmm {
   public clq(cmm.a $$0) {
      super($$0);
   }

   @Override
   public bjv a(cpc $$0) {
      cti $$1 = $$0.q();
      hx $$2 = $$0.a();
      dja $$3 = $$1.a_($$2);
      if (!$$3.a(cwl.fy) || $$3.c(cyy.c)) {
         return bjv.d;
      } else if ($$1.B) {
         return bjv.a;
      } else {
         dja $$4 = $$3.a(cyy.c, Boolean.valueOf(true));
         cwj.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, cwl.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         djf.b $$5 = cyy.b().a($$1, $$2);
         if ($$5 != null) {
            hx $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), cwl.fx.o(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bjv.b;
      }
   }

   @Override
   public bjw<cmr> a(cti $$0, cfb $$1, bju $$2) {
      cmr $$3 = $$1.b($$2);
      eli $$4 = a($$0, $$1, csr.b.a);
      if ($$4.c() == elk.a.b && $$0.a_($$4.a()).a(cwl.fy)) {
         return bjw.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof amz $$5) {
            hx $$6 = $$5.a(asm.a, $$1.dm(), 100, false);
            if ($$6 != null) {
               cfm $$7 = new cfm($$0, $$1.dr(), $$1.e(0.5), $$1.dx());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dnk.K, $$7.dk(), dnk.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof ana) {
                  am.n.a((ana)$$1, $$6);
               }

               $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), arm.hE, arn.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dm(), 0);
               if (!$$1.fT().d) {
                  $$3.h(1);
               }

               $$1.b(arw.c.b(this));
               $$1.a($$2, true);
               return bjw.a($$3);
            }
         }

         return bjw.b($$3);
      }
   }
}
