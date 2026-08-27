public class cig extends cjc {
   public cig(cjc.a $$0) {
      super($$0);
   }

   @Override
   public bha a(clr $$0) {
      cpx $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfl $$3 = $$1.a_($$2);
      if (!$$3.a(csy.fy) || $$3.c(cvi.b)) {
         return bha.d;
      } else if ($$1.B) {
         return bha.a;
      } else {
         dfl $$4 = $$3.a(cvi.b, Boolean.valueOf(true));
         csx.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, csy.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dfq.b $$5 = cvi.a().a($$1, $$2);
         if ($$5 != null) {
            gw $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), csy.fx.n(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bha.b;
      }
   }

   @Override
   public bhb<cjh> a(cpx $$0, cbw $$1, bgz $$2) {
      cjh $$3 = $$1.b($$2);
      ehl $$4 = a($$0, $$1, cpg.b.a);
      if ($$4.c() == ehn.a.b && $$0.a_($$4.a()).a(csy.fy)) {
         return bhb.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof aks $$5) {
            gw $$6 = $$5.a(aqf.a, $$1.dl(), 100, false);
            if ($$6 != null) {
               cch $$7 = new cch($$0, $$1.dq(), $$1.e(0.5), $$1.dw());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(djv.K, $$7.dj(), djv.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof akt) {
                  al.m.a((akt)$$1, $$6);
               }

               $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), apf.hb, apg.g, 0.5F, 0.4F / ($$0.D_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dl(), 0);
               if (!$$1.fS().d) {
                  $$3.h(1);
               }

               $$1.b(app.c.b(this));
               $$1.a($$2, true);
               return bhb.a($$3);
            }
         }

         return bhb.b($$3);
      }
   }
}
