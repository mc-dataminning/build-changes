import javax.annotation.Nullable;

public class cun extends cwb {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cun(cwb.a $$0) {
      super($$0);
   }

   @Override
   public bsh a(czy $$0) {
      dff $$1 = $$0.q();
      jh $$2 = $$0.a();
      jh $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.C) {
            $$0.o().a(eak.C);
            $$1.c(1505, $$2, 15);
         }

         return bsh.a;
      } else {
         dvo $$4 = $$1.a_($$2);
         boolean $$5 = $$4.c($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.C) {
               $$0.o().a(eak.C);
               $$1.c(1505, $$3, 15);
            }

            return bsh.a;
         } else {
            return bsh.e;
         }
      }
   }

   public static boolean a(cwf $$0, dff $$1, jh $$2) {
      dvo $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dim $$4 && $$4.b($$1, $$2, $$3)) {
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

   public static boolean a(cwf $$0, dff $$1, jh $$2, @Nullable jm $$3) {
      if ($$1.a_($$2).a(dil.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof arq)) {
            return true;
         } else {
            azv $$4 = $$1.E_();

            label80:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               jh $$6 = $$2;
               dvo $$7 = dil.bw.m();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).m($$1, $$6)) {
                     continue label80;
                  }
               }

               jq<dgh> $$9 = $$1.t($$6);
               if ($$9.a(axc.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = lz.e.a(axd.at, $$1.A).map($$0x -> ((dij)$$0x.a()).m()).orElse($$7);
                     if ($$7.b(dhu.c)) {
                        $$7 = $$7.b(dhu.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = lz.e.a(axd.ar, $$1.A).map($$0x -> ((dij)$$0x.a()).m()).orElse($$7);
                  }
               }

               if ($$7.a(axd.at, $$0x -> $$0x.b(dhu.c))) {
                  for (int $$10 = 0; !$$7.a((dfi)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.b(dhu.c, jm.c.a.a($$4));
                  }
               }

               if ($$7.a((dfi)$$1, $$6)) {
                  dvo $$11 = $$1.a_($$6);
                  if ($$11.a(dil.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dil.bw) && ((dim)dil.bw).b($$1, $$6, $$11) && $$4.a(10) == 0) {
                     ((dim)dil.bw).a((arq)$$1, $$4, $$6, $$11);
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

   public static void a(dfg $$0, jh $$1, int $$2) {
      dvo $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dim $$4) {
         jh $$5 = $$4.a($$1);
         switch ($$4.ar_()) {
            case a:
               azr.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, ls.O);
               break;
            case b:
               azr.a($$0, $$5, $$2, ls.O);
         }
      } else if ($$3.a(dil.G)) {
         azr.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, ls.O);
      }
   }
}
