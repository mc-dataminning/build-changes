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

   protected static boolean a(ddq $$0, jd $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(ayn.b($$5) * (float)$$2);
            int $$7 = (int)(ayn.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(dcv $$0, jd $$1) {
      return $$0.a($$1, ebw::c);
   }

   protected static boolean b(dcv $$0, jd $$1) {
      return $$0.a($$1, ebw::e);
   }

   protected static void a(ji $$0, int $$1, boolean $$2, Consumer<dta> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dtx.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dtx.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dtx.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dtx.a : dtx.b));
      }
   }

   protected static void a(dcv $$0, jd $$1, ji $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         jd.a $$5 = $$1.j();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(dfy.st)) {
               $$3x = $$3x.a(dlo.d, Boolean.valueOf($$0.z($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(dcv $$0, jd $$1) {
      dta $$2 = $$0.a_($$1);
      if ($$2.a(awd.bs)) {
         $$0.a($$1, dfy.su.o(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dta a(ji $$0, dtx $$1) {
      return dfy.st.o().a(dlo.b, $$0).a(dlo.c, $$1);
   }

   public static boolean a(dta $$0) {
      return b($$0) || $$0.a(dfy.H);
   }

   public static boolean b(dta $$0) {
      return $$0.a(dfy.su) || $$0.a(awd.bs);
   }

   public static boolean c(dta $$0) {
      return $$0.i() || $$0.a(dfy.G);
   }

   public static boolean d(dta $$0) {
      return !$$0.i() && !$$0.a(dfy.G);
   }

   public static boolean e(dta $$0) {
      return $$0.i() || $$0.a(dfy.G) || $$0.a(dfy.H);
   }
}
