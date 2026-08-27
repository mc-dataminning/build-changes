import javax.annotation.Nullable;

public class cmu extends cou {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cmu(cou.a $$0) {
      super($$0);
   }

   @Override
   public blu a(cri $$0) {
      cvn $$1 = $$0.q();
      hz $$2 = $$0.a();
      hz $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.B) {
            $$0.o().b(dpp.C);
            $$1.c(1505, $$2, 15);
         }

         return blu.a($$1.B);
      } else {
         dlf $$4 = $$1.a_($$2);
         boolean $$5 = $$4.d($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
               $$0.o().b(dpp.C);
               $$1.c(1505, $$3, 15);
            }

            return blu.a($$1.B);
         } else {
            return blu.d;
         }
      }
   }

   public static boolean a(coz $$0, cvn $$1, hz $$2) {
      dlf $$3 = $$1.a_($$2);
      if ($$3.b() instanceof cyr $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof aov) {
            if ($$4.a($$1, $$1.z, $$2, $$3)) {
               $$4.a((aov)$$1, $$1.z, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(coz $$0, cvn $$1, hz $$2, @Nullable ie $$3) {
      if ($$1.a_($$2).a(cyq.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof aov)) {
            return true;
         } else {
            awo $$4 = $$1.F_();

            label78:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               hz $$6 = $$2;
               dlf $$7 = cyq.bw.o();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).r($$1, $$6)) {
                     continue label78;
                  }
               }

               ij<cwm> $$9 = $$1.t($$6);
               if ($$9.a(aty.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = kf.e.a(atz.aq, $$1.z).map($$0x -> ((cyo)$$0x.a()).o()).orElse($$7);
                     if ($$7.b(cxz.c)) {
                        $$7 = $$7.a(cxz.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = kf.e.a(atz.ao, $$1.z).map($$0x -> ((cyo)$$0x.a()).o()).orElse($$7);
                  }
               }

               if ($$7.a(atz.aq, $$0x -> $$0x.b(cxz.c))) {
                  for (int $$10 = 0; !$$7.a((cvq)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.a(cxz.c, ie.c.a.a($$4));
                  }
               }

               if ($$7.a((cvq)$$1, $$6)) {
                  dlf $$11 = $$1.a_($$6);
                  if ($$11.a(cyq.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(cyq.bw) && $$4.a(10) == 0) {
                     ((cyr)cyq.bw).a((aov)$$1, $$4, $$6, $$11);
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

   public static void a(cvo $$0, hz $$1, int $$2) {
      dlf $$3 = $$0.a_($$1);
      if ($$3.b() instanceof cyr $$4) {
         hz $$5 = $$4.a($$1);
         switch ($$4.av_()) {
            case a:
               awk.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, jz.M);
               break;
            case b:
               awk.a($$0, $$5, $$2, jz.M);
         }
      } else if ($$3.a(cyq.G)) {
         awk.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, jz.M);
      }
   }
}
