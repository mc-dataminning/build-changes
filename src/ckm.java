import javax.annotation.Nullable;

public class ckm extends cmm {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public ckm(cmm.a $$0) {
      super($$0);
   }

   @Override
   public bjv a(cpc $$0) {
      cti $$1 = $$0.q();
      hx $$2 = $$0.a();
      hx $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.B) {
            $$0.o().a(dnk.C);
            $$1.c(1505, $$2, 0);
         }

         return bjv.a($$1.B);
      } else {
         dja $$4 = $$1.a_($$2);
         boolean $$5 = $$4.d($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
               $$0.o().a(dnk.C);
               $$1.c(1505, $$3, 0);
            }

            return bjv.a($$1.B);
         } else {
            return bjv.d;
         }
      }
   }

   public static boolean a(cmr $$0, cti $$1, hx $$2) {
      dja $$3 = $$1.a_($$2);
      if ($$3.b() instanceof cwm $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof amz) {
            if ($$4.a($$1, $$1.z, $$2, $$3)) {
               $$4.a((amz)$$1, $$1.z, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cmr $$0, cti $$1, hx $$2, @Nullable ic $$3) {
      if ($$1.a_($$2).a(cwl.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof amz)) {
            return true;
         } else {
            aup $$4 = $$1.F_();

            label78:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               hx $$6 = $$2;
               dja $$7 = cwl.bw.o();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).r($$1, $$6)) {
                     continue label78;
                  }
               }

               ih<cuh> $$9 = $$1.t($$6);
               if ($$9.a(asa.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = kd.e.b(asb.aq).flatMap($$1x -> $$1x.a($$1.z)).map($$0x -> ((cwj)$$0x.a()).o()).orElse($$7);
                     if ($$7.b(cvu.c)) {
                        $$7 = $$7.a(cvu.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = kd.e.b(asb.ao).flatMap($$1x -> $$1x.a($$1.z)).map($$0x -> ((cwj)$$0x.a()).o()).orElse($$7);
                  }
               }

               if ($$7.a(asb.aq, $$0x -> $$0x.b(cvu.c))) {
                  for (int $$10 = 0; !$$7.a((ctl)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.a(cvu.c, ic.c.a.a($$4));
                  }
               }

               if ($$7.a((ctl)$$1, $$6)) {
                  dja $$11 = $$1.a_($$6);
                  if ($$11.a(cwl.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(cwl.bw) && $$4.a(10) == 0) {
                     ((cwm)cwl.bw).a((amz)$$1, $$4, $$6, $$11);
                  }
               }
            }

            $$0.h(1);
            return true;
         }
      } else {
         return false;
      }
   }

   public static void a(ctj $$0, hx $$1, int $$2) {
      if ($$2 == 0) {
         $$2 = 15;
      }

      dja $$3 = $$0.a_($$1);
      if (!$$3.i()) {
         double $$4 = 0.5;
         double $$5;
         if ($$3.a(cwl.G)) {
            $$2 *= 3;
            $$5 = 1.0;
            $$4 = 3.0;
         } else if ($$3.i($$0, $$1)) {
            $$1 = $$1.c();
            $$2 *= 3;
            $$4 = 3.0;
            $$5 = 1.0;
         } else {
            $$5 = $$3.j($$0, $$1).c(ic.a.b);
         }

         $$0.a(jx.M, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
         aup $$8 = $$0.F_();

         for (int $$9 = 0; $$9 < $$2; $$9++) {
            double $$10 = $$8.k() * 0.02;
            double $$11 = $$8.k() * 0.02;
            double $$12 = $$8.k() * 0.02;
            double $$13 = 0.5 - $$4;
            double $$14 = (double)$$1.u() + $$13 + $$8.j() * $$4 * 2.0;
            double $$15 = (double)$$1.v() + $$8.j() * $$5;
            double $$16 = (double)$$1.w() + $$13 + $$8.j() * $$4 * 2.0;
            if (!$$0.a_(hx.a($$14, $$15, $$16).d()).i()) {
               $$0.a(jx.M, $$14, $$15, $$16, $$10, $$11, $$12);
            }
         }
      }
   }
}
