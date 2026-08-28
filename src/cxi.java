import javax.annotation.Nullable;

public class cxi extends cyu {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cxi(cyu.a $$0) {
      super($$0);
   }

   @Override
   public bub a(dct $$0) {
      div $$1 = $$0.q();
      iu $$2 = $$0.a();
      iu $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.C) {
            $$0.o().a(eez.C);
            $$1.c(1505, $$2, 15);
         }

         return bub.a;
      } else {
         dzz $$4 = $$1.a_($$2);
         boolean $$5 = $$4.c($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.C) {
               $$0.o().a(eez.C);
               $$1.c(1505, $$3, 15);
            }

            return bub.a;
         } else {
            return bub.e;
         }
      }
   }

   public static boolean a(cyy $$0, div $$1, iu $$2) {
      dzz $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dmd $$4 && $$4.a($$1, $$2, $$3)) {
         if ($$1 instanceof arq) {
            if ($$4.a($$1, $$1.A, $$2, $$3)) {
               $$4.a((arq)$$1, $$1.A, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cyy $$0, div $$1, iu $$2, @Nullable ja $$3) {
      if ($$1.a_($$2).a(dmc.J) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof arq)) {
            return true;
         } else {
            azv $$4 = $$1.C_();

            label80:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               iu $$6 = $$2;
               dzz $$7 = dmc.bE.m();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).m($$1, $$6)) {
                     continue label80;
                  }
               }

               je<djy> $$9 = $$1.u($$6);
               if ($$9.a(axb.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = mf.e.a(axc.au, $$1.A).map($$0x -> ((dma)$$0x.a()).m()).orElse($$7);
                     if ($$7.b(dll.d)) {
                        $$7 = $$7.b(dll.d, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = mf.e.a(axc.as, $$1.A).map($$0x -> ((dma)$$0x.a()).m()).orElse($$7);
                  }
               }

               if ($$7.a(axc.au, $$0x -> $$0x.b(dll.d))) {
                  for (int $$10 = 0; !$$7.a((diy)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.b(dll.d, ja.c.a.a($$4));
                  }
               }

               if ($$7.a((diy)$$1, $$6)) {
                  dzz $$11 = $$1.a_($$6);
                  if ($$11.a(dmc.J) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dmc.bE) && ((dmd)dmc.bE).a($$1, $$6, $$11) && $$4.a(10) == 0) {
                     ((dmd)dmc.bE).a((arq)$$1, $$4, $$6, $$11);
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

   public static void a(diw $$0, iu $$1, int $$2) {
      dzz $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dmd $$4) {
         iu $$5 = $$4.a($$1);
         switch ($$4.am_()) {
            case a:
               azq.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, lx.Q);
               break;
            case b:
               azq.a($$0, $$5, $$2, lx.Q);
         }
      } else if ($$3.a(dmc.J)) {
         azq.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, lx.Q);
      }
   }
}
