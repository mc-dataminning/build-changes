import javax.annotation.Nullable;

public class cvw extends cxk {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cvw(cxk.a $$0) {
      super($$0);
   }

   @Override
   public bti a(dbh $$0) {
      dhh $$1 = $$0.q();
      jh $$2 = $$0.a();
      jh $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.C) {
            $$0.o().a(ecq.C);
            $$1.c(1505, $$2, 15);
         }

         return bti.a;
      } else {
         dxu $$4 = $$1.a_($$2);
         boolean $$5 = $$4.c($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.C) {
               $$0.o().a(ecq.C);
               $$1.c(1505, $$3, 15);
            }

            return bti.a;
         } else {
            return bti.e;
         }
      }
   }

   public static boolean a(cxo $$0, dhh $$1, jh $$2) {
      dxu $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dko $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof ash) {
            if ($$4.a($$1, $$1.A, $$2, $$3)) {
               $$4.a((ash)$$1, $$1.A, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cxo $$0, dhh $$1, jh $$2, @Nullable jm $$3) {
      if ($$1.a_($$2).a(dkn.J) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof ash)) {
            return true;
         } else {
            bam $$4 = $$1.H_();

            label80:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               jh $$6 = $$2;
               dxu $$7 = dkn.bD.m();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).m($$1, $$6)) {
                     continue label80;
                  }
               }

               jq<dij> $$9 = $$1.t($$6);
               if ($$9.a(axt.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = ma.e.a(axu.au, $$1.A).map($$0x -> ((dkl)$$0x.a()).m()).orElse($$7);
                     if ($$7.b(djw.c)) {
                        $$7 = $$7.b(djw.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = ma.e.a(axu.as, $$1.A).map($$0x -> ((dkl)$$0x.a()).m()).orElse($$7);
                  }
               }

               if ($$7.a(axu.au, $$0x -> $$0x.b(djw.c))) {
                  for (int $$10 = 0; !$$7.a((dhk)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.b(djw.c, jm.c.a.a($$4));
                  }
               }

               if ($$7.a((dhk)$$1, $$6)) {
                  dxu $$11 = $$1.a_($$6);
                  if ($$11.a(dkn.J) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dkn.bD) && ((dko)dkn.bD).b($$1, $$6, $$11) && $$4.a(10) == 0) {
                     ((dko)dkn.bD).a((ash)$$1, $$4, $$6, $$11);
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

   public static void a(dhi $$0, jh $$1, int $$2) {
      dxu $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dko $$4) {
         jh $$5 = $$4.a($$1);
         switch ($$4.ar_()) {
            case a:
               bai.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, ls.O);
               break;
            case b:
               bai.a($$0, $$5, $$2, ls.O);
         }
      } else if ($$3.a(dkn.J)) {
         bai.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, ls.O);
      }
   }
}
