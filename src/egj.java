import java.util.function.Consumer;

public class egj {
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

   protected static boolean a(dhy $$0, jh $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(bae.b($$5) * (float)$$2);
            int $$7 = (int)(bae.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(dhb $$0, jh $$1) {
      return $$0.a($$1, egj::c);
   }

   protected static boolean b(dhb $$0, jh $$1) {
      return $$0.a($$1, egj::e);
   }

   protected static void a(jm $$0, int $$1, boolean $$2, Consumer<dxn> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dyj.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dyj.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dyj.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dyj.a : dyj.b));
      }
   }

   protected static void a(dhb $$0, jh $$1, jm $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         jh.a $$5 = $$1.k();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(dkg.sO)) {
               $$3x = $$3x.b(dpy.d, Boolean.valueOf($$0.z($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(dhb $$0, jh $$1) {
      dxn $$2 = $$0.a_($$1);
      if ($$2.a(axu.bu)) {
         $$0.a($$1, dkg.sP.m(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dxn a(jm $$0, dyj $$1) {
      return dkg.sO.m().b(dpy.b, $$0).b(dpy.c, $$1);
   }

   public static boolean a(dxn $$0) {
      return b($$0) || $$0.a(dkg.K);
   }

   public static boolean b(dxn $$0) {
      return $$0.a(dkg.sP) || $$0.a(axu.bu);
   }

   public static boolean c(dxn $$0) {
      return $$0.l() || $$0.a(dkg.J);
   }

   public static boolean d(dxn $$0) {
      return !$$0.l() && !$$0.a(dkg.J);
   }

   public static boolean e(dxn $$0) {
      return $$0.l() || $$0.a(dkg.J) || $$0.a(dkg.K);
   }
}
