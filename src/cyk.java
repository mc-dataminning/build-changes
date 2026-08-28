import javax.annotation.Nullable;

public class cyk extends czw {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cyk(czw.a $$0) {
      super($$0);
   }

   @Override
   public but a(ddv $$0) {
      djz $$1 = $$0.q();
      iw $$2 = $$0.a();
      iw $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.C) {
            $$0.o().a(egg.C);
            $$1.c(1505, $$2, 15);
         }

         return but.a;
      } else {
         ebg $$4 = $$1.a_($$2);
         boolean $$5 = $$4.c($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.C) {
               $$0.o().a(egg.C);
               $$1.c(1505, $$3, 15);
            }

            return but.a;
         } else {
            return but.e;
         }
      }
   }

   public static boolean a(daa $$0, djz $$1, iw $$2) {
      ebg $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dnh $$4 && $$4.a((dkc)$$1, $$2, $$3)) {
         if ($$1 instanceof aru) {
            if ($$4.a($$1, $$1.A, $$2, $$3)) {
               $$4.a((aru)$$1, $$1.A, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(daa $$0, djz $$1, iw $$2, @Nullable jc $$3) {
      if ($$1.a_($$2).a(dng.J) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof aru)) {
            return true;
         } else {
            azz $$4 = $$1.G_();

            label80:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               iw $$6 = $$2;
               ebg $$7 = dng.bG.m();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).m($$1, $$6)) {
                     continue label80;
                  }
               }

               jg<dlc> $$9 = $$1.u($$6);
               if ($$9.a(axf.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = mh.e.a(axg.au, $$1.A).map($$0x -> ((dne)$$0x.a()).m()).orElse($$7);
                     if ($$7.b(dmp.d)) {
                        $$7 = $$7.b(dmp.d, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = mh.e.a(axg.as, $$1.A).map($$0x -> ((dne)$$0x.a()).m()).orElse($$7);
                  }
               }

               if ($$7.a(axg.au, $$0x -> $$0x.b(dmp.d))) {
                  for (int $$10 = 0; !$$7.a((dkc)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.b(dmp.d, jc.c.a.a($$4));
                  }
               }

               if ($$7.a((dkc)$$1, $$6)) {
                  ebg $$11 = $$1.a_($$6);
                  if ($$11.a(dng.J) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dng.bG) && ((dnh)dng.bG).a((dkc)$$1, $$6, $$11) && $$4.a(10) == 0) {
                     ((dnh)dng.bG).a((aru)$$1, $$4, $$6, $$11);
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

   public static void a(dka $$0, iw $$1, int $$2) {
      ebg $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dnh $$4) {
         iw $$5 = $$4.a($$1);
         switch ($$4.ar_()) {
            case a:
               azu.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, lz.Q);
               break;
            case b:
               azu.a($$0, $$5, $$2, lz.Q);
         }
      } else if ($$3.a(dng.J)) {
         azu.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, lz.Q);
      }
   }
}
