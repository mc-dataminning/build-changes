import javax.annotation.Nullable;

public class chg extends cjg {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public chg(cjg.a $$0) {
      super($$0);
   }

   @Override
   public bhe a(clv $$0) {
      cqb $$1 = $$0.q();
      gw $$2 = $$0.a();
      gw $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.B) {
            $$0.o().a(djn.C);
            $$1.c(1505, $$2, 0);
         }

         return bhe.a($$1.B);
      } else {
         dfd $$4 = $$1.a_($$2);
         boolean $$5 = $$4.d($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
               $$0.o().a(djn.C);
               $$1.c(1505, $$3, 0);
            }

            return bhe.a($$1.B);
         } else {
            return bhe.d;
         }
      }
   }

   public static boolean a(cjl $$0, cqb $$1, gw $$2) {
      dfd $$3 = $$1.a_($$2);
      if ($$3.b() instanceof ctf $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof akt) {
            if ($$4.a($$1, $$1.z, $$2, $$3)) {
               $$4.a((akt)$$1, $$1.z, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cjl $$0, cqb $$1, gw $$2, @Nullable ha $$3) {
      if ($$1.a_($$2).a(cte.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof akt)) {
            return true;
         } else {
            ash $$4 = $$1.D_();

            label78:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               gw $$6 = $$2;
               dfd $$7 = cte.bw.o();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).r($$1, $$6)) {
                     continue label78;
                  }
               }

               he<cqz> $$9 = $$1.s($$6);
               if ($$9.a(apu.ab)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = jb.f.b(apv.aq).flatMap($$1x -> $$1x.a($$1.z)).map($$0x -> ((ctc)$$0x.a()).o()).orElse($$7);
                     if ($$7.b(csn.c)) {
                        $$7 = $$7.a(csn.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = jb.f.b(apv.ao).flatMap($$1x -> $$1x.a($$1.z)).map($$0x -> ((ctc)$$0x.a()).o()).orElse($$7);
                  }
               }

               if ($$7.a(apv.aq, $$0x -> $$0x.b(csn.c))) {
                  for (int $$10 = 0; !$$7.a((cqe)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.a(csn.c, ha.c.a.a($$4));
                  }
               }

               if ($$7.a((cqe)$$1, $$6)) {
                  dfd $$11 = $$1.a_($$6);
                  if ($$11.a(cte.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(cte.bw) && $$4.a(10) == 0) {
                     ((ctf)cte.bw).a((akt)$$1, $$4, $$6, $$11);
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

   public static void a(cqc $$0, gw $$1, int $$2) {
      if ($$2 == 0) {
         $$2 = 15;
      }

      dfd $$3 = $$0.a_($$1);
      if (!$$3.i()) {
         double $$4 = 0.5;
         double $$5;
         if ($$3.a(cte.G)) {
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
         ash $$8 = $$0.D_();

         for (int $$9 = 0; $$9 < $$2; $$9++) {
            double $$10 = $$8.k() * 0.02;
            double $$11 = $$8.k() * 0.02;
            double $$12 = $$8.k() * 0.02;
            double $$13 = 0.5 - $$4;
            double $$14 = (double)$$1.u() + $$13 + $$8.j() * $$4 * 2.0;
            double $$15 = (double)$$1.v() + $$8.j() * $$5;
            double $$16 = (double)$$1.w() + $$13 + $$8.j() * $$4 * 2.0;
            if (!$$0.a_(gw.a($$14, $$15, $$16).d()).i()) {
               $$0.a(iv.K, $$14, $$15, $$16, $$10, $$11, $$12);
            }
         }
      }
   }
}
