public class crd extends cry {
   public crd(cry.a $$0) {
      super($$0);
   }

   @Override
   public boq a(cvn $$0) {
      czu $$1 = $$0.q();
      im $$2 = $$0.a();
      dpy $$3 = $$1.a_($$2);
      if (!$$3.a(dcx.fy) || $$3.c(dfk.c)) {
         return boq.d;
      } else if ($$1.B) {
         return boq.a;
      } else {
         dpy $$4 = $$3.a(dfk.c, Boolean.valueOf(true));
         dcv.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dcx.fy);
         $$0.n().g(1);
         $$1.c(1503, $$2, 0);
         dqd.b $$5 = dfk.b().a($$1, $$2);
         if ($$5 != null) {
            im $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dcx.fx.n(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return boq.b;
      }
   }

   @Override
   public int b(csd $$0) {
      return 0;
   }

   @Override
   public bor<csd> a(czu $$0, ckl $$1, bop $$2) {
      csd $$3 = $$1.b($$2);
      etb $$4 = a($$0, $$1, czd.b.a);
      if ($$4.c() == etd.a.b && $$0.a_($$4.a()).a(dcx.fy)) {
         return bor.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof aqe $$5) {
            im $$6 = $$5.a(avz.a, $$1.dn(), 100, false);
            if ($$6 != null) {
               ckw $$7 = new ckw($$0, $$1.ds(), $$1.e(0.5), $$1.dy());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dur.K, $$7.dl(), dur.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof aqf) {
                  am.n.a((aqf)$$1, $$6);
               }

               $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), auz.id, ava.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dn(), 0);
               $$3.a(1, $$1);
               $$1.b(avj.c.b(this));
               $$1.a($$2, true);
               return bor.a($$3);
            }
         }

         return bor.b($$3);
      }
   }
}
