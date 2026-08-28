import java.util.function.Consumer;

public class eat {
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

   protected static boolean a(dcs $$0, iz $$1, int $$2) {
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

   protected static boolean a(dby $$0, iz $$1) {
      return $$0.a($$1, eat::c);
   }

   protected static boolean b(dby $$0, iz $$1) {
      return $$0.a($$1, eat::e);
   }

   protected static void a(je $$0, int $$1, boolean $$2, Consumer<dsb> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, dsy.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, dsy.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, dsy.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? dsy.a : dsy.b));
      }
   }

   protected static void a(dby $$0, iz $$1, je $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         iz.a $$5 = $$1.j();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(dfa.st)) {
               $$3x = $$3x.a(dkq.d, Boolean.valueOf($$0.z($$5)));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(dby $$0, iz $$1) {
      dsb $$2 = $$0.a_($$1);
      if ($$2.a(awo.bs)) {
         $$0.a($$1, dfa.su.o(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static dsb a(je $$0, dsy $$1) {
      return dfa.st.o().a(dkq.b, $$0).a(dkq.c, $$1);
   }

   public static boolean a(dsb $$0) {
      return b($$0) || $$0.a(dfa.H);
   }

   public static boolean b(dsb $$0) {
      return $$0.a(dfa.su) || $$0.a(awo.bs);
   }

   public static boolean c(dsb $$0) {
      return $$0.i() || $$0.a(dfa.G);
   }

   public static boolean d(dsb $$0) {
      return !$$0.i() && !$$0.a(dfa.G);
   }

   public static boolean e(dsb $$0) {
      return $$0.i() || $$0.a(dfa.G) || $$0.a(dfa.H);
   }
}
