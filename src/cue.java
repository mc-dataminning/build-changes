import javax.annotation.Nullable;

public class cue extends cvt {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cue(cvt.a $$0) {
      super($$0);
   }

   @Override
   public bry a(czo $$0) {
      dev $$1 = $$0.q();
      jg $$2 = $$0.a();
      jg $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.C) {
            $$0.o().a(eaa.C);
            $$1.c(1505, $$2, 15);
         }

         return bry.a;
      } else {
         dvd $$4 = $$1.a_($$2);
         boolean $$5 = $$4.c($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.C) {
               $$0.o().a(eaa.C);
               $$1.c(1505, $$3, 15);
            }

            return bry.a;
         } else {
            return bry.e;
         }
      }
   }

   public static boolean a(cvx $$0, dev $$1, jg $$2) {
      dvd $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dib $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof arm) {
            if ($$4.a($$1, $$1.A, $$2, $$3)) {
               $$4.a((arm)$$1, $$1.A, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cvx $$0, dev $$1, jg $$2, @Nullable jl $$3) {
      if ($$1.a_($$2).a(dia.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof arm)) {
            return true;
         } else {
            azr $$4 = $$1.E_();

            label80:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               jg $$6 = $$2;
               dvd $$7 = dia.bw.m();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).m($$1, $$6)) {
                     continue label80;
                  }
               }

               jp<dfw> $$9 = $$1.t($$6);
               if ($$9.a(awy.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = lx.e.a(awz.as, $$1.A).map($$0x -> ((dhy)$$0x.a()).m()).orElse($$7);
                     if ($$7.b(dhj.c)) {
                        $$7 = $$7.b(dhj.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = lx.e.a(awz.aq, $$1.A).map($$0x -> ((dhy)$$0x.a()).m()).orElse($$7);
                  }
               }

               if ($$7.a(awz.as, $$0x -> $$0x.b(dhj.c))) {
                  for (int $$10 = 0; !$$7.a((dey)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.b(dhj.c, jl.c.a.a($$4));
                  }
               }

               if ($$7.a((dey)$$1, $$6)) {
                  dvd $$11 = $$1.a_($$6);
                  if ($$11.a(dia.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dia.bw) && ((dib)dia.bw).b($$1, $$6, $$11) && $$4.a(10) == 0) {
                     ((dib)dia.bw).a((arm)$$1, $$4, $$6, $$11);
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

   public static void a(dew $$0, jg $$1, int $$2) {
      dvd $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dib $$4) {
         jg $$5 = $$4.a($$1);
         switch ($$4.as_()) {
            case a:
               azn.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, lq.O);
               break;
            case b:
               azn.a($$0, $$5, $$2, lq.O);
         }
      } else if ($$3.a(dia.G)) {
         azn.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, lq.O);
      }
   }
}
