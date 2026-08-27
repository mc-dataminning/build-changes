import java.util.function.Consumer;

public class dnh {
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

   protected static boolean a(cqe $$0, gv $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(aro.b($$5) * (float)$$2);
            int $$7 = (int)(aro.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(cpl $$0, gv $$1) {
      return $$0.a($$1, dnh::c);
   }

   protected static boolean b(cpl $$0, gv $$1) {
      return $$0.a($$1, dnh::e);
   }

   protected static void a(hb $$0, int $$1, boolean $$2, Consumer<dey> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dfv.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dfv.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dfv.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dfv.a : dfv.b));
      }
   }

   protected static void a(cpl $$0, gv $$1, hb $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         gv.a $$5 = $$1.j();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(csl.rs)) {
               $$3x = $$3x.a(cya.c, Boolean.valueOf($$0.y($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(cpl $$0, gv $$1) {
      dey $$2 = $$0.a_($$1);
      if ($$2.a(apj.br)) {
         $$0.a($$1, csl.rt.n(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dey a(hb $$0, dfv $$1) {
      return csl.rs.n().a(cya.a, $$0).a(cya.b, $$1);
   }

   public static boolean a(dey $$0) {
      return b($$0) || $$0.a(csl.H);
   }

   public static boolean b(dey $$0) {
      return $$0.a(csl.rt) || $$0.a(apj.br);
   }

   public static boolean c(dey $$0) {
      return $$0.i() || $$0.a(csl.G);
   }

   public static boolean d(dey $$0) {
      return !$$0.i() && !$$0.a(csl.G);
   }

   public static boolean e(dey $$0) {
      return $$0.i() || $$0.a(csl.G) || $$0.a(csl.H);
   }
}
