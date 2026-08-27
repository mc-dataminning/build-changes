import javax.annotation.Nullable;

public class cpj extends cre {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cpj(cre.a $$0) {
      super($$0);
   }

   @Override
   public boa a(cuq $$0) {
      cyx $$1 = $$0.q();
      ib $$2 = $$0.a();
      ib $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.B) {
            $$0.o().a(dts.C);
            $$1.c(1505, $$2, 15);
         }

         return boa.a($$1.B);
      } else {
         doz $$4 = $$1.a_($$2);
         boolean $$5 = $$4.d($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
               $$0.o().a(dts.C);
               $$1.c(1505, $$3, 15);
            }

            return boa.a($$1.B);
         } else {
            return boa.d;
         }
      }
   }

   public static boolean a(crj $$0, cyx $$1, ib $$2) {
      doz $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dcb $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof aps) {
            if ($$4.a($$1, $$1.z, $$2, $$3)) {
               $$4.a((aps)$$1, $$1.z, $$2, $$3);
            }

            $$0.g(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(crj $$0, cyx $$1, ib $$2, @Nullable ih $$3) {
      if ($$1.a_($$2).a(dca.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof aps)) {
            return true;
         } else {
            axr $$4 = $$1.E_();

            label78:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               ib $$6 = $$2;
               doz $$7 = dca.bw.n();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).r($$1, $$6)) {
                     continue label78;
                  }
               }

               il<czw> $$9 = $$1.t($$6);
               if ($$9.a(avb.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = kr.e.a(avc.ar, $$1.z).map($$0x -> ((dby)$$0x.a()).n()).orElse($$7);
                     if ($$7.b(dbj.c)) {
                        $$7 = $$7.a(dbj.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = kr.e.a(avc.ap, $$1.z).map($$0x -> ((dby)$$0x.a()).n()).orElse($$7);
                  }
               }

               if ($$7.a(avc.ar, $$0x -> $$0x.b(dbj.c))) {
                  for (int $$10 = 0; !$$7.a((cza)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.a(dbj.c, ih.c.a.a($$4));
                  }
               }

               if ($$7.a((cza)$$1, $$6)) {
                  doz $$11 = $$1.a_($$6);
                  if ($$11.a(dca.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dca.bw) && $$4.a(10) == 0) {
                     ((dcb)dca.bw).a((aps)$$1, $$4, $$6, $$11);
                  }
               }
            }

            $$0.g(1);
            return true;
         }
      } else {
         return false;
      }
   }

   public static void a(cyy $$0, ib $$1, int $$2) {
      doz $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dcb $$4) {
         ib $$5 = $$4.a($$1);
         switch ($$4.ar_()) {
            case a:
               axn.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, kl.N);
               break;
            case b:
               axn.a($$0, $$5, $$2, kl.N);
         }
      } else if ($$3.a(dca.G)) {
         axn.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, kl.N);
      }
   }
}
