import java.util.function.Consumer;

public class dpr {
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

   protected static boolean a(csu $$0, ht $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(atm.b($$5) * (float)$$2);
            int $$7 = (int)(atm.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(csb $$0, ht $$1) {
      return $$0.a($$1, dpr::c);
   }

   protected static boolean b(csb $$0, ht $$1) {
      return $$0.a($$1, dpr::e);
   }

   protected static void a(hx $$0, int $$1, boolean $$2, Consumer<dhi> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dif.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dif.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dif.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dif.a : dif.b));
      }
   }

   protected static void a(csb $$0, ht $$1, hx $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         ht.a $$5 = $$1.j();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(cvc.st)) {
               $$3x = $$3x.a(dar.d, Boolean.valueOf($$0.y($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(csb $$0, ht $$1) {
      dhi $$2 = $$0.a_($$1);
      if ($$2.a(arg.br)) {
         $$0.a($$1, cvc.su.o(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dhi a(hx $$0, dif $$1) {
      return cvc.st.o().a(dar.b, $$0).a(dar.c, $$1);
   }

   public static boolean a(dhi $$0) {
      return b($$0) || $$0.a(cvc.H);
   }

   public static boolean b(dhi $$0) {
      return $$0.a(cvc.su) || $$0.a(arg.br);
   }

   public static boolean c(dhi $$0) {
      return $$0.i() || $$0.a(cvc.G);
   }

   public static boolean d(dhi $$0) {
      return !$$0.i() && !$$0.a(cvc.G);
   }

   public static boolean e(dhi $$0) {
      return $$0.i() || $$0.a(cvc.G) || $$0.a(cvc.H);
   }
}
