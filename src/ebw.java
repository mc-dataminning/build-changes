import java.util.function.Consumer;

public class ebw {
   protected static double a(double $$0, double $$1, double $$2, double $$3) {
      if ($$0 < $$3) {
         $$0 = $$3;
      }

      double $$4 = 0.384;
      double $$5 = $$0 / $$1 * 0.384;
      double $$6 = 0.75 * Math.pow($$5, 1.3333333333333333);
      double $$7 = Math.pow($$5, 0.6666666666666666);
      double $$8 = 0.3333333333333333 * Math.log($$5);
      double $$9 = $$2 * ($$6 - $$7 - $$8);
      $$9 = Math.max($$9, 0.0);
      return $$9 / 0.384 * $$1;
   }

   protected static boolean a(dcv $$0, ir $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(aym.b($$5) * (float)$$2);
            int $$7 = (int)(aym.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(dcb $$0, ir $$1) {
      return $$0.a($$1, ebw::a);
   }

   protected static boolean b(dcb $$0, ir $$1) {
      return $$0.a($$1, ebw::c);
   }

   protected static void a(dla $$0, iw $$1, int $$2, boolean $$3, Consumer<dtc> $$4) {
      if ($$2 >= 3) {
         $$4.accept(a($$0, $$1, dtz.e));

         for (int $$5 = 0; $$5 < $$2 - 3; $$5++) {
            $$4.accept(a($$0, $$1, dtz.d));
         }
      }

      if ($$2 >= 2) {
         $$4.accept(a($$0, $$1, dtz.c));
      }

      if ($$2 >= 1) {
         $$4.accept(a($$0, $$1, $$3 ? dtz.a : dtz.b));
      }
   }

   protected static void a(dfc $$0, dcb $$1, ir $$2, iw $$3, int $$4, boolean $$5) {
      if ($$0 instanceof dla $$6) {
         if (b($$6, $$1.a_($$2.a($$3.g())))) {
            ir.a $$8 = $$2.j();
            a($$6, $$3, $$4, $$5, $$3x -> {
               if ($$3x.b() instanceof dla) {
                  $$3x = $$3x.a(dla.d, Boolean.valueOf($$1.z($$8)));
               }

               $$1.a($$8, $$3x, 2);
               $$8.d($$3);
            });
         }
      }
   }

   protected static boolean a(dcb $$0, ir $$1, dfc $$2) {
      dtc $$3 = $$0.a_($$1);
      if ($$3.a(awe.bu)) {
         $$0.a($$1, $$2.n(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dtc a(dla $$0, iw $$1, dtz $$2) {
      return $$0.n().a(dla.b, $$1).a(dla.c, $$2);
   }

   public static boolean a(dla $$0, dtc $$1) {
      return b($$0, $$1) || $$1.a(dfe.am);
   }

   public static boolean b(dla $$0, dtc $$1) {
      return $$0.m($$1) || $$1.a(awe.bu);
   }

   public static boolean a(dtc $$0) {
      return $$0.i() || $$0.a(dfe.al);
   }

   public static boolean b(dtc $$0) {
      return !$$0.i() && !$$0.a(dfe.al);
   }

   public static boolean c(dtc $$0) {
      return $$0.i() || $$0.a(dfe.al) || $$0.a(dfe.am);
   }
}
