import javax.annotation.Nullable;

public class cuw extends cwk {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cuw(cwk.a $$0) {
      super($$0);
   }

   @Override
   public bsj a(dah $$0) {
      dgh $$1 = $$0.q();
      ji $$2 = $$0.a();
      ji $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.C) {
            $$0.o().a(ebs.C);
            $$1.c(1505, $$2, 15);
         }

         return bsj.a;
      } else {
         dww $$4 = $$1.a_($$2);
         boolean $$5 = $$4.c($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.C) {
               $$0.o().a(ebs.C);
               $$1.c(1505, $$3, 15);
            }

            return bsj.a;
         } else {
            return bsj.e;
         }
      }
   }

   public static boolean a(cwo $$0, dgh $$1, ji $$2) {
      dww $$3 = $$1.a_($$2);
      if ($$3.b() instanceof djo $$4 && $$4.a($$1, $$2, $$3)) {
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

   public static boolean a(cwo $$0, dgh $$1, ji $$2, @Nullable jn $$3) {
      if ($$1.a_($$2).a(djn.J) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof ard)) {
            return true;
         } else {
            azh $$4 = $$1.H_();

            label80:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               ji $$6 = $$2;
               dww $$7 = djn.bD.m();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).m($$1, $$6)) {
                     continue label80;
                  }
               }

               jr<dhj> $$9 = $$1.t($$6);
               if ($$9.a(awo.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = mb.e.a(awp.au, $$1.A).map($$0x -> ((djl)$$0x.a()).m()).orElse($$7);
                     if ($$7.b(diw.c)) {
                        $$7 = $$7.b(diw.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = mb.e.a(awp.as, $$1.A).map($$0x -> ((djl)$$0x.a()).m()).orElse($$7);
                  }
               }

               if ($$7.a(awp.au, $$0x -> $$0x.b(diw.c))) {
                  for (int $$10 = 0; !$$7.a((dgk)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.b(diw.c, jn.c.a.a($$4));
                  }
               }

               if ($$7.a((dgk)$$1, $$6)) {
                  dww $$11 = $$1.a_($$6);
                  if ($$11.a(djn.J) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(djn.bD) && ((djo)djn.bD).a($$1, $$6, $$11) && $$4.a(10) == 0) {
                     ((djo)djn.bD).a((ard)$$1, $$4, $$6, $$11);
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

   public static void a(dgi $$0, ji $$1, int $$2) {
      dww $$3 = $$0.a_($$1);
      if ($$3.b() instanceof djo $$4) {
         ji $$5 = $$4.a($$1);
         switch ($$4.aq_()) {
            case a:
               azd.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, lt.P);
               break;
            case b:
               azd.a($$0, $$5, $$2, lt.P);
         }
      } else if ($$3.a(djn.J)) {
         azd.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, lt.P);
      }
   }
}
