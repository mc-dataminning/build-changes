public class ctq extends cul {
   public ctq(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqr a(cyf $$0) {
      dcw $$1 = $$0.q();
      jd $$2 = $$0.a();
      dtc $$3 = $$1.a_($$2);
      if (!$$3.a(dga.fy) || $$3.c(din.c)) {
         return bqr.e;
      } else if ($$1.B) {
         return bqr.a;
      } else {
         dtc $$4 = $$3.a(din.c, Boolean.valueOf(true));
         dfy.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dga.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dth.b $$5 = din.b().a($$1, $$2);
         if ($$5 != null) {
            jd $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dga.fx.o(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bqr.c;
      }
   }

   @Override
   public int a(cuq $$0, btn $$1) {
      return 0;
   }

   @Override
   public bqs<cuq> a(dcw $$0, cmx $$1, bqq $$2) {
      cuq $$3 = $$1.b($$2);
      ewy $$4 = a($$0, $$1, dcf.b.a);
      if ($$4.c() == exa.a.b && $$0.a_($$4.a()).a(dga.fy)) {
         return bqs.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof aqu $$5) {
            jd $$6 = $$5.a(awq.a, $$1.do(), 100, false);
            if ($$6 != null) {
               cni $$7 = new cni($$0, $$1.dt(), $$1.e(0.5), $$1.dz());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dxz.K, $$7.dm(), dxz.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof aqv $$8) {
                  an.n.a($$8, $$6);
               }

               float $$9 = ayo.i($$0.z.i(), 0.33F, 0.5F);
               $$0.a(null, $$1.dt(), $$1.dv(), $$1.dz(), avp.ii, avq.g, 1.0F, $$9);
               $$3.a(1, $$1);
               $$1.b(avz.c.b(this));
               $$1.a($$2, true);
               return bqs.a($$3);
            }
         }

         return bqs.b($$3);
      }
   }
}
