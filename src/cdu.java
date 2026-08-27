import javax.annotation.Nullable;

public class cdu extends cfu {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cdu(cfu.a $$0) {
      super($$0);
   }

   @Override
   public bdx a(cij $$0) {
      cmm $$1 = $$0.q();
      gu $$2 = $$0.a();
      gu $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.B) {
            $$1.c(1505, $$2, 0);
         }

         return bdx.a($$1.B);
      } else {
         dcb $$4 = $$1.a_($$2);
         boolean $$5 = $$4.d($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
               $$1.c(1505, $$3, 0);
            }

            return bdx.a($$1.B);
         } else {
            return bdx.d;
         }
      }
   }

   public static boolean a(cfz $$0, cmm $$1, gu $$2) {
      dcb $$3 = $$1.a_($$2);
      if ($$3.b() instanceof cpp) {
         cpp $$4 = (cpp)$$3.b();
         if ($$4.a($$1, $$2, $$3, $$1.B)) {
            if ($$1 instanceof aif) {
               if ($$4.a($$1, $$1.z, $$2, $$3)) {
                  $$4.a((aif)$$1, $$1.z, $$2, $$3);
               }

               $$0.h(1);
            }

            return true;
         }
      }

      return false;
   }

   public static boolean a(cfz $$0, cmm $$1, gu $$2, @Nullable ha $$3) {
      if ($$1.a_($$2).a(cpo.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof aif)) {
            return true;
         } else {
            apf $$4 = $$1.y_();

            label78:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               gu $$6 = $$2;
               dcb $$7 = cpo.bw.n();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).r($$1, $$6)) {
                     continue label78;
                  }
               }

               he<cnk> $$9 = $$1.s($$6);
               if ($$9.a(amv.ab)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = jb.f.b(amw.ap).flatMap($$1x -> $$1x.a($$1.z)).map($$0x -> ((cpn)$$0x.a()).n()).orElse($$7);
                     if ($$7.b(coz.a)) {
                        $$7 = $$7.a(coz.a, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = jb.f.b(amw.an).flatMap($$1x -> $$1x.a($$1.z)).map($$0x -> ((cpn)$$0x.a()).n()).orElse($$7);
                  }
               }

               if ($$7.a(amw.ap, $$0x -> $$0x.b(coz.a))) {
                  for (int $$10 = 0; !$$7.a((cmp)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.a(coz.a, ha.c.a.a($$4));
                  }
               }

               if ($$7.a((cmp)$$1, $$6)) {
                  dcb $$11 = $$1.a_($$6);
                  if ($$11.a(cpo.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(cpo.bw) && $$4.a(10) == 0) {
                     ((cpp)cpo.bw).a((aif)$$1, $$4, $$6, $$11);
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

   public static void a(cmn $$0, gu $$1, int $$2) {
      if ($$2 == 0) {
         $$2 = 15;
      }

      dcb $$3 = $$0.a_($$1);
      if (!$$3.i()) {
         double $$4 = 0.5;
         double $$5;
         if ($$3.a(cpo.G)) {
            $$2 *= 3;
            $$5 = 1.0;
            $$4 = 3.0;
         } else if ($$3.i($$0, $$1)) {
            $$1 = $$1.c();
            $$2 *= 3;
            $$4 = 3.0;
            $$5 = 1.0;
         } else {
            $$5 = $$3.j($$0, $$1).c(ha.a.b);
         }

         $$0.a(iv.K, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
         apf $$8 = $$0.y_();

         for (int $$9 = 0; $$9 < $$2; $$9++) {
            double $$10 = $$8.k() * 0.02;
            double $$11 = $$8.k() * 0.02;
            double $$12 = $$8.k() * 0.02;
            double $$13 = 0.5 - $$4;
            double $$14 = (double)$$1.u() + $$13 + $$8.j() * $$4 * 2.0;
            double $$15 = (double)$$1.v() + $$8.j() * $$5;
            double $$16 = (double)$$1.w() + $$13 + $$8.j() * $$4 * 2.0;
            if (!$$0.a_(gu.a($$14, $$15, $$16).d()).i()) {
               $$0.a(iv.K, $$14, $$15, $$16, $$10, $$11, $$12);
            }
         }
      }
   }
}
