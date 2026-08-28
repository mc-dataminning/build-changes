import javax.annotation.Nullable;

public class cuy extends cwm {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cuy(cwm.a $$0) {
      super($$0);
   }

   @Override
   public bsl a(daj $$0) {
      dgj $$1 = $$0.q();
      ji $$2 = $$0.a();
      ji $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.C) {
            $$0.o().a(ebu.C);
            $$1.c(1505, $$2, 15);
         }

         return bsl.a;
      } else {
         dwy $$4 = $$1.a_($$2);
         boolean $$5 = $$4.c($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.C) {
               $$0.o().a(ebu.C);
               $$1.c(1505, $$3, 15);
            }

            return bsl.a;
         } else {
            return bsl.e;
         }
      }
   }

   public static boolean a(cwq $$0, dgj $$1, ji $$2) {
      dwy $$3 = $$1.a_($$2);
      if ($$3.b() instanceof djq $$4 && $$4.a($$1, $$2, $$3)) {
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

   public static boolean a(cwq $$0, dgj $$1, ji $$2, @Nullable jn $$3) {
      if ($$1.a_($$2).a(djp.J) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof ard)) {
            return true;
         } else {
            azh $$4 = $$1.H_();

            label80:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               ji $$6 = $$2;
               dwy $$7 = djp.bD.m();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).m($$1, $$6)) {
                     continue label80;
                  }
               }

               jr<dhl> $$9 = $$1.t($$6);
               if ($$9.a(awo.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = mb.e.a(awp.au, $$1.A).map($$0x -> ((djn)$$0x.a()).m()).orElse($$7);
                     if ($$7.b(diy.c)) {
                        $$7 = $$7.b(diy.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = mb.e.a(awp.as, $$1.A).map($$0x -> ((djn)$$0x.a()).m()).orElse($$7);
                  }
               }

               if ($$7.a(awp.au, $$0x -> $$0x.b(diy.c))) {
                  for (int $$10 = 0; !$$7.a((dgm)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.b(diy.c, jn.c.a.a($$4));
                  }
               }

               if ($$7.a((dgm)$$1, $$6)) {
                  dwy $$11 = $$1.a_($$6);
                  if ($$11.a(djp.J) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(djp.bD) && ((djq)djp.bD).a($$1, $$6, $$11) && $$4.a(10) == 0) {
                     ((djq)djp.bD).a((ard)$$1, $$4, $$6, $$11);
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

   public static void a(dgk $$0, ji $$1, int $$2) {
      dwy $$3 = $$0.a_($$1);
      if ($$3.b() instanceof djq $$4) {
         ji $$5 = $$4.a($$1);
         switch ($$4.aq_()) {
            case a:
               azd.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, lt.P);
               break;
            case b:
               azd.a($$0, $$5, $$2, lt.P);
         }
      } else if ($$3.a(djp.J)) {
         azd.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, lt.P);
      }
   }
}
