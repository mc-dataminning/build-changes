import javax.annotation.Nullable;

public class cxc extends cyo {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cxc(cyo.a $$0) {
      super($$0);
   }

   @Override
   public bty a(dcn $$0) {
      dip $$1 = $$0.q();
      iu $$2 = $$0.a();
      iu $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.C) {
            $$0.o().a(eeo.C);
            $$1.c(1505, $$2, 15);
         }

         return bty.a;
      } else {
         dzo $$4 = $$1.a_($$2);
         boolean $$5 = $$4.c($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.C) {
               $$0.o().a(eeo.C);
               $$1.c(1505, $$3, 15);
            }

            return bty.a;
         } else {
            return bty.e;
         }
      }
   }

   public static boolean a(cys $$0, dip $$1, iu $$2) {
      dzo $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dlx $$4 && $$4.a($$1, $$2, $$3)) {
         if ($$1 instanceof aro) {
            if ($$4.a($$1, $$1.A, $$2, $$3)) {
               $$4.a((aro)$$1, $$1.A, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cys $$0, dip $$1, iu $$2, @Nullable ja $$3) {
      if ($$1.a_($$2).a(dlw.J) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof aro)) {
            return true;
         } else {
            azt $$4 = $$1.C_();

            label80:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               iu $$6 = $$2;
               dzo $$7 = dlw.bD.m();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).m($$1, $$6)) {
                     continue label80;
                  }
               }

               je<djs> $$9 = $$1.u($$6);
               if ($$9.a(awz.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = mf.e.a(axa.au, $$1.A).map($$0x -> ((dlu)$$0x.a()).m()).orElse($$7);
                     if ($$7.b(dlf.d)) {
                        $$7 = $$7.b(dlf.d, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = mf.e.a(axa.as, $$1.A).map($$0x -> ((dlu)$$0x.a()).m()).orElse($$7);
                  }
               }

               if ($$7.a(axa.au, $$0x -> $$0x.b(dlf.d))) {
                  for (int $$10 = 0; !$$7.a((dis)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.b(dlf.d, ja.c.a.a($$4));
                  }
               }

               if ($$7.a((dis)$$1, $$6)) {
                  dzo $$11 = $$1.a_($$6);
                  if ($$11.a(dlw.J) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dlw.bD) && ((dlx)dlw.bD).a($$1, $$6, $$11) && $$4.a(10) == 0) {
                     ((dlx)dlw.bD).a((aro)$$1, $$4, $$6, $$11);
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

   public static void a(diq $$0, iu $$1, int $$2) {
      dzo $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dlx $$4) {
         iu $$5 = $$4.a($$1);
         switch ($$4.am_()) {
            case a:
               azo.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, lx.Q);
               break;
            case b:
               azo.a($$0, $$5, $$2, lx.Q);
         }
      } else if ($$3.a(dlw.J)) {
         azo.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, lx.Q);
      }
   }
}
