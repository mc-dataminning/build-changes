import javax.annotation.Nullable;

public class csk extends cuf {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public csk(cuf.a $$0) {
      super($$0);
   }

   @Override
   public bqp a(cxx $$0) {
      dbt $$1 = $$0.q();
      iz $$2 = $$0.a();
      iz $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.B) {
            $$0.o().a(dwq.C);
            $$1.c(1505, $$2, 15);
         }

         return bqp.a($$1.B);
      } else {
         drx $$4 = $$1.a_($$2);
         boolean $$5 = $$4.d($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
               $$0.o().a(dwq.C);
               $$1.c(1505, $$3, 15);
            }

            return bqp.a($$1.B);
         } else {
            return bqp.e;
         }
      }
   }

   public static boolean a(cuk $$0, dbt $$1, iz $$2) {
      drx $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dex $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof arb) {
            if ($$4.a($$1, $$1.z, $$2, $$3)) {
               $$4.a((arb)$$1, $$1.z, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cuk $$0, dbt $$1, iz $$2, @Nullable je $$3) {
      if ($$1.a_($$2).a(dew.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof arb)) {
            return true;
         } else {
            azc $$4 = $$1.E_();

            label78:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               iz $$6 = $$2;
               drx $$7 = dew.bw.n();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).r($$1, $$6)) {
                     continue label78;
                  }
               }

               ji<dcs> $$9 = $$1.t($$6);
               if ($$9.a(awk.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = lp.e.a(awl.ar, $$1.z).map($$0x -> ((deu)$$0x.a()).n()).orElse($$7);
                     if ($$7.b(def.c)) {
                        $$7 = $$7.a(def.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = lp.e.a(awl.ap, $$1.z).map($$0x -> ((deu)$$0x.a()).n()).orElse($$7);
                  }
               }

               if ($$7.a(awl.ar, $$0x -> $$0x.b(def.c))) {
                  for (int $$10 = 0; !$$7.a((dbw)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.a(def.c, je.c.a.a($$4));
                  }
               }

               if ($$7.a((dbw)$$1, $$6)) {
                  drx $$11 = $$1.a_($$6);
                  if ($$11.a(dew.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dew.bw) && $$4.a(10) == 0) {
                     ((dex)dew.bw).a((arb)$$1, $$4, $$6, $$11);
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

   public static void a(dbu $$0, iz $$1, int $$2) {
      drx $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dex $$4) {
         iz $$5 = $$4.a($$1);
         switch ($$4.ar_()) {
            case a:
               ayy.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, lj.O);
               break;
            case b:
               ayy.a($$0, $$5, $$2, lj.O);
         }
      } else if ($$3.a(dew.G)) {
         ayy.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, lj.O);
      }
   }
}
