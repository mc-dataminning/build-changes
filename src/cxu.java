import javax.annotation.Nullable;

public class cxu extends czg {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cxu(czg.a $$0) {
      super($$0);
   }

   @Override
   public bug a(ddf $$0) {
      djh $$1 = $$0.q();
      iv $$2 = $$0.a();
      iv $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.C) {
            $$0.o().a(efo.C);
            $$1.c(1505, $$2, 15);
         }

         return bug.a;
      } else {
         eao $$4 = $$1.a_($$2);
         boolean $$5 = $$4.c($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.C) {
               $$0.o().a(efo.C);
               $$1.c(1505, $$3, 15);
            }

            return bug.a;
         } else {
            return bug.e;
         }
      }
   }

   public static boolean a(czk $$0, djh $$1, iv $$2) {
      eao $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dmp $$4 && $$4.a((djk)$$1, $$2, $$3)) {
         if ($$1 instanceof arq) {
            if ($$4.a($$1, $$1.A, $$2, $$3)) {
               $$4.a((arq)$$1, $$1.A, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(czk $$0, djh $$1, iv $$2, @Nullable jb $$3) {
      if ($$1.a_($$2).a(dmo.J) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof arq)) {
            return true;
         } else {
            azv $$4 = $$1.C_();

            label80:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               iv $$6 = $$2;
               eao $$7 = dmo.bG.m();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).m($$1, $$6)) {
                     continue label80;
                  }
               }

               jf<dkk> $$9 = $$1.u($$6);
               if ($$9.a(axb.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = mg.e.a(axc.au, $$1.A).map($$0x -> ((dmm)$$0x.a()).m()).orElse($$7);
                     if ($$7.b(dlx.d)) {
                        $$7 = $$7.b(dlx.d, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = mg.e.a(axc.as, $$1.A).map($$0x -> ((dmm)$$0x.a()).m()).orElse($$7);
                  }
               }

               if ($$7.a(axc.au, $$0x -> $$0x.b(dlx.d))) {
                  for (int $$10 = 0; !$$7.a((djk)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.b(dlx.d, jb.c.a.a($$4));
                  }
               }

               if ($$7.a((djk)$$1, $$6)) {
                  eao $$11 = $$1.a_($$6);
                  if ($$11.a(dmo.J) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dmo.bG) && ((dmp)dmo.bG).a((djk)$$1, $$6, $$11) && $$4.a(10) == 0) {
                     ((dmp)dmo.bG).a((arq)$$1, $$4, $$6, $$11);
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

   public static void a(dji $$0, iv $$1, int $$2) {
      eao $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dmp $$4) {
         iv $$5 = $$4.a($$1);
         switch ($$4.an_()) {
            case a:
               azq.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, ly.Q);
               break;
            case b:
               azq.a($$0, $$5, $$2, ly.Q);
         }
      } else if ($$3.a(dmo.J)) {
         azq.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, ly.Q);
      }
   }
}
