import javax.annotation.Nullable;

public class csq extends cul {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public csq(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqr a(cyf $$0) {
      dcw $$1 = $$0.q();
      jd $$2 = $$0.a();
      jd $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.B) {
            $$0.o().a(dxz.C);
            $$1.c(1505, $$2, 15);
         }

         return bqr.a($$1.B);
      } else {
         dtc $$4 = $$1.a_($$2);
         boolean $$5 = $$4.d($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
               $$0.o().a(dxz.C);
               $$1.c(1505, $$3, 15);
            }

            return bqr.a($$1.B);
         } else {
            return bqr.e;
         }
      }
   }

   public static boolean a(cuq $$0, dcw $$1, jd $$2) {
      dtc $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dgb $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof aqu) {
            if ($$4.a($$1, $$1.z, $$2, $$3)) {
               $$4.a((aqu)$$1, $$1.z, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cuq $$0, dcw $$1, jd $$2, @Nullable ji $$3) {
      if ($$1.a_($$2).a(dga.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof aqu)) {
            return true;
         } else {
            ayw $$4 = $$1.E_();

            label78:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               jd $$6 = $$2;
               dtc $$7 = dga.bw.o();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).r($$1, $$6)) {
                     continue label78;
                  }
               }

               jm<ddw> $$9 = $$1.t($$6);
               if ($$9.a(awd.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = lt.e.a(awe.ar, $$1.z).map($$0x -> ((dfy)$$0x.a()).o()).orElse($$7);
                     if ($$7.b(dfj.c)) {
                        $$7 = $$7.a(dfj.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = lt.e.a(awe.ap, $$1.z).map($$0x -> ((dfy)$$0x.a()).o()).orElse($$7);
                  }
               }

               if ($$7.a(awe.ar, $$0x -> $$0x.b(dfj.c))) {
                  for (int $$10 = 0; !$$7.a((dcz)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.a(dfj.c, ji.c.a.a($$4));
                  }
               }

               if ($$7.a((dcz)$$1, $$6)) {
                  dtc $$11 = $$1.a_($$6);
                  if ($$11.a(dga.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dga.bw) && $$4.a(10) == 0) {
                     ((dgb)dga.bw).a((aqu)$$1, $$4, $$6, $$11);
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

   public static void a(dcx $$0, jd $$1, int $$2) {
      dtc $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dgb $$4) {
         jd $$5 = $$4.a($$1);
         switch ($$4.au_()) {
            case a:
               ays.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, lm.O);
               break;
            case b:
               ays.a($$0, $$5, $$2, lm.O);
         }
      } else if ($$3.a(dga.G)) {
         ays.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, lm.O);
      }
   }
}
