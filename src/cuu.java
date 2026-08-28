import javax.annotation.Nullable;

public class cuu extends cwi {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cuu(cwi.a $$0) {
      super($$0);
   }

   @Override
   public bsk a(daf $$0) {
      dfm $$1 = $$0.q();
      jh $$2 = $$0.a();
      jh $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.C) {
            $$0.o().a(ear.C);
            $$1.c(1505, $$2, 15);
         }

         return bsk.a;
      } else {
         dvv $$4 = $$1.a_($$2);
         boolean $$5 = $$4.c($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.C) {
               $$0.o().a(ear.C);
               $$1.c(1505, $$3, 15);
            }

            return bsk.a;
         } else {
            return bsk.e;
         }
      }
   }

   public static boolean a(cwm $$0, dfm $$1, jh $$2) {
      dvv $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dit $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof arp) {
            if ($$4.a($$1, $$1.A, $$2, $$3)) {
               $$4.a((arp)$$1, $$1.A, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cwm $$0, dfm $$1, jh $$2, @Nullable jm $$3) {
      if ($$1.a_($$2).a(dis.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof arp)) {
            return true;
         } else {
            azu $$4 = $$1.G_();

            label80:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               jh $$6 = $$2;
               dvv $$7 = dis.bw.m();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).m($$1, $$6)) {
                     continue label80;
                  }
               }

               jq<dgo> $$9 = $$1.t($$6);
               if ($$9.a(axb.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = lz.e.a(axc.at, $$1.A).map($$0x -> ((diq)$$0x.a()).m()).orElse($$7);
                     if ($$7.b(dib.c)) {
                        $$7 = $$7.b(dib.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = lz.e.a(axc.ar, $$1.A).map($$0x -> ((diq)$$0x.a()).m()).orElse($$7);
                  }
               }

               if ($$7.a(axc.at, $$0x -> $$0x.b(dib.c))) {
                  for (int $$10 = 0; !$$7.a((dfp)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.b(dib.c, jm.c.a.a($$4));
                  }
               }

               if ($$7.a((dfp)$$1, $$6)) {
                  dvv $$11 = $$1.a_($$6);
                  if ($$11.a(dis.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dis.bw) && ((dit)dis.bw).b($$1, $$6, $$11) && $$4.a(10) == 0) {
                     ((dit)dis.bw).a((arp)$$1, $$4, $$6, $$11);
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

   public static void a(dfn $$0, jh $$1, int $$2) {
      dvv $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dit $$4) {
         jh $$5 = $$4.a($$1);
         switch ($$4.aq_()) {
            case a:
               azq.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, ls.O);
               break;
            case b:
               azq.a($$0, $$5, $$2, ls.O);
         }
      } else if ($$3.a(dis.G)) {
         azq.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, ls.O);
      }
   }
}
