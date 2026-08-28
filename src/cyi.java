import javax.annotation.Nullable;

public class cyi extends czu {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cyi(czu.a $$0) {
      super($$0);
   }

   @Override
   public bur a(ddt $$0) {
      djx $$1 = $$0.q();
      iv $$2 = $$0.a();
      iv $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.C) {
            $$0.o().a(ege.C);
            $$1.c(1505, $$2, 15);
         }

         return bur.a;
      } else {
         ebe $$4 = $$1.a_($$2);
         boolean $$5 = $$4.c($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.C) {
               $$0.o().a(ege.C);
               $$1.c(1505, $$3, 15);
            }

            return bur.a;
         } else {
            return bur.e;
         }
      }
   }

   public static boolean a(czy $$0, djx $$1, iv $$2) {
      ebe $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dnf $$4 && $$4.a((dka)$$1, $$2, $$3)) {
         if ($$1 instanceof ars) {
            if ($$4.a($$1, $$1.A, $$2, $$3)) {
               $$4.a((ars)$$1, $$1.A, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(czy $$0, djx $$1, iv $$2, @Nullable jb $$3) {
      if ($$1.a_($$2).a(dne.J) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof ars)) {
            return true;
         } else {
            azx $$4 = $$1.G_();

            label80:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               iv $$6 = $$2;
               ebe $$7 = dne.bG.m();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).m($$1, $$6)) {
                     continue label80;
                  }
               }

               jf<dla> $$9 = $$1.u($$6);
               if ($$9.a(axd.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = mg.e.a(axe.au, $$1.A).map($$0x -> ((dnc)$$0x.a()).m()).orElse($$7);
                     if ($$7.b(dmn.d)) {
                        $$7 = $$7.b(dmn.d, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = mg.e.a(axe.as, $$1.A).map($$0x -> ((dnc)$$0x.a()).m()).orElse($$7);
                  }
               }

               if ($$7.a(axe.au, $$0x -> $$0x.b(dmn.d))) {
                  for (int $$10 = 0; !$$7.a((dka)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.b(dmn.d, jb.c.a.a($$4));
                  }
               }

               if ($$7.a((dka)$$1, $$6)) {
                  ebe $$11 = $$1.a_($$6);
                  if ($$11.a(dne.J) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dne.bG) && ((dnf)dne.bG).a((dka)$$1, $$6, $$11) && $$4.a(10) == 0) {
                     ((dnf)dne.bG).a((ars)$$1, $$4, $$6, $$11);
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

   public static void a(djy $$0, iv $$1, int $$2) {
      ebe $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dnf $$4) {
         iv $$5 = $$4.a($$1);
         switch ($$4.ar_()) {
            case a:
               azs.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, ly.Q);
               break;
            case b:
               azs.a($$0, $$5, $$2, ly.Q);
         }
      } else if ($$3.a(dne.J)) {
         azs.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, ly.Q);
      }
   }
}
