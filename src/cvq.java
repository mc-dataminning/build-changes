import javax.annotation.Nullable;

public class cvq extends cxd {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cvq(cxd.a $$0) {
      super($$0);
   }

   @Override
   public bsy a(daz $$0) {
      dgz $$1 = $$0.q();
      ji $$2 = $$0.a();
      ji $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.C) {
            $$0.o().a(ecp.C);
            $$1.c(1505, $$2, 15);
         }

         return bsy.a;
      } else {
         dxq $$4 = $$1.a_($$2);
         boolean $$5 = $$4.c($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.C) {
               $$0.o().a(ecp.C);
               $$1.c(1505, $$3, 15);
            }

            return bsy.a;
         } else {
            return bsy.e;
         }
      }
   }

   public static boolean a(cxh $$0, dgz $$1, ji $$2) {
      dxq $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dkh $$4 && $$4.a($$1, $$2, $$3)) {
         if ($$1 instanceof ard) {
            if ($$4.a($$1, $$1.A, $$2, $$3)) {
               $$4.a((ard)$$1, $$1.A, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cxh $$0, dgz $$1, ji $$2, @Nullable jn $$3) {
      if ($$1.a_($$2).a(dkg.J) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof ard)) {
            return true;
         } else {
            azh $$4 = $$1.C_();

            label80:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               ji $$6 = $$2;
               dxq $$7 = dkg.bD.m();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).m($$1, $$6)) {
                     continue label80;
                  }
               }

               jr<dic> $$9 = $$1.t($$6);
               if ($$9.a(awo.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = mb.e.a(awp.au, $$1.A).map($$0x -> ((dke)$$0x.a()).m()).orElse($$7);
                     if ($$7.b(djp.d)) {
                        $$7 = $$7.b(djp.d, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = mb.e.a(awp.as, $$1.A).map($$0x -> ((dke)$$0x.a()).m()).orElse($$7);
                  }
               }

               if ($$7.a(awp.au, $$0x -> $$0x.b(djp.d))) {
                  for (int $$10 = 0; !$$7.a((dhc)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.b(djp.d, jn.c.a.a($$4));
                  }
               }

               if ($$7.a((dhc)$$1, $$6)) {
                  dxq $$11 = $$1.a_($$6);
                  if ($$11.a(dkg.J) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dkg.bD) && ((dkh)dkg.bD).a($$1, $$6, $$11) && $$4.a(10) == 0) {
                     ((dkh)dkg.bD).a((ard)$$1, $$4, $$6, $$11);
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

   public static void a(dha $$0, ji $$1, int $$2) {
      dxq $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dkh $$4) {
         ji $$5 = $$4.a($$1);
         switch ($$4.aq_()) {
            case a:
               azd.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, lt.Q);
               break;
            case b:
               azd.a($$0, $$5, $$2, lt.Q);
         }
      } else if ($$3.a(dkg.J)) {
         azd.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, lt.Q);
      }
   }
}
