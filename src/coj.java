import javax.annotation.Nullable;

public class coj extends cqh {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public coj(cqh.a $$0) {
      super($$0);
   }

   @Override
   public bnd a(csw $$0) {
      cxb $$1 = $$0.q();
      ib $$2 = $$0.a();
      ib $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.B) {
            $$0.o().b(drp.C);
            $$1.c(1505, $$2, 15);
         }

         return bnd.a($$1.B);
      } else {
         dnb $$4 = $$1.a_($$2);
         boolean $$5 = $$4.d($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
               $$0.o().b(drp.C);
               $$1.c(1505, $$3, 15);
            }

            return bnd.a($$1.B);
         } else {
            return bnd.d;
         }
      }
   }

   public static boolean a(cqm $$0, cxb $$1, ib $$2) {
      dnb $$3 = $$1.a_($$2);
      if ($$3.b() instanceof daf $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof apf) {
            if ($$4.a($$1, $$1.z, $$2, $$3)) {
               $$4.a((apf)$$1, $$1.z, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cqm $$0, cxb $$1, ib $$2, @Nullable ih $$3) {
      if ($$1.a_($$2).a(dae.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof apf)) {
            return true;
         } else {
            axd $$4 = $$1.E_();

            label78:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               ib $$6 = $$2;
               dnb $$7 = dae.bw.o();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).r($$1, $$6)) {
                     continue label78;
                  }
               }

               il<cya> $$9 = $$1.t($$6);
               if ($$9.a(aum.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = ki.e.a(aun.ar, $$1.z).map($$0x -> ((dac)$$0x.a()).o()).orElse($$7);
                     if ($$7.b(czn.c)) {
                        $$7 = $$7.a(czn.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = ki.e.a(aun.ap, $$1.z).map($$0x -> ((dac)$$0x.a()).o()).orElse($$7);
                  }
               }

               if ($$7.a(aun.ar, $$0x -> $$0x.b(czn.c))) {
                  for (int $$10 = 0; !$$7.a((cxe)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.a(czn.c, ih.c.a.a($$4));
                  }
               }

               if ($$7.a((cxe)$$1, $$6)) {
                  dnb $$11 = $$1.a_($$6);
                  if ($$11.a(dae.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dae.bw) && $$4.a(10) == 0) {
                     ((daf)dae.bw).a((apf)$$1, $$4, $$6, $$11);
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

   public static void a(cxc $$0, ib $$1, int $$2) {
      dnb $$3 = $$0.a_($$1);
      if ($$3.b() instanceof daf $$4) {
         ib $$5 = $$4.a($$1);
         switch ($$4.at_()) {
            case a:
               awz.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, kc.N);
               break;
            case b:
               awz.a($$0, $$5, $$2, kc.N);
         }
      } else if ($$3.a(dae.G)) {
         awz.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, kc.N);
      }
   }
}
