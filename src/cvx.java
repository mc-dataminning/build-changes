import javax.annotation.Nullable;

public class cvx extends cxl {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cvx(cxl.a $$0) {
      super($$0);
   }

   @Override
   public btj a(dbi $$0) {
      dhi $$1 = $$0.q();
      jh $$2 = $$0.a();
      jh $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.C) {
            $$0.o().a(ecr.C);
            $$1.c(1505, $$2, 15);
         }

         return btj.a;
      } else {
         dxv $$4 = $$1.a_($$2);
         boolean $$5 = $$4.c($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.C) {
               $$0.o().a(ecr.C);
               $$1.c(1505, $$3, 15);
            }

            return btj.a;
         } else {
            return btj.e;
         }
      }
   }

   public static boolean a(cxp $$0, dhi $$1, jh $$2) {
      dxv $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dkp $$4 && $$4.b($$1, $$2, $$3)) {
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

   public static boolean a(cxp $$0, dhi $$1, jh $$2, @Nullable jm $$3) {
      if ($$1.a_($$2).a(dko.J) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof ash)) {
            return true;
         } else {
            bam $$4 = $$1.H_();

            label80:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               jh $$6 = $$2;
               dxv $$7 = dko.bD.m();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).m($$1, $$6)) {
                     continue label80;
                  }
               }

               jq<dik> $$9 = $$1.t($$6);
               if ($$9.a(axt.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = ma.e.a(axu.au, $$1.A).map($$0x -> ((dkm)$$0x.a()).m()).orElse($$7);
                     if ($$7.b(djx.c)) {
                        $$7 = $$7.b(djx.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = ma.e.a(axu.as, $$1.A).map($$0x -> ((dkm)$$0x.a()).m()).orElse($$7);
                  }
               }

               if ($$7.a(axu.au, $$0x -> $$0x.b(djx.c))) {
                  for (int $$10 = 0; !$$7.a((dhl)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.b(djx.c, jm.c.a.a($$4));
                  }
               }

               if ($$7.a((dhl)$$1, $$6)) {
                  dxv $$11 = $$1.a_($$6);
                  if ($$11.a(dko.J) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dko.bD) && ((dkp)dko.bD).b($$1, $$6, $$11) && $$4.a(10) == 0) {
                     ((dkp)dko.bD).a((ash)$$1, $$4, $$6, $$11);
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

   public static void a(dhj $$0, jh $$1, int $$2) {
      dxv $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dkp $$4) {
         jh $$5 = $$4.a($$1);
         switch ($$4.ar_()) {
            case a:
               bai.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, ls.O);
               break;
            case b:
               bai.a($$0, $$5, $$2, ls.O);
         }
      } else if ($$3.a(dko.J)) {
         bai.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, ls.O);
      }
   }
}
