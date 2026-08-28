import javax.annotation.Nullable;

public class csr extends cum {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public csr(cum.a $$0) {
      super($$0);
   }

   @Override
   public bqw a(cye $$0) {
      dca $$1 = $$0.q();
      iz $$2 = $$0.a();
      iz $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.B) {
            $$0.o().a(dwx.C);
            $$1.c(1505, $$2, 15);
         }

         return bqw.a($$1.B);
      } else {
         dse $$4 = $$1.a_($$2);
         boolean $$5 = $$4.d($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
               $$0.o().a(dwx.C);
               $$1.c(1505, $$3, 15);
            }

            return bqw.a($$1.B);
         } else {
            return bqw.e;
         }
      }
   }

   public static boolean a(cur $$0, dca $$1, iz $$2) {
      dse $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dfe $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof arf) {
            if ($$4.a($$1, $$1.z, $$2, $$3)) {
               $$4.a((arf)$$1, $$1.z, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cur $$0, dca $$1, iz $$2, @Nullable je $$3) {
      if ($$1.a_($$2).a(dfd.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof arf)) {
            return true;
         } else {
            azh $$4 = $$1.E_();

            label78:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               iz $$6 = $$2;
               dse $$7 = dfd.bw.o();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).r($$1, $$6)) {
                     continue label78;
                  }
               }

               ji<dcz> $$9 = $$1.t($$6);
               if ($$9.a(awo.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = lp.e.a(awp.ar, $$1.z).map($$0x -> ((dfb)$$0x.a()).o()).orElse($$7);
                     if ($$7.b(dem.c)) {
                        $$7 = $$7.a(dem.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = lp.e.a(awp.ap, $$1.z).map($$0x -> ((dfb)$$0x.a()).o()).orElse($$7);
                  }
               }

               if ($$7.a(awp.ar, $$0x -> $$0x.b(dem.c))) {
                  for (int $$10 = 0; !$$7.a((dcd)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.a(dem.c, je.c.a.a($$4));
                  }
               }

               if ($$7.a((dcd)$$1, $$6)) {
                  dse $$11 = $$1.a_($$6);
                  if ($$11.a(dfd.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dfd.bw) && $$4.a(10) == 0) {
                     ((dfe)dfd.bw).a((arf)$$1, $$4, $$6, $$11);
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

   public static void a(dcb $$0, iz $$1, int $$2) {
      dse $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dfe $$4) {
         iz $$5 = $$4.a($$1);
         switch ($$4.ap_()) {
            case a:
               azd.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, li.O);
               break;
            case b:
               azd.a($$0, $$5, $$2, li.O);
         }
      } else if ($$3.a(dfd.G)) {
         azd.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, li.O);
      }
   }
}
