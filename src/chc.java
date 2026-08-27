import javax.annotation.Nullable;

public class chc extends cjc {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public chc(cjc.a $$0) {
      super($$0);
   }

   @Override
   public bha a(clr $$0) {
      cpx $$1 = $$0.q();
      gw $$2 = $$0.a();
      gw $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.B) {
            $$0.o().a(djv.C);
            $$1.c(1505, $$2, 0);
         }

         return bha.a($$1.B);
      } else {
         dfl $$4 = $$1.a_($$2);
         boolean $$5 = $$4.d($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
               $$0.o().a(djv.C);
               $$1.c(1505, $$3, 0);
            }

            return bha.a($$1.B);
         } else {
            return bha.d;
         }
      }
   }

   public static boolean a(cjh $$0, cpx $$1, gw $$2) {
      dfl $$3 = $$1.a_($$2);
      if ($$3.b() instanceof csz $$4 && $$4.a($$1, $$2, $$3)) {
         if ($$1 instanceof aks) {
            if ($$4.a($$1, $$1.z, $$2, $$3)) {
               $$4.a((aks)$$1, $$1.z, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cjh $$0, cpx $$1, gw $$2, @Nullable hc $$3) {
      if ($$1.a_($$2).a(csy.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof aks)) {
            return true;
         } else {
            ase $$4 = $$1.D_();

            label78:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               gw $$6 = $$2;
               dfl $$7 = csy.bw.n();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).r($$1, $$6)) {
                     continue label78;
                  }
               }

               hg<cqv> $$9 = $$1.s($$6);
               if ($$9.a(apt.ab)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = jd.f.b(apu.aq).flatMap($$1x -> $$1x.a($$1.z)).map($$0x -> ((csx)$$0x.a()).n()).orElse($$7);
                     if ($$7.b(csj.a)) {
                        $$7 = $$7.a(csj.a, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = jd.f.b(apu.ao).flatMap($$1x -> $$1x.a($$1.z)).map($$0x -> ((csx)$$0x.a()).n()).orElse($$7);
                  }
               }

               if ($$7.a(apu.aq, $$0x -> $$0x.b(csj.a))) {
                  for (int $$10 = 0; !$$7.a((cqa)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.a(csj.a, hc.c.a.a($$4));
                  }
               }

               if ($$7.a((cqa)$$1, $$6)) {
                  dfl $$11 = $$1.a_($$6);
                  if ($$11.a(csy.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(csy.bw) && $$4.a(10) == 0) {
                     ((csz)csy.bw).a((aks)$$1, $$4, $$6, $$11);
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

   public static void a(cpy $$0, gw $$1, int $$2) {
      if ($$2 == 0) {
         $$2 = 15;
      }

      dfl $$3 = $$0.a_($$1);
      if (!$$3.i()) {
         double $$4 = 0.5;
         double $$5;
         if ($$3.a(csy.G)) {
            $$2 *= 3;
            $$5 = 1.0;
            $$4 = 3.0;
         } else if ($$3.i($$0, $$1)) {
            $$1 = $$1.c();
            $$2 *= 3;
            $$4 = 3.0;
            $$5 = 1.0;
         } else {
            $$5 = $$3.j($$0, $$1).c(hc.a.b);
         }

         $$0.a(ix.K, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
         ase $$8 = $$0.D_();

         for (int $$9 = 0; $$9 < $$2; $$9++) {
            double $$10 = $$8.k() * 0.02;
            double $$11 = $$8.k() * 0.02;
            double $$12 = $$8.k() * 0.02;
            double $$13 = 0.5 - $$4;
            double $$14 = (double)$$1.u() + $$13 + $$8.j() * $$4 * 2.0;
            double $$15 = (double)$$1.v() + $$8.j() * $$5;
            double $$16 = (double)$$1.w() + $$13 + $$8.j() * $$4 * 2.0;
            if (!$$0.a_(gw.a($$14, $$15, $$16).d()).i()) {
               $$0.a(ix.K, $$14, $$15, $$16, $$10, $$11, $$12);
            }
         }
      }
   }
}
