import java.util.function.Consumer;

public class dkk {
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

   protected static boolean a(cng $$0, gu $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(apa.b($$5) * (float)$$2);
            int $$7 = (int)(apa.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(cmn $$0, gu $$1) {
      return $$0.a($$1, dkk::c);
   }

   protected static boolean b(cmn $$0, gu $$1) {
      return $$0.a($$1, dkk::e);
   }

   protected static void a(ha $$0, int $$1, boolean $$2, Consumer<dcb> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dcy.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dcy.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dcy.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dcy.a : dcy.b));
      }
   }

   protected static void a(cmn $$0, gu $$1, ha $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         gu.a $$5 = $$1.j();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(cpo.rs)) {
               $$3x = $$3x.a(cvd.c, Boolean.valueOf($$0.y($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(cmn $$0, gu $$1) {
      dcb $$2 = $$0.a_($$1);
      if ($$2.a(amw.bp)) {
         $$0.a($$1, cpo.rt.n(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dcb a(ha $$0, dcy $$1) {
      return cpo.rs.n().a(cvd.a, $$0).a(cvd.b, $$1);
   }

   public static boolean a(dcb $$0) {
      return b($$0) || $$0.a(cpo.H);
   }

   public static boolean b(dcb $$0) {
      return $$0.a(cpo.rt) || $$0.a(amw.bp);
   }

   public static boolean c(dcb $$0) {
      return $$0.i() || $$0.a(cpo.G);
   }

   public static boolean d(dcb $$0) {
      return !$$0.i() && !$$0.a(cpo.G);
   }

   public static boolean e(dcb $$0) {
      return $$0.i() || $$0.a(cpo.G) || $$0.a(cpo.H);
   }
}
