import java.util.function.Consumer;

public class efr {
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

   protected static boolean a(dhe $$0, ji $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(ayy.b($$5) * (float)$$2);
            int $$7 = (int)(ayy.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(dgh $$0, ji $$1) {
      return $$0.a($$1, efr::c);
   }

   protected static boolean b(dgh $$0, ji $$1) {
      return $$0.a($$1, efr::e);
   }

   protected static void a(jn $$0, int $$1, boolean $$2, Consumer<dwv> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dxr.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dxr.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dxr.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dxr.a : dxr.b));
      }
   }

   protected static void a(dgh $$0, ji $$1, jn $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         ji.a $$5 = $$1.k();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(djm.sV)) {
               $$3x = $$3x.b(dpg.d, Boolean.valueOf($$0.z($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(dgh $$0, ji $$1) {
      dwv $$2 = $$0.a_($$1);
      if ($$2.a(awo.bu)) {
         $$0.a($$1, djm.sW.m(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dwv a(jn $$0, dxr $$1) {
      return djm.sV.m().b(dpg.b, $$0).b(dpg.c, $$1);
   }

   public static boolean a(dwv $$0) {
      return b($$0) || $$0.a(djm.K);
   }

   public static boolean b(dwv $$0) {
      return $$0.a(djm.sW) || $$0.a(awo.bu);
   }

   public static boolean c(dwv $$0) {
      return $$0.l() || $$0.a(djm.J);
   }

   public static boolean d(dwv $$0) {
      return !$$0.l() && !$$0.a(djm.J);
   }

   public static boolean e(dwv $$0) {
      return $$0.l() || $$0.a(djm.J) || $$0.a(djm.K);
   }
}
