import javax.annotation.Nullable;

public class cqz extends csu {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cqz(csu.a $$0) {
      super($$0);
   }

   @Override
   public bpm a(cwk $$0) {
      dad $$1 = $$0.q();
      in $$2 = $$0.a();
      in $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.B) {
            $$0.o().a(dva.C);
            $$1.c(1505, $$2, 15);
         }

         return bpm.a($$1.B);
      } else {
         dqh $$4 = $$1.a_($$2);
         boolean $$5 = $$4.d($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
               $$0.o().a(dva.C);
               $$1.c(1505, $$3, 15);
            }

            return bpm.a($$1.B);
         } else {
            return bpm.d;
         }
      }
   }

   public static boolean a(csz $$0, dad $$1, in $$2) {
      dqh $$3 = $$1.a_($$2);
      if ($$3.b() instanceof ddh $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof aqh) {
            if ($$4.a($$1, $$1.z, $$2, $$3)) {
               $$4.a((aqh)$$1, $$1.z, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(csz $$0, dad $$1, in $$2, @Nullable is $$3) {
      if ($$1.a_($$2).a(ddg.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof aqh)) {
            return true;
         } else {
            ayg $$4 = $$1.E_();

            label78:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               in $$6 = $$2;
               dqh $$7 = ddg.bw.n();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).r($$1, $$6)) {
                     continue label78;
                  }
               }

               iw<dbc> $$9 = $$1.t($$6);
               if ($$9.a(avq.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = ld.e.a(avr.ar, $$1.z).map($$0x -> ((dde)$$0x.a()).n()).orElse($$7);
                     if ($$7.b(dcp.c)) {
                        $$7 = $$7.a(dcp.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = ld.e.a(avr.ap, $$1.z).map($$0x -> ((dde)$$0x.a()).n()).orElse($$7);
                  }
               }

               if ($$7.a(avr.ar, $$0x -> $$0x.b(dcp.c))) {
                  for (int $$10 = 0; !$$7.a((dag)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.a(dcp.c, is.c.a.a($$4));
                  }
               }

               if ($$7.a((dag)$$1, $$6)) {
                  dqh $$11 = $$1.a_($$6);
                  if ($$11.a(ddg.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(ddg.bw) && $$4.a(10) == 0) {
                     ((ddh)ddg.bw).a((aqh)$$1, $$4, $$6, $$11);
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

   public static void a(dae $$0, in $$1, int $$2) {
      dqh $$3 = $$0.a_($$1);
      if ($$3.b() instanceof ddh $$4) {
         in $$5 = $$4.a($$1);
         switch ($$4.aq_()) {
            case a:
               ayc.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, kx.M);
               break;
            case b:
               ayc.a($$0, $$5, $$2, kx.M);
         }
      } else if ($$3.a(ddg.G)) {
         ayc.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, kx.M);
      }
   }
}
