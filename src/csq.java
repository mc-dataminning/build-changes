import javax.annotation.Nullable;

public class csq extends cul {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public csq(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqv a(cyd $$0) {
      dbz $$1 = $$0.q();
      iz $$2 = $$0.a();
      iz $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.B) {
            $$0.o().a(dww.C);
            $$1.c(1505, $$2, 15);
         }

         return bqv.a($$1.B);
      } else {
         dsd $$4 = $$1.a_($$2);
         boolean $$5 = $$4.d($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
               $$0.o().a(dww.C);
               $$1.c(1505, $$3, 15);
            }

            return bqv.a($$1.B);
         } else {
            return bqv.e;
         }
      }
   }

   public static boolean a(cuq $$0, dbz $$1, iz $$2) {
      dsd $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dfd $$4 && $$4.b($$1, $$2, $$3)) {
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

   public static boolean a(cuq $$0, dbz $$1, iz $$2, @Nullable je $$3) {
      if ($$1.a_($$2).a(dfc.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof arf)) {
            return true;
         } else {
            azh $$4 = $$1.E_();

            label78:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               iz $$6 = $$2;
               dsd $$7 = dfc.bw.o();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).r($$1, $$6)) {
                     continue label78;
                  }
               }

               ji<dcy> $$9 = $$1.t($$6);
               if ($$9.a(awo.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = lp.e.a(awp.ar, $$1.z).map($$0x -> ((dfa)$$0x.a()).o()).orElse($$7);
                     if ($$7.b(del.c)) {
                        $$7 = $$7.a(del.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = lp.e.a(awp.ap, $$1.z).map($$0x -> ((dfa)$$0x.a()).o()).orElse($$7);
                  }
               }

               if ($$7.a(awp.ar, $$0x -> $$0x.b(del.c))) {
                  for (int $$10 = 0; !$$7.a((dcc)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.a(del.c, je.c.a.a($$4));
                  }
               }

               if ($$7.a((dcc)$$1, $$6)) {
                  dsd $$11 = $$1.a_($$6);
                  if ($$11.a(dfc.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dfc.bw) && $$4.a(10) == 0) {
                     ((dfd)dfc.bw).a((arf)$$1, $$4, $$6, $$11);
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

   public static void a(dca $$0, iz $$1, int $$2) {
      dsd $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dfd $$4) {
         iz $$5 = $$4.a($$1);
         switch ($$4.ap_()) {
            case a:
               azd.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, li.O);
               break;
            case b:
               azd.a($$0, $$5, $$2, li.O);
         }
      } else if ($$3.a(dfc.G)) {
         azd.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, li.O);
      }
   }
}
