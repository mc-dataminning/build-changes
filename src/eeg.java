import java.util.function.Consumer;

public class eeg {
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

   protected static boolean a(dfy $$0, jh $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(azk.b($$5) * (float)$$2);
            int $$7 = (int)(azk.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(dfc $$0, jh $$1) {
      return $$0.a($$1, eeg::c);
   }

   protected static boolean b(dfc $$0, jh $$1) {
      return $$0.a($$1, eeg::e);
   }

   protected static void a(jm $$0, int $$1, boolean $$2, Consumer<dvj> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dwg.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dwg.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dwg.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dwg.a : dwg.b));
      }
   }

   protected static void a(dfc $$0, jh $$1, jm $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         jh.a $$5 = $$1.k();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(dig.st)) {
               $$3x = $$3x.b(dnv.d, Boolean.valueOf($$0.z($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(dfc $$0, jh $$1) {
      dvj $$2 = $$0.a_($$1);
      if ($$2.a(axa.bt)) {
         $$0.a($$1, dig.su.m(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dvj a(jm $$0, dwg $$1) {
      return dig.st.m().b(dnv.b, $$0).b(dnv.c, $$1);
   }

   public static boolean a(dvj $$0) {
      return b($$0) || $$0.a(dig.H);
   }

   public static boolean b(dvj $$0) {
      return $$0.a(dig.su) || $$0.a(axa.bt);
   }

   public static boolean c(dvj $$0) {
      return $$0.l() || $$0.a(dig.G);
   }

   public static boolean d(dvj $$0) {
      return !$$0.l() && !$$0.a(dig.G);
   }

   public static boolean e(dvj $$0) {
      return $$0.l() || $$0.a(dig.G) || $$0.a(dig.H);
   }
}
