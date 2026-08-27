import javax.annotation.Nullable;

public class cgt extends cit {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cgt(cit.a $$0) {
      super($$0);
   }

   @Override
   public bgq a(cli $$0) {
      cpm $$1 = $$0.q();
      gu $$2 = $$0.a();
      gu $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.B) {
            $$0.o().a(djk.C);
            $$1.c(1505, $$2, 0);
         }

         return bgq.a($$1.B);
      } else {
         dfa $$4 = $$1.a_($$2);
         boolean $$5 = $$4.d($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
               $$0.o().a(djk.C);
               $$1.c(1505, $$3, 0);
            }

            return bgq.a($$1.B);
         } else {
            return bgq.d;
         }
      }
   }

   public static boolean a(ciy $$0, cpm $$1, gu $$2) {
      dfa $$3 = $$1.a_($$2);
      if ($$3.b() instanceof cso $$4 && $$4.a($$1, $$2, $$3)) {
         if ($$1 instanceof akk) {
            if ($$4.a($$1, $$1.z, $$2, $$3)) {
               $$4.a((akk)$$1, $$1.z, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(ciy $$0, cpm $$1, gu $$2, @Nullable ha $$3) {
      if ($$1.a_($$2).a(csn.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof akk)) {
            return true;
         } else {
            aru $$4 = $$1.y_();

            label78:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               gu $$6 = $$2;
               dfa $$7 = csn.bw.n();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).r($$1, $$6)) {
                     continue label78;
                  }
               }

               he<cqk> $$9 = $$1.s($$6);
               if ($$9.a(apk.ab)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = jb.f.b(apl.aq).flatMap($$1x -> $$1x.a($$1.z)).map($$0x -> ((csm)$$0x.a()).n()).orElse($$7);
                     if ($$7.b(cry.a)) {
                        $$7 = $$7.a(cry.a, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = jb.f.b(apl.ao).flatMap($$1x -> $$1x.a($$1.z)).map($$0x -> ((csm)$$0x.a()).n()).orElse($$7);
                  }
               }

               if ($$7.a(apl.aq, $$0x -> $$0x.b(cry.a))) {
                  for (int $$10 = 0; !$$7.a((cpp)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.a(cry.a, ha.c.a.a($$4));
                  }
               }

               if ($$7.a((cpp)$$1, $$6)) {
                  dfa $$11 = $$1.a_($$6);
                  if ($$11.a(csn.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(csn.bw) && $$4.a(10) == 0) {
                     ((cso)csn.bw).a((akk)$$1, $$4, $$6, $$11);
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

   public static void a(cpn $$0, gu $$1, int $$2) {
      if ($$2 == 0) {
         $$2 = 15;
      }

      dfa $$3 = $$0.a_($$1);
      if (!$$3.i()) {
         double $$4 = 0.5;
         double $$5;
         if ($$3.a(csn.G)) {
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
         aru $$8 = $$0.y_();

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
