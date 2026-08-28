import javax.annotation.Nullable;

public class cuv extends cwj {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cuv(cwj.a $$0) {
      super($$0);
   }

   @Override
   public bsi a(dag $$0) {
      dgg $$1 = $$0.q();
      ji $$2 = $$0.a();
      ji $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.C) {
            $$0.o().a(ebr.C);
            $$1.c(1505, $$2, 15);
         }

         return bsi.a;
      } else {
         dwv $$4 = $$1.a_($$2);
         boolean $$5 = $$4.c($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.C) {
               $$0.o().a(ebr.C);
               $$1.c(1505, $$3, 15);
            }

            return bsi.a;
         } else {
            return bsi.e;
         }
      }
   }

   public static boolean a(cwn $$0, dgg $$1, ji $$2) {
      dwv $$3 = $$1.a_($$2);
      if ($$3.b() instanceof djn $$4 && $$4.a($$1, $$2, $$3)) {
         if ($$1 instanceof arc) {
            if ($$4.a($$1, $$1.A, $$2, $$3)) {
               $$4.a((arc)$$1, $$1.A, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cwn $$0, dgg $$1, ji $$2, @Nullable jn $$3) {
      if ($$1.a_($$2).a(djm.J) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof arc)) {
            return true;
         } else {
            azg $$4 = $$1.H_();

            label80:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               ji $$6 = $$2;
               dwv $$7 = djm.bD.m();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).m($$1, $$6)) {
                     continue label80;
                  }
               }

               jr<dhi> $$9 = $$1.t($$6);
               if ($$9.a(awn.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = mb.e.a(awo.au, $$1.A).map($$0x -> ((djk)$$0x.a()).m()).orElse($$7);
                     if ($$7.b(div.c)) {
                        $$7 = $$7.b(div.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = mb.e.a(awo.as, $$1.A).map($$0x -> ((djk)$$0x.a()).m()).orElse($$7);
                  }
               }

               if ($$7.a(awo.au, $$0x -> $$0x.b(div.c))) {
                  for (int $$10 = 0; !$$7.a((dgj)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.b(div.c, jn.c.a.a($$4));
                  }
               }

               if ($$7.a((dgj)$$1, $$6)) {
                  dwv $$11 = $$1.a_($$6);
                  if ($$11.a(djm.J) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(djm.bD) && ((djn)djm.bD).a($$1, $$6, $$11) && $$4.a(10) == 0) {
                     ((djn)djm.bD).a((arc)$$1, $$4, $$6, $$11);
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

   public static void a(dgh $$0, ji $$1, int $$2) {
      dwv $$3 = $$0.a_($$1);
      if ($$3.b() instanceof djn $$4) {
         ji $$5 = $$4.a($$1);
         switch ($$4.aq_()) {
            case a:
               azc.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, lt.P);
               break;
            case b:
               azc.a($$0, $$5, $$2, lt.P);
         }
      } else if ($$3.a(djm.J)) {
         azc.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, lt.P);
      }
   }
}
