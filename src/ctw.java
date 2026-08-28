import javax.annotation.Nullable;

public class ctw extends cvn {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public ctw(cvn.a $$0) {
      super($$0);
   }

   @Override
   public brs a(czp $$0) {
      dej $$1 = $$0.q();
      jf $$2 = $$0.a();
      jf $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.B) {
            $$0.o().a(dzp.C);
            $$1.c(1505, $$2, 15);
         }

         return brs.a;
      } else {
         dus $$4 = $$1.a_($$2);
         boolean $$5 = $$4.c($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
               $$0.o().a(dzp.C);
               $$1.c(1505, $$3, 15);
            }

            return brs.a;
         } else {
            return brs.e;
         }
      }
   }

   public static boolean a(cvs $$0, dej $$1, jf $$2) {
      dus $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dhp $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof arj) {
            if ($$4.a($$1, $$1.z, $$2, $$3)) {
               $$4.a((arj)$$1, $$1.z, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cvs $$0, dej $$1, jf $$2, @Nullable jk $$3) {
      if ($$1.a_($$2).a(dho.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof arj)) {
            return true;
         } else {
            azn $$4 = $$1.D_();

            label80:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               jf $$6 = $$2;
               dus $$7 = dho.bw.n();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).m($$1, $$6)) {
                     continue label80;
                  }
               }

               jo<dfk> $$9 = $$1.t($$6);
               if ($$9.a(awu.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = lv.e.a(awv.as, $$1.z).map($$0x -> ((dhm)$$0x.a()).n()).orElse($$7);
                     if ($$7.b(dgx.c)) {
                        $$7 = $$7.b(dgx.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = lv.e.a(awv.aq, $$1.z).map($$0x -> ((dhm)$$0x.a()).n()).orElse($$7);
                  }
               }

               if ($$7.a(awv.as, $$0x -> $$0x.b(dgx.c))) {
                  for (int $$10 = 0; !$$7.a((dem)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.b(dgx.c, jk.c.a.a($$4));
                  }
               }

               if ($$7.a((dem)$$1, $$6)) {
                  dus $$11 = $$1.a_($$6);
                  if ($$11.a(dho.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dho.bw) && ((dhp)dho.bw).b($$1, $$6, $$11) && $$4.a(10) == 0) {
                     ((dhp)dho.bw).a((arj)$$1, $$4, $$6, $$11);
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

   public static void a(dek $$0, jf $$1, int $$2) {
      dus $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dhp $$4) {
         jf $$5 = $$4.a($$1);
         switch ($$4.as_()) {
            case a:
               azj.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, lo.O);
               break;
            case b:
               azj.a($$0, $$5, $$2, lo.O);
         }
      } else if ($$3.a(dho.G)) {
         azj.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, lo.O);
      }
   }
}
