import javax.annotation.Nullable;

public class cse extends cty {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cse(cty.a $$0) {
      super($$0);
   }

   @Override
   public bqh a(cxp $$0) {
      dcg $$1 = $$0.q();
      ja $$2 = $$0.a();
      ja $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.B) {
            $$0.o().a(dxh.C);
            $$1.c(1505, $$2, 15);
         }

         return bqh.a($$1.B);
      } else {
         dsl $$4 = $$1.a_($$2);
         boolean $$5 = $$4.d($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
               $$0.o().a(dxh.C);
               $$1.c(1505, $$3, 15);
            }

            return bqh.a($$1.B);
         } else {
            return bqh.e;
         }
      }
   }

   public static boolean a(cud $$0, dcg $$1, ja $$2) {
      dsl $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dfl $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof aqm) {
            if ($$4.a($$1, $$1.z, $$2, $$3)) {
               $$4.a((aqm)$$1, $$1.z, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cud $$0, dcg $$1, ja $$2, @Nullable jf $$3) {
      if ($$1.a_($$2).a(dfk.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof aqm)) {
            return true;
         } else {
            ayo $$4 = $$1.E_();

            label78:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               ja $$6 = $$2;
               dsl $$7 = dfk.bw.o();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).r($$1, $$6)) {
                     continue label78;
                  }
               }

               jj<ddg> $$9 = $$1.t($$6);
               if ($$9.a(avv.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = lq.e.a(avw.ar, $$1.z).map($$0x -> ((dfi)$$0x.a()).o()).orElse($$7);
                     if ($$7.b(det.c)) {
                        $$7 = $$7.a(det.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = lq.e.a(avw.ap, $$1.z).map($$0x -> ((dfi)$$0x.a()).o()).orElse($$7);
                  }
               }

               if ($$7.a(avw.ar, $$0x -> $$0x.b(det.c))) {
                  for (int $$10 = 0; !$$7.a((dcj)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.a(det.c, jf.c.a.a($$4));
                  }
               }

               if ($$7.a((dcj)$$1, $$6)) {
                  dsl $$11 = $$1.a_($$6);
                  if ($$11.a(dfk.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dfk.bw) && $$4.a(10) == 0) {
                     ((dfl)dfk.bw).a((aqm)$$1, $$4, $$6, $$11);
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

   public static void a(dch $$0, ja $$1, int $$2) {
      dsl $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dfl $$4) {
         ja $$5 = $$4.a($$1);
         switch ($$4.aq_()) {
            case a:
               ayk.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, lj.O);
               break;
            case b:
               ayk.a($$0, $$5, $$2, lj.O);
         }
      } else if ($$3.a(dfk.G)) {
         ayk.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, lj.O);
      }
   }
}
