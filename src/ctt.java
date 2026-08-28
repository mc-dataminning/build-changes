import javax.annotation.Nullable;

public class ctt extends cvk {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public ctt(cvk.a $$0) {
      super($$0);
   }

   @Override
   public brp a(czm $$0) {
      deg $$1 = $$0.q();
      je $$2 = $$0.a();
      je $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.B) {
            $$0.o().a(dzl.C);
            $$1.c(1505, $$2, 15);
         }

         return brp.a;
      } else {
         duo $$4 = $$1.a_($$2);
         boolean $$5 = $$4.c($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
               $$0.o().a(dzl.C);
               $$1.c(1505, $$3, 15);
            }

            return brp.a;
         } else {
            return brp.e;
         }
      }
   }

   public static boolean a(cvp $$0, deg $$1, je $$2) {
      duo $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dhm $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof arh) {
            if ($$4.a($$1, $$1.z, $$2, $$3)) {
               $$4.a((arh)$$1, $$1.z, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cvp $$0, deg $$1, je $$2, @Nullable jj $$3) {
      if ($$1.a_($$2).a(dhl.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof arh)) {
            return true;
         } else {
            azl $$4 = $$1.C_();

            label78:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               je $$6 = $$2;
               duo $$7 = dhl.bw.o();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).m($$1, $$6)) {
                     continue label78;
                  }
               }

               jn<dfh> $$9 = $$1.t($$6);
               if ($$9.a(aws.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = lu.e.a(awt.as, $$1.z).map($$0x -> ((dhj)$$0x.a()).o()).orElse($$7);
                     if ($$7.b(dgu.c)) {
                        $$7 = $$7.b(dgu.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = lu.e.a(awt.aq, $$1.z).map($$0x -> ((dhj)$$0x.a()).o()).orElse($$7);
                  }
               }

               if ($$7.a(awt.as, $$0x -> $$0x.b(dgu.c))) {
                  for (int $$10 = 0; !$$7.a((dej)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.b(dgu.c, jj.c.a.a($$4));
                  }
               }

               if ($$7.a((dej)$$1, $$6)) {
                  duo $$11 = $$1.a_($$6);
                  if ($$11.a(dhl.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dhl.bw) && $$4.a(10) == 0) {
                     ((dhm)dhl.bw).a((arh)$$1, $$4, $$6, $$11);
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

   public static void a(deh $$0, je $$1, int $$2) {
      duo $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dhm $$4) {
         je $$5 = $$4.a($$1);
         switch ($$4.ar_()) {
            case a:
               azh.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, ln.O);
               break;
            case b:
               azh.a($$0, $$5, $$2, ln.O);
         }
      } else if ($$3.a(dhl.G)) {
         azh.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, ln.O);
      }
   }
}
