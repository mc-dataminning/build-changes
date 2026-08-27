import javax.annotation.Nullable;

public class cqd extends cry {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cqd(cry.a $$0) {
      super($$0);
   }

   @Override
   public boq a(cvn $$0) {
      czu $$1 = $$0.q();
      im $$2 = $$0.a();
      im $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.B) {
            $$0.o().a(dur.C);
            $$1.c(1505, $$2, 15);
         }

         return boq.a($$1.B);
      } else {
         dpy $$4 = $$1.a_($$2);
         boolean $$5 = $$4.d($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
               $$0.o().a(dur.C);
               $$1.c(1505, $$3, 15);
            }

            return boq.a($$1.B);
         } else {
            return boq.d;
         }
      }
   }

   public static boolean a(csd $$0, czu $$1, im $$2) {
      dpy $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dcy $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof aqe) {
            if ($$4.a($$1, $$1.z, $$2, $$3)) {
               $$4.a((aqe)$$1, $$1.z, $$2, $$3);
            }

            $$0.g(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(csd $$0, czu $$1, im $$2, @Nullable ir $$3) {
      if ($$1.a_($$2).a(dcx.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof aqe)) {
            return true;
         } else {
            ayd $$4 = $$1.E_();

            label78:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               im $$6 = $$2;
               dpy $$7 = dcx.bw.n();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).r($$1, $$6)) {
                     continue label78;
                  }
               }

               iv<dat> $$9 = $$1.t($$6);
               if ($$9.a(avn.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = lc.e.a(avo.ar, $$1.z).map($$0x -> ((dcv)$$0x.a()).n()).orElse($$7);
                     if ($$7.b(dcg.c)) {
                        $$7 = $$7.a(dcg.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = lc.e.a(avo.ap, $$1.z).map($$0x -> ((dcv)$$0x.a()).n()).orElse($$7);
                  }
               }

               if ($$7.a(avo.ar, $$0x -> $$0x.b(dcg.c))) {
                  for (int $$10 = 0; !$$7.a((czx)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.a(dcg.c, ir.c.a.a($$4));
                  }
               }

               if ($$7.a((czx)$$1, $$6)) {
                  dpy $$11 = $$1.a_($$6);
                  if ($$11.a(dcx.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dcx.bw) && $$4.a(10) == 0) {
                     ((dcy)dcx.bw).a((aqe)$$1, $$4, $$6, $$11);
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

   public static void a(czv $$0, im $$1, int $$2) {
      dpy $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dcy $$4) {
         im $$5 = $$4.a($$1);
         switch ($$4.aq_()) {
            case a:
               axz.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, kw.M);
               break;
            case b:
               axz.a($$0, $$5, $$2, kw.M);
         }
      } else if ($$3.a(dcx.G)) {
         axz.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, kw.M);
      }
   }
}
