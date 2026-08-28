import javax.annotation.Nullable;

public class csa extends ctv {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public csa(ctv.a $$0) {
      super($$0);
   }

   @Override
   public bqd a(cxm $$0) {
      dcd $$1 = $$0.q();
      ja $$2 = $$0.a();
      ja $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.B) {
            $$0.o().a(dxa.C);
            $$1.c(1505, $$2, 15);
         }

         return bqd.a($$1.B);
      } else {
         dsh $$4 = $$1.a_($$2);
         boolean $$5 = $$4.d($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
               $$0.o().a(dxa.C);
               $$1.c(1505, $$3, 15);
            }

            return bqd.a($$1.B);
         } else {
            return bqd.e;
         }
      }
   }

   public static boolean a(cua $$0, dcd $$1, ja $$2) {
      dsh $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dfi $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof aqk) {
            if ($$4.a($$1, $$1.z, $$2, $$3)) {
               $$4.a((aqk)$$1, $$1.z, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cua $$0, dcd $$1, ja $$2, @Nullable jf $$3) {
      if ($$1.a_($$2).a(dfh.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof aqk)) {
            return true;
         } else {
            aym $$4 = $$1.E_();

            label78:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               ja $$6 = $$2;
               dsh $$7 = dfh.bw.o();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).r($$1, $$6)) {
                     continue label78;
                  }
               }

               jj<ddd> $$9 = $$1.t($$6);
               if ($$9.a(avt.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = lq.e.a(avu.ar, $$1.z).map($$0x -> ((dff)$$0x.a()).o()).orElse($$7);
                     if ($$7.b(deq.c)) {
                        $$7 = $$7.a(deq.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = lq.e.a(avu.ap, $$1.z).map($$0x -> ((dff)$$0x.a()).o()).orElse($$7);
                  }
               }

               if ($$7.a(avu.ar, $$0x -> $$0x.b(deq.c))) {
                  for (int $$10 = 0; !$$7.a((dcg)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.a(deq.c, jf.c.a.a($$4));
                  }
               }

               if ($$7.a((dcg)$$1, $$6)) {
                  dsh $$11 = $$1.a_($$6);
                  if ($$11.a(dfh.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dfh.bw) && $$4.a(10) == 0) {
                     ((dfi)dfh.bw).a((aqk)$$1, $$4, $$6, $$11);
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

   public static void a(dce $$0, ja $$1, int $$2) {
      dsh $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dfi $$4) {
         ja $$5 = $$4.a($$1);
         switch ($$4.aq_()) {
            case a:
               ayi.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, lj.O);
               break;
            case b:
               ayi.a($$0, $$5, $$2, lj.O);
         }
      } else if ($$3.a(dfh.G)) {
         ayi.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, lj.O);
      }
   }
}
