public class cto extends cuj {
   public cto(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqq a(cyd $$0) {
      dcu $$1 = $$0.q();
      jd $$2 = $$0.a();
      dta $$3 = $$1.a_($$2);
      if (!$$3.a(dfy.fy) || $$3.c(dil.c)) {
         return bqq.e;
      } else if ($$1.B) {
         return bqq.a;
      } else {
         dta $$4 = $$3.a(dil.c, Boolean.valueOf(true));
         dfw.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dfy.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dtf.b $$5 = dil.b().a($$1, $$2);
         if ($$5 != null) {
            jd $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dfy.fx.o(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bqq.c;
      }
   }

   @Override
   public int a(cuo $$0, btl $$1) {
      return 0;
   }

   @Override
   public bqr<cuo> a(dcu $$0, cmv $$1, bqp $$2) {
      cuo $$3 = $$1.b($$2);
      ews $$4 = a($$0, $$1, dcd.b.a);
      if ($$4.c() == ewu.a.b && $$0.a_($$4.a()).a(dfy.fy)) {
         return bqr.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof aqt $$5) {
            jd $$6 = $$5.a(awp.a, $$1.dq(), 100, false);
            if ($$6 != null) {
               cng $$7 = new cng($$0, $$1.dv(), $$1.e(0.5), $$1.dB());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dxw.K, $$7.do(), dxw.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof aqu $$8) {
                  an.n.a($$8, $$6);
               }

               float $$9 = ayn.i($$0.z.i(), 0.33F, 0.5F);
               $$0.a(null, $$1.dv(), $$1.dx(), $$1.dB(), avo.ii, avp.g, 1.0F, $$9);
               $$3.a(1, $$1);
               $$1.b(avy.c.b(this));
               $$1.a($$2, true);
               return bqr.a($$3);
            }
         }

         return bqr.b($$3);
      }
   }
}
