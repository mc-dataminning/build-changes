import javax.annotation.Nullable;

public class ciw extends ckw {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public ciw(ckw.a $$0) {
      super($$0);
   }

   @Override
   public biq a(cnl $$0) {
      crs $$1 = $$0.q();
      ht $$2 = $$0.a();
      ht $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.B) {
            $$0.o().a(dlg.C);
            $$1.c(1505, $$2, 0);
         }

         return biq.a($$1.B);
      } else {
         dgw $$4 = $$1.a_($$2);
         boolean $$5 = $$4.d($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
               $$0.o().a(dlg.C);
               $$1.c(1505, $$3, 0);
            }

            return biq.a($$1.B);
         } else {
            return biq.d;
         }
      }
   }

   public static boolean a(clb $$0, crs $$1, ht $$2) {
      dgw $$3 = $$1.a_($$2);
      if ($$3.b() instanceof cuw $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof ama) {
            if ($$4.a($$1, $$1.z, $$2, $$3)) {
               $$4.a((ama)$$1, $$1.z, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(clb $$0, crs $$1, ht $$2, @Nullable hx $$3) {
      if ($$1.a_($$2).a(cuv.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof ama)) {
            return true;
         } else {
            ato $$4 = $$1.E_();

            label78:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               ht $$6 = $$2;
               dgw $$7 = cuv.bw.o();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).r($$1, $$6)) {
                     continue label78;
                  }
               }

               ib<csq> $$9 = $$1.s($$6);
               if ($$9.a(arb.ab)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = jy.f.b(arc.aq).flatMap($$1x -> $$1x.a($$1.z)).map($$0x -> ((cut)$$0x.a()).o()).orElse($$7);
                     if ($$7.b(cue.c)) {
                        $$7 = $$7.a(cue.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = jy.f.b(arc.ao).flatMap($$1x -> $$1x.a($$1.z)).map($$0x -> ((cut)$$0x.a()).o()).orElse($$7);
                  }
               }

               if ($$7.a(arc.aq, $$0x -> $$0x.b(cue.c))) {
                  for (int $$10 = 0; !$$7.a((crv)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.a(cue.c, hx.c.a.a($$4));
                  }
               }

               if ($$7.a((crv)$$1, $$6)) {
                  dgw $$11 = $$1.a_($$6);
                  if ($$11.a(cuv.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(cuv.bw) && $$4.a(10) == 0) {
                     ((cuw)cuv.bw).a((ama)$$1, $$4, $$6, $$11);
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

   public static void a(crt $$0, ht $$1, int $$2) {
      if ($$2 == 0) {
         $$2 = 15;
      }

      dgw $$3 = $$0.a_($$1);
      if (!$$3.i()) {
         double $$4 = 0.5;
         double $$5;
         if ($$3.a(cuv.G)) {
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
         ato $$8 = $$0.E_();

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
