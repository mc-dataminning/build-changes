import java.util.function.Consumer;

public class eea {
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

   protected static boolean a(dfs $$0, jg $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / (float)$$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(azj.b($$5) * (float)$$2);
            int $$7 = (int)(azj.a($$5) * (float)$$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(dew $$0, jg $$1) {
      return $$0.a($$1, eea::c);
   }

   protected static boolean b(dew $$0, jg $$1) {
      return $$0.a($$1, eea::e);
   }

   protected static void a(jl $$0, int $$1, boolean $$2, Consumer<dvd> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dwa.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dwa.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dwa.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dwa.a : dwa.b));
      }
   }

   protected static void a(dew $$0, jg $$1, jl $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         jg.a $$5 = $$1.k();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(dia.st)) {
               $$3x = $$3x.b(dnp.d, Boolean.valueOf($$0.z($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(dew $$0, jg $$1) {
      dvd $$2 = $$0.a_($$1);
      if ($$2.a(awz.bt)) {
         $$0.a($$1, dia.su.m(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dvd a(jl $$0, dwa $$1) {
      return dia.st.m().b(dnp.b, $$0).b(dnp.c, $$1);
   }

   public static boolean a(dvd $$0) {
      return b($$0) || $$0.a(dia.H);
   }

   public static boolean b(dvd $$0) {
      return $$0.a(dia.su) || $$0.a(awz.bt);
   }

   public static boolean c(dvd $$0) {
      return $$0.l() || $$0.a(dia.G);
   }

   public static boolean d(dvd $$0) {
      return !$$0.l() && !$$0.a(dia.G);
   }

   public static boolean e(dvd $$0) {
      return $$0.l() || $$0.a(dia.G) || $$0.a(dia.H);
   }
}
