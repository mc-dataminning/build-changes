import javax.annotation.Nullable;

public class cnn extends cpl {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cnn(cpl.a $$0) {
      super($$0);
   }

   @Override
   public bml a(crz $$0) {
      cwe $$1 = $$0.q();
      ib $$2 = $$0.a();
      ib $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.B) {
            $$0.o().b(dqr.C);
            $$1.c(1505, $$2, 15);
         }

         return bml.a($$1.B);
      } else {
         dme $$4 = $$1.a_($$2);
         boolean $$5 = $$4.d($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
               $$0.o().b(dqr.C);
               $$1.c(1505, $$3, 15);
            }

            return bml.a($$1.B);
         } else {
            return bml.d;
         }
      }
   }

   public static boolean a(cpq $$0, cwe $$1, ib $$2) {
      dme $$3 = $$1.a_($$2);
      if ($$3.b() instanceof czi $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof apa) {
            if ($$4.a($$1, $$1.z, $$2, $$3)) {
               $$4.a((apa)$$1, $$1.z, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cpq $$0, cwe $$1, ib $$2, @Nullable ih $$3) {
      if ($$1.a_($$2).a(czh.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof apa)) {
            return true;
         } else {
            awt $$4 = $$1.F_();

            label78:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               ib $$6 = $$2;
               dme $$7 = czh.bw.o();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).r($$1, $$6)) {
                     continue label78;
                  }
               }

               il<cxd> $$9 = $$1.t($$6);
               if ($$9.a(aud.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = kh.e.a(aue.aq, $$1.z).map($$0x -> ((czf)$$0x.a()).o()).orElse($$7);
                     if ($$7.b(cyq.c)) {
                        $$7 = $$7.a(cyq.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = kh.e.a(aue.ao, $$1.z).map($$0x -> ((czf)$$0x.a()).o()).orElse($$7);
                  }
               }

               if ($$7.a(aue.aq, $$0x -> $$0x.b(cyq.c))) {
                  for (int $$10 = 0; !$$7.a((cwh)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.a(cyq.c, ih.c.a.a($$4));
                  }
               }

               if ($$7.a((cwh)$$1, $$6)) {
                  dme $$11 = $$1.a_($$6);
                  if ($$11.a(czh.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(czh.bw) && $$4.a(10) == 0) {
                     ((czi)czh.bw).a((apa)$$1, $$4, $$6, $$11);
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

   public static void a(cwf $$0, ib $$1, int $$2) {
      dme $$3 = $$0.a_($$1);
      if ($$3.b() instanceof czi $$4) {
         ib $$5 = $$4.a($$1);
         switch ($$4.au_()) {
            case a:
               awp.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, kb.M);
               break;
            case b:
               awp.a($$0, $$5, $$2, kb.M);
         }
      } else if ($$3.a(czh.G)) {
         awp.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, kb.M);
      }
   }
}
