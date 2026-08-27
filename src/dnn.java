import java.util.function.Consumer;

public class dnn {
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

   protected static boolean a(cqk $$0, gw $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(ars.b($$5) * (float)$$2);
            int $$7 = (int)(ars.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(cpr $$0, gw $$1) {
      return $$0.a($$1, dnn::c);
   }

   protected static boolean b(cpr $$0, gw $$1) {
      return $$0.a($$1, dnn::e);
   }

   protected static void a(hc $$0, int $$1, boolean $$2, Consumer<dfe> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dgb.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dgb.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dgb.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dgb.a : dgb.b));
      }
   }

   protected static void a(cpr $$0, gw $$1, hc $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         gw.a $$5 = $$1.j();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(csr.rs)) {
               $$3x = $$3x.a(cyg.c, Boolean.valueOf($$0.y($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(cpr $$0, gw $$1) {
      dfe $$2 = $$0.a_($$1);
      if ($$2.a(apo.br)) {
         $$0.a($$1, csr.rt.n(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dfe a(hc $$0, dgb $$1) {
      return csr.rs.n().a(cyg.a, $$0).a(cyg.b, $$1);
   }

   public static boolean a(dfe $$0) {
      return b($$0) || $$0.a(csr.H);
   }

   public static boolean b(dfe $$0) {
      return $$0.a(csr.rt) || $$0.a(apo.br);
   }

   public static boolean c(dfe $$0) {
      return $$0.i() || $$0.a(csr.G);
   }

   public static boolean d(dfe $$0) {
      return !$$0.i() && !$$0.a(csr.G);
   }

   public static boolean e(dfe $$0) {
      return $$0.i() || $$0.a(csr.G) || $$0.a(csr.H);
   }
}
