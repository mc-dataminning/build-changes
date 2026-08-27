import javax.annotation.Nullable;

public class cje extends cle {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cje(cle.a $$0) {
      super($$0);
   }

   @Override
   public bix a(cnt $$0) {
      csa $$1 = $$0.q();
      ht $$2 = $$0.a();
      ht $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.B) {
            $$0.o().a(dls.C);
            $$1.c(1505, $$2, 0);
         }

         return bix.a($$1.B);
      } else {
         dhi $$4 = $$1.a_($$2);
         boolean $$5 = $$4.d($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
               $$0.o().a(dls.C);
               $$1.c(1505, $$3, 0);
            }

            return bix.a($$1.B);
         } else {
            return bix.d;
         }
      }
   }

   public static boolean a(clj $$0, csa $$1, ht $$2) {
      dhi $$3 = $$1.a_($$2);
      if ($$3.b() instanceof cvd $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof ame) {
            if ($$4.a($$1, $$1.z, $$2, $$3)) {
               $$4.a((ame)$$1, $$1.z, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(clj $$0, csa $$1, ht $$2, @Nullable hx $$3) {
      if ($$1.a_($$2).a(cvc.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof ame)) {
            return true;
         } else {
            ats $$4 = $$1.E_();

            label78:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               ht $$6 = $$2;
               dhi $$7 = cvc.bw.o();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).r($$1, $$6)) {
                     continue label78;
                  }
               }

               ib<csy> $$9 = $$1.s($$6);
               if ($$9.a(arf.ab)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = jy.f.b(arg.aq).flatMap($$1x -> $$1x.a($$1.z)).map($$0x -> ((cva)$$0x.a()).o()).orElse($$7);
                     if ($$7.b(cul.c)) {
                        $$7 = $$7.a(cul.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = jy.f.b(arg.ao).flatMap($$1x -> $$1x.a($$1.z)).map($$0x -> ((cva)$$0x.a()).o()).orElse($$7);
                  }
               }

               if ($$7.a(arg.aq, $$0x -> $$0x.b(cul.c))) {
                  for (int $$10 = 0; !$$7.a((csd)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.a(cul.c, hx.c.a.a($$4));
                  }
               }

               if ($$7.a((csd)$$1, $$6)) {
                  dhi $$11 = $$1.a_($$6);
                  if ($$11.a(cvc.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(cvc.bw) && $$4.a(10) == 0) {
                     ((cvd)cvc.bw).a((ame)$$1, $$4, $$6, $$11);
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

   public static void a(csb $$0, ht $$1, int $$2) {
      if ($$2 == 0) {
         $$2 = 15;
      }

      dhi $$3 = $$0.a_($$1);
      if (!$$3.i()) {
         double $$4 = 0.5;
         double $$5;
         if ($$3.a(cvc.G)) {
            $$2 *= 3;
            $$5 = 1.0;
            $$4 = 3.0;
         } else if ($$3.i($$0, $$1)) {
            $$1 = $$1.c();
            $$2 *= 3;
            $$4 = 3.0;
            $$5 = 1.0;
         } else {
            $$5 = $$3.j($$0, $$1).c(hx.a.b);
         }

         $$0.a(js.K, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
         ats $$8 = $$0.E_();

         for (int $$9 = 0; $$9 < $$2; $$9++) {
            double $$10 = $$8.k() * 0.02;
            double $$11 = $$8.k() * 0.02;
            double $$12 = $$8.k() * 0.02;
            double $$13 = 0.5 - $$4;
            double $$14 = (double)$$1.u() + $$13 + $$8.j() * $$4 * 2.0;
            double $$15 = (double)$$1.v() + $$8.j() * $$5;
            double $$16 = (double)$$1.w() + $$13 + $$8.j() * $$4 * 2.0;
            if (!$$0.a_(ht.a($$14, $$15, $$16).d()).i()) {
               $$0.a(js.K, $$14, $$15, $$16, $$10, $$11, $$12);
            }
         }
      }
   }
}
