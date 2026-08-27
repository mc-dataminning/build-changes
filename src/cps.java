import javax.annotation.Nullable;

public class cps extends crn {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cps(crn.a $$0) {
      super($$0);
   }

   @Override
   public bof a(cuz $$0) {
      czg $$1 = $$0.q();
      id $$2 = $$0.a();
      id $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.B) {
            $$0.o().a(dub.C);
            $$1.c(1505, $$2, 15);
         }

         return bof.a($$1.B);
      } else {
         dpi $$4 = $$1.a_($$2);
         boolean $$5 = $$4.d($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
               $$0.o().a(dub.C);
               $$1.c(1505, $$3, 15);
            }

            return bof.a($$1.B);
         } else {
            return bof.d;
         }
      }
   }

   public static boolean a(crs $$0, czg $$1, id $$2) {
      dpi $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dck $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof apu) {
            if ($$4.a($$1, $$1.z, $$2, $$3)) {
               $$4.a((apu)$$1, $$1.z, $$2, $$3);
            }

            $$0.g(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(crs $$0, czg $$1, id $$2, @Nullable ij $$3) {
      if ($$1.a_($$2).a(dcj.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof apu)) {
            return true;
         } else {
            axt $$4 = $$1.E_();

            label78:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               id $$6 = $$2;
               dpi $$7 = dcj.bw.n();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).r($$1, $$6)) {
                     continue label78;
                  }
               }

               in<daf> $$9 = $$1.t($$6);
               if ($$9.a(avd.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = kt.e.a(ave.ar, $$1.z).map($$0x -> ((dch)$$0x.a()).n()).orElse($$7);
                     if ($$7.b(dbs.c)) {
                        $$7 = $$7.a(dbs.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = kt.e.a(ave.ap, $$1.z).map($$0x -> ((dch)$$0x.a()).n()).orElse($$7);
                  }
               }

               if ($$7.a(ave.ar, $$0x -> $$0x.b(dbs.c))) {
                  for (int $$10 = 0; !$$7.a((czj)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.a(dbs.c, ij.c.a.a($$4));
                  }
               }

               if ($$7.a((czj)$$1, $$6)) {
                  dpi $$11 = $$1.a_($$6);
                  if ($$11.a(dcj.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dcj.bw) && $$4.a(10) == 0) {
                     ((dck)dcj.bw).a((apu)$$1, $$4, $$6, $$11);
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

   public static void a(czh $$0, id $$1, int $$2) {
      dpi $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dck $$4) {
         id $$5 = $$4.a($$1);
         switch ($$4.aq_()) {
            case a:
               axp.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, kn.N);
               break;
            case b:
               axp.a($$0, $$5, $$2, kn.N);
         }
      } else if ($$3.a(dcj.G)) {
         axp.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, kn.N);
      }
   }
}
