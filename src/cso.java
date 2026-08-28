import javax.annotation.Nullable;

public class cso extends cuj {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cso(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqt a(cyb $$0) {
      dbx $$1 = $$0.q();
      iz $$2 = $$0.a();
      iz $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.B) {
            $$0.o().a(dwu.C);
            $$1.c(1505, $$2, 15);
         }

         return bqt.a($$1.B);
      } else {
         dsb $$4 = $$1.a_($$2);
         boolean $$5 = $$4.d($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
               $$0.o().a(dwu.C);
               $$1.c(1505, $$3, 15);
            }

            return bqt.a($$1.B);
         } else {
            return bqt.e;
         }
      }
   }

   public static boolean a(cuo $$0, dbx $$1, iz $$2) {
      dsb $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dfb $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof are) {
            if ($$4.a($$1, $$1.z, $$2, $$3)) {
               $$4.a((are)$$1, $$1.z, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cuo $$0, dbx $$1, iz $$2, @Nullable je $$3) {
      if ($$1.a_($$2).a(dfa.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof are)) {
            return true;
         } else {
            azg $$4 = $$1.E_();

            label78:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               iz $$6 = $$2;
               dsb $$7 = dfa.bw.o();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).r($$1, $$6)) {
                     continue label78;
                  }
               }

               ji<dcw> $$9 = $$1.t($$6);
               if ($$9.a(awn.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = lp.e.a(awo.ar, $$1.z).map($$0x -> ((dey)$$0x.a()).o()).orElse($$7);
                     if ($$7.b(dej.c)) {
                        $$7 = $$7.a(dej.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = lp.e.a(awo.ap, $$1.z).map($$0x -> ((dey)$$0x.a()).o()).orElse($$7);
                  }
               }

               if ($$7.a(awo.ar, $$0x -> $$0x.b(dej.c))) {
                  for (int $$10 = 0; !$$7.a((dca)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.a(dej.c, je.c.a.a($$4));
                  }
               }

               if ($$7.a((dca)$$1, $$6)) {
                  dsb $$11 = $$1.a_($$6);
                  if ($$11.a(dfa.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dfa.bw) && $$4.a(10) == 0) {
                     ((dfb)dfa.bw).a((are)$$1, $$4, $$6, $$11);
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

   public static void a(dby $$0, iz $$1, int $$2) {
      dsb $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dfb $$4) {
         iz $$5 = $$4.a($$1);
         switch ($$4.ap_()) {
            case a:
               azc.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, li.O);
               break;
            case b:
               azc.a($$0, $$5, $$2, li.O);
         }
      } else if ($$3.a(dfa.G)) {
         azc.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, li.O);
      }
   }
}
