import javax.annotation.Nullable;

public class crq extends ctl {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public crq(ctl.a $$0) {
      super($$0);
   }

   @Override
   public bpw a(cxd $$0) {
      daz $$1 = $$0.q();
      io $$2 = $$0.a();
      io $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.B) {
            $$0.o().a(dvw.C);
            $$1.c(1505, $$2, 15);
         }

         return bpw.a($$1.B);
      } else {
         drd $$4 = $$1.a_($$2);
         boolean $$5 = $$4.d($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
               $$0.o().a(dvw.C);
               $$1.c(1505, $$3, 15);
            }

            return bpw.a($$1.B);
         } else {
            return bpw.d;
         }
      }
   }

   public static boolean a(ctq $$0, daz $$1, io $$2) {
      drd $$3 = $$1.a_($$2);
      if ($$3.b() instanceof ded $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof aqn) {
            if ($$4.a($$1, $$1.z, $$2, $$3)) {
               $$4.a((aqn)$$1, $$1.z, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(ctq $$0, daz $$1, io $$2, @Nullable it $$3) {
      if ($$1.a_($$2).a(dec.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof aqn)) {
            return true;
         } else {
            aym $$4 = $$1.E_();

            label78:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               io $$6 = $$2;
               drd $$7 = dec.bw.n();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).r($$1, $$6)) {
                     continue label78;
                  }
               }

               ix<dby> $$9 = $$1.t($$6);
               if ($$9.a(avw.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = le.e.a(avx.ar, $$1.z).map($$0x -> ((dea)$$0x.a()).n()).orElse($$7);
                     if ($$7.b(ddl.c)) {
                        $$7 = $$7.a(ddl.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = le.e.a(avx.ap, $$1.z).map($$0x -> ((dea)$$0x.a()).n()).orElse($$7);
                  }
               }

               if ($$7.a(avx.ar, $$0x -> $$0x.b(ddl.c))) {
                  for (int $$10 = 0; !$$7.a((dbc)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.a(ddl.c, it.c.a.a($$4));
                  }
               }

               if ($$7.a((dbc)$$1, $$6)) {
                  drd $$11 = $$1.a_($$6);
                  if ($$11.a(dec.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dec.bw) && $$4.a(10) == 0) {
                     ((ded)dec.bw).a((aqn)$$1, $$4, $$6, $$11);
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

   public static void a(dba $$0, io $$1, int $$2) {
      drd $$3 = $$0.a_($$1);
      if ($$3.b() instanceof ded $$4) {
         io $$5 = $$4.a($$1);
         switch ($$4.ar_()) {
            case a:
               ayi.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, ky.O);
               break;
            case b:
               ayi.a($$0, $$5, $$2, ky.O);
         }
      } else if ($$3.a(dec.G)) {
         ayi.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, ky.O);
      }
   }
}
