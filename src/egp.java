import java.util.function.Consumer;

public class egp {
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

   protected static boolean a(dhy $$0, ji $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(ayz.b($$5) * (float)$$2);
            int $$7 = (int)(ayz.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(dha $$0, ji $$1) {
      return $$0.a($$1, egp::c);
   }

   protected static boolean b(dha $$0, ji $$1) {
      return $$0.a($$1, egp::e);
   }

   protected static void a(jn $$0, int $$1, boolean $$2, Consumer<dxq> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dyn.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dyn.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dyn.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dyn.a : dyn.b));
      }
   }

   protected static void a(dha $$0, ji $$1, jn $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         ji.a $$5 = $$1.k();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(dkg.sV)) {
               $$3x = $$3x.b(dqa.d, Boolean.valueOf($$0.z($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(dha $$0, ji $$1) {
      dxq $$2 = $$0.a_($$1);
      if ($$2.a(awp.bu)) {
         $$0.a($$1, dkg.sW.m(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dxq a(jn $$0, dyn $$1) {
      return dkg.sV.m().b(dqa.b, $$0).b(dqa.c, $$1);
   }

   public static boolean a(dxq $$0) {
      return b($$0) || $$0.a(dkg.K);
   }

   public static boolean b(dxq $$0) {
      return $$0.a(dkg.sW) || $$0.a(awp.bu);
   }

   public static boolean c(dxq $$0) {
      return $$0.l() || $$0.a(dkg.J);
   }

   public static boolean d(dxq $$0) {
      return !$$0.l() && !$$0.a(dkg.J);
   }

   public static boolean e(dxq $$0) {
      return $$0.l() || $$0.a(dkg.J) || $$0.a(dkg.K);
   }
}
