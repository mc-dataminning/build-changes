import javax.annotation.Nullable;

public class cse extends cuc {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cse(cuc.a $$0) {
      super($$0);
   }

   @Override
   public bqa a(cyf $$0) {
      dca $$1 = $$0.q();
      ir $$2 = $$0.a();
      ir $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.C) {
            $$0.o().a(dxv.C);
            $$1.c(1505, $$2, 15);
         }

         return bqa.a($$1.C);
      } else {
         dtc $$4 = $$1.a_($$2);
         boolean $$5 = $$4.d($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.C) {
               $$0.o().a(dxv.C);
               $$1.c(1505, $$3, 15);
            }

            return bqa.a($$1.C);
         } else {
            return bqa.d;
         }
      }
   }

   public static boolean a(cuh $$0, dca $$1, ir $$2) {
      dtc $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dff $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof aqt) {
            if ($$4.a($$1, $$1.A, $$2, $$3)) {
               $$4.a((aqt)$$1, $$1.A, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cuh $$0, dca $$1, ir $$2, @Nullable iw $$3) {
      if ($$1.a_($$2).a(dfe.al) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof aqt)) {
            return true;
         } else {
            ayt $$4 = $$1.F_();

            label78:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               ir $$6 = $$2;
               dtc $$7 = dfe.cg.n();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).r($$1, $$6)) {
                     continue label78;
                  }
               }

               ja<dcz> $$9 = $$1.t($$6);
               if ($$9.a(awd.ag)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = lh.e.a(awe.as, $$1.A).map($$0x -> ((dfc)$$0x.a()).n()).orElse($$7);
                     if ($$7.b(dem.c)) {
                        $$7 = $$7.a(dem.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = lh.e.a(awe.aq, $$1.A).map($$0x -> ((dfc)$$0x.a()).n()).orElse($$7);
                  }
               }

               if ($$7.a(awe.as, $$0x -> $$0x.b(dem.c))) {
                  for (int $$10 = 0; !$$7.a((dcd)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.a(dem.c, iw.c.a.a($$4));
                  }
               }

               if ($$7.a((dcd)$$1, $$6)) {
                  dtc $$11 = $$1.a_($$6);
                  if ($$11.a(dfe.al) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dfe.cg) && $$4.a(10) == 0) {
                     ((dff)dfe.cg).a((aqt)$$1, $$4, $$6, $$11);
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

   public static void a(dcb $$0, ir $$1, int $$2) {
      dtc $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dff $$4) {
         ir $$5 = $$4.a($$1);
         switch ($$4.aq_()) {
            case a:
               ayp.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, lb.M);
               break;
            case b:
               ayp.a($$0, $$5, $$2, lb.M);
         }
      } else if ($$3.a(dfe.al)) {
         ayp.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, lb.M);
      }
   }
}
