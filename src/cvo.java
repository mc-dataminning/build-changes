import javax.annotation.Nullable;

public class cvo extends cxc {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cvo(cxc.a $$0) {
      super($$0);
   }

   @Override
   public bta a(daz $$0) {
      dgz $$1 = $$0.q();
      jh $$2 = $$0.a();
      jh $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.C) {
            $$0.o().a(eck.C);
            $$1.c(1505, $$2, 15);
         }

         return bta.a;
      } else {
         dxo $$4 = $$1.a_($$2);
         boolean $$5 = $$4.c($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.C) {
               $$0.o().a(eck.C);
               $$1.c(1505, $$3, 15);
            }

            return bta.a;
         } else {
            return bta.e;
         }
      }
   }

   public static boolean a(cxg $$0, dgz $$1, jh $$2) {
      dxo $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dkg $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof arx) {
            if ($$4.a($$1, $$1.A, $$2, $$3)) {
               $$4.a((arx)$$1, $$1.A, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cxg $$0, dgz $$1, jh $$2, @Nullable jm $$3) {
      if ($$1.a_($$2).a(dkf.J) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof arx)) {
            return true;
         } else {
            bac $$4 = $$1.H_();

            label80:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               jh $$6 = $$2;
               dxo $$7 = dkf.bD.m();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).m($$1, $$6)) {
                     continue label80;
                  }
               }

               jq<dib> $$9 = $$1.t($$6);
               if ($$9.a(axj.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = ma.e.a(axk.au, $$1.A).map($$0x -> ((dkd)$$0x.a()).m()).orElse($$7);
                     if ($$7.b(djo.c)) {
                        $$7 = $$7.b(djo.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = ma.e.a(axk.as, $$1.A).map($$0x -> ((dkd)$$0x.a()).m()).orElse($$7);
                  }
               }

               if ($$7.a(axk.au, $$0x -> $$0x.b(djo.c))) {
                  for (int $$10 = 0; !$$7.a((dhc)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.b(djo.c, jm.c.a.a($$4));
                  }
               }

               if ($$7.a((dhc)$$1, $$6)) {
                  dxo $$11 = $$1.a_($$6);
                  if ($$11.a(dkf.J) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dkf.bD) && ((dkg)dkf.bD).b($$1, $$6, $$11) && $$4.a(10) == 0) {
                     ((dkg)dkf.bD).a((arx)$$1, $$4, $$6, $$11);
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

   public static void a(dha $$0, jh $$1, int $$2) {
      dxo $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dkg $$4) {
         jh $$5 = $$4.a($$1);
         switch ($$4.ar_()) {
            case a:
               azy.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, ls.P);
               break;
            case b:
               azy.a($$0, $$5, $$2, ls.P);
         }
      } else if ($$3.a(dkf.J)) {
         azy.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, ls.P);
      }
   }
}
