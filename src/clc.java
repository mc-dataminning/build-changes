import javax.annotation.Nullable;

public class clc extends cnb {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public clc(cnb.a $$0) {
      super($$0);
   }

   @Override
   public bkc a(cpr $$0) {
      ctx $$1 = $$0.q();
      hx $$2 = $$0.a();
      hx $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.B) {
            $$0.o().b(dnz.C);
            $$1.c(1505, $$2, 15);
         }

         return bkc.a($$1.B);
      } else {
         djp $$4 = $$1.a_($$2);
         boolean $$5 = $$4.d($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
               $$0.o().b(dnz.C);
               $$1.c(1505, $$3, 15);
            }

            return bkc.a($$1.B);
         } else {
            return bkc.d;
         }
      }
   }

   public static boolean a(cng $$0, ctx $$1, hx $$2) {
      djp $$3 = $$1.a_($$2);
      if ($$3.b() instanceof cxb $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof ane) {
            if ($$4.a($$1, $$1.z, $$2, $$3)) {
               $$4.a((ane)$$1, $$1.z, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cng $$0, ctx $$1, hx $$2, @Nullable ic $$3) {
      if ($$1.a_($$2).a(cxa.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof ane)) {
            return true;
         } else {
            auw $$4 = $$1.F_();

            label78:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               hx $$6 = $$2;
               djp $$7 = cxa.bw.o();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).r($$1, $$6)) {
                     continue label78;
                  }
               }

               ih<cuw> $$9 = $$1.t($$6);
               if ($$9.a(ash.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = kd.e.b(asi.aq).flatMap($$1x -> $$1x.a($$1.z)).map($$0x -> ((cwy)$$0x.a()).o()).orElse($$7);
                     if ($$7.b(cwj.c)) {
                        $$7 = $$7.a(cwj.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = kd.e.b(asi.ao).flatMap($$1x -> $$1x.a($$1.z)).map($$0x -> ((cwy)$$0x.a()).o()).orElse($$7);
                  }
               }

               if ($$7.a(asi.aq, $$0x -> $$0x.b(cwj.c))) {
                  for (int $$10 = 0; !$$7.a((cua)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.a(cwj.c, ic.c.a.a($$4));
                  }
               }

               if ($$7.a((cua)$$1, $$6)) {
                  djp $$11 = $$1.a_($$6);
                  if ($$11.a(cxa.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(cxa.bw) && $$4.a(10) == 0) {
                     ((cxb)cxa.bw).a((ane)$$1, $$4, $$6, $$11);
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

   public static void a(cty $$0, hx $$1, int $$2) {
      if ($$0.a_($$1).b() instanceof cxb $$3) {
         hx $$4 = $$3.a($$1);
         switch ($$3.av_()) {
            case a:
               aus.a($$0, $$4, $$2 * 3, 3.0, 1.0, false, jx.M);
               break;
            case b:
               aus.a($$0, $$4, $$2, jx.M);
         }
      }
   }
}
