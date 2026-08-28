import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

public final class fez {
   public static final double a = 1.0E-7;
   public static final double b = 1.0E-6;
   private static final ffc d = af.a(() -> {
      fer $$0 = new fel(1, 1, 1);
      $$0.c(0, 0, 0);
      return new fep($$0);
   });
   private static final fei e = new fei(0.5, 0.5, 0.5);
   public static final ffc c = a(
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY
   );
   private static final ffc f = new fek(
      new fel(0, 0, 0), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0})
   );

   public static ffc a() {
      return f;
   }

   public static ffc b() {
      return d;
   }

   public static ffc a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      if (!($$0 > $$3) && !($$1 > $$4) && !($$2 > $$5)) {
         return b($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         throw new IllegalArgumentException("The min values need to be smaller or equals to the max values");
      }
   }

   public static ffc b(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      if (!($$3 - $$0 < 1.0E-7) && !($$4 - $$1 < 1.0E-7) && !($$5 - $$2 < 1.0E-7)) {
         int $$6 = a($$0, $$3);
         int $$7 = a($$1, $$4);
         int $$8 = a($$2, $$5);
         if ($$6 < 0 || $$7 < 0 || $$8 < 0) {
            return new fek(
               d.a, DoubleArrayList.wrap(new double[]{$$0, $$3}), DoubleArrayList.wrap(new double[]{$$1, $$4}), DoubleArrayList.wrap(new double[]{$$2, $$5})
            );
         } else if ($$6 == 0 && $$7 == 0 && $$8 == 0) {
            return b();
         } else {
            int $$9 = 1 << $$6;
            int $$10 = 1 << $$7;
            int $$11 = 1 << $$8;
            fel $$12 = fel.a(
               $$9,
               $$10,
               $$11,
               (int)Math.round($$0 * (double)$$9),
               (int)Math.round($$1 * (double)$$10),
               (int)Math.round($$2 * (double)$$11),
               (int)Math.round($$3 * (double)$$9),
               (int)Math.round($$4 * (double)$$10),
               (int)Math.round($$5 * (double)$$11)
            );
            return new fep($$12);
         }
      } else {
         return a();
      }
   }

   public static ffc a(fed $$0) {
      return b($$0.a, $$0.b, $$0.c, $$0.d, $$0.e, $$0.f);
   }

   @VisibleForTesting
   protected static int a(double $$0, double $$1) {
      if (!($$0 < -1.0E-7) && !($$1 > 1.0000001)) {
         for (int $$2 = 0; $$2 <= 3; $$2++) {
            int $$3 = 1 << $$2;
            double $$4 = $$0 * (double)$$3;
            double $$5 = $$1 * (double)$$3;
            boolean $$6 = Math.abs($$4 - (double)Math.round($$4)) < 1.0E-7 * (double)$$3;
            boolean $$7 = Math.abs($$5 - (double)Math.round($$5)) < 1.0E-7 * (double)$$3;
            if ($$6 && $$7) {
               return $$2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   protected static long a(int $$0, int $$1) {
      return (long)$$0 * (long)($$1 / IntMath.gcd($$0, $$1));
   }

   public static ffc a(ffc $$0, ffc $$1) {
      return a($$0, $$1, fem.o);
   }

   public static ffc a(ffc $$0, ffc... $$1) {
      return Arrays.stream($$1).reduce($$0, fez::a);
   }

   public static ffc a(ffc $$0, ffc $$1, fem $$2) {
      return b($$0, $$1, $$2).d();
   }

   public static ffc b(ffc $$0, ffc $$1, fem $$2) {
      if ($$2.apply(false, false)) {
         throw (IllegalArgumentException)af.b(new IllegalArgumentException());
      } else if ($$0 == $$1) {
         return $$2.apply(true, true) ? $$0 : a();
      } else {
         boolean $$3 = $$2.apply(true, false);
         boolean $$4 = $$2.apply(false, true);
         if ($$0.c()) {
            return $$4 ? $$1 : a();
         } else if ($$1.c()) {
            return $$3 ? $$0 : a();
         } else {
            feu $$5 = a(1, $$0.a(ja.a.a), $$1.a(ja.a.a), $$3, $$4);
            feu $$6 = a($$5.size() - 1, $$0.a(ja.a.b), $$1.a(ja.a.b), $$3, $$4);
            feu $$7 = a(($$5.size() - 1) * ($$6.size() - 1), $$0.a(ja.a.c), $$1.a(ja.a.c), $$3, $$4);
            fel $$8 = fel.a($$0.a, $$1.a, $$5, $$6, $$7, $$2);
            return (ffc)($$5 instanceof feq && $$6 instanceof feq && $$7 instanceof feq ? new fep($$8) : new fek($$8, $$5.a(), $$6.a(), $$7.a()));
         }
      }
   }

   public static boolean c(ffc $$0, ffc $$1, fem $$2) {
      if ($$2.apply(false, false)) {
         throw (IllegalArgumentException)af.b(new IllegalArgumentException());
      } else {
         boolean $$3 = $$0.c();
         boolean $$4 = $$1.c();
         if (!$$3 && !$$4) {
            if ($$0 == $$1) {
               return $$2.apply(true, true);
            } else {
               boolean $$5 = $$2.apply(true, false);
               boolean $$6 = $$2.apply(false, true);

               for (ja.a $$7 : ir.d) {
                  if ($$0.c($$7) < $$1.b($$7) - 1.0E-7) {
                     return $$5 || $$6;
                  }

                  if ($$1.c($$7) < $$0.b($$7) - 1.0E-7) {
                     return $$5 || $$6;
                  }
               }

               feu $$8 = a(1, $$0.a(ja.a.a), $$1.a(ja.a.a), $$5, $$6);
               feu $$9 = a($$8.size() - 1, $$0.a(ja.a.b), $$1.a(ja.a.b), $$5, $$6);
               feu $$10 = a(($$8.size() - 1) * ($$9.size() - 1), $$0.a(ja.a.c), $$1.a(ja.a.c), $$5, $$6);
               return a($$8, $$9, $$10, $$0.a, $$1.a, $$2);
            }
         } else {
            return $$2.apply(!$$3, !$$4);
         }
      }
   }

   private static boolean a(feu $$0, feu $$1, feu $$2, fer $$3, fer $$4, fem $$5) {
      return !$$0.a(($$5x, $$6, $$7) -> $$1.a(($$6x, $$7x, $$8) -> $$2.a(($$7xx, $$8x, $$9) -> !$$5.apply($$3.e($$5x, $$6x, $$7xx), $$4.e($$6, $$7x, $$8x)))));
   }

   public static double a(ja.a $$0, fed $$1, Iterable<ffc> $$2, double $$3) {
      for (ffc $$4 : $$2) {
         if (Math.abs($$3) < 1.0E-7) {
            return 0.0;
         }

         $$3 = $$4.a($$0, $$1, $$3);
      }

      return $$3;
   }

   public static boolean a(ffc $$0, ffc $$1, ja $$2) {
      if ($$0 == b() && $$1 == b()) {
         return true;
      } else if ($$1.c()) {
         return false;
      } else {
         ja.a $$3 = $$2.o();
         ja.b $$4 = $$2.f();
         ffc $$5 = $$4 == ja.b.a ? $$0 : $$1;
         ffc $$6 = $$4 == ja.b.a ? $$1 : $$0;
         fem $$7 = $$4 == ja.b.a ? fem.e : fem.c;
         return DoubleMath.fuzzyEquals($$5.c($$3), 1.0, 1.0E-7)
            && DoubleMath.fuzzyEquals($$6.b($$3), 0.0, 1.0E-7)
            && !c(new ffa($$5, $$3, $$5.a.c($$3) - 1), new ffa($$6, $$3, 0), $$7);
      }
   }

   public static boolean b(ffc $$0, ffc $$1, ja $$2) {
      if ($$0 != b() && $$1 != b()) {
         ja.a $$3 = $$2.o();
         ja.b $$4 = $$2.f();
         ffc $$5 = $$4 == ja.b.a ? $$0 : $$1;
         ffc $$6 = $$4 == ja.b.a ? $$1 : $$0;
         if (!DoubleMath.fuzzyEquals($$5.c($$3), 1.0, 1.0E-7)) {
            $$5 = a();
         }

         if (!DoubleMath.fuzzyEquals($$6.b($$3), 0.0, 1.0E-7)) {
            $$6 = a();
         }

         return !c(b(), b(new ffa($$5, $$3, $$5.a.c($$3) - 1), new ffa($$6, $$3, 0), fem.o), fem.e);
      } else {
         return true;
      }
   }

   public static boolean b(ffc $$0, ffc $$1) {
      if ($$0 == b() || $$1 == b()) {
         return true;
      } else {
         return $$0.c() && $$1.c() ? false : !c(b(), b($$0, $$1, fem.o), fem.e);
      }
   }

   @VisibleForTesting
   protected static feu a(int $$0, DoubleList $$1, DoubleList $$2, boolean $$3, boolean $$4) {
      int $$5 = $$1.size() - 1;
      int $$6 = $$2.size() - 1;
      if ($$1 instanceof feo && $$2 instanceof feo) {
         long $$7 = a($$5, $$6);
         if ((long)$$0 * $$7 <= 256L) {
            return new feq($$5, $$6);
         }
      }

      if ($$1.getDouble($$5) < $$2.getDouble(0) - 1.0E-7) {
         return new fex($$1, $$2, false);
      } else if ($$2.getDouble($$6) < $$1.getDouble(0) - 1.0E-7) {
         return new fex($$2, $$1, true);
      } else {
         return (feu)($$5 == $$6 && Objects.equals($$1, $$2) ? new fet($$1) : new fev($$1, $$2, $$3, $$4));
      }
   }

   public static ffc a(ffc $$0, h $$1) {
      return a($$0, $$1, e);
   }

   public static ffc a(ffc $$0, h $$1, fei $$2) {
      if ($$1 == h.a) {
         return $$0;
      } else {
         fer $$3 = $$0.a.a($$1);
         if ($$0 instanceof fep && e.equals($$2)) {
            return new fep($$3);
         } else {
            ja.a $$4 = $$1.b(ja.a.a);
            ja.a $$5 = $$1.b(ja.a.b);
            ja.a $$6 = $$1.b(ja.a.c);
            DoubleList $$7 = $$0.a($$4);
            DoubleList $$8 = $$0.a($$5);
            DoubleList $$9 = $$0.a($$6);
            boolean $$10 = $$1.a($$4);
            boolean $$11 = $$1.a($$5);
            boolean $$12 = $$1.a($$6);
            boolean $$13 = $$4.a($$10, $$11, $$12);
            boolean $$14 = $$5.a($$10, $$11, $$12);
            boolean $$15 = $$6.a($$10, $$11, $$12);
            return new fek($$3, a($$7, $$13, $$2.a($$4), $$2.d), a($$8, $$14, $$2.a($$5), $$2.e), a($$9, $$15, $$2.a($$6), $$2.f));
         }
      }
   }

   @VisibleForTesting
   static DoubleList a(DoubleList $$0, boolean $$1, double $$2, double $$3) {
      if (!$$1 && $$2 == $$3) {
         return $$0;
      } else {
         int $$4 = $$0.size();
         DoubleList $$5 = new DoubleArrayList($$4);
         int $$6 = $$1 ? -1 : 1;

         for (int $$7 = $$1 ? $$4 - 1 : 0; $$7 >= 0 && $$7 < $$4; $$7 += $$6) {
            $$5.add($$3 + (double)$$6 * ($$0.getDouble($$7) - $$2));
         }

         return $$5;
      }
   }

   public static boolean c(ffc $$0, ffc $$1) {
      return !c($$0, $$1, fem.g);
   }

   public static Map<ja.a, ffc> a(ffc $$0) {
      return a($$0, e);
   }

   public static Map<ja.a, ffc> a(ffc $$0, fei $$1) {
      return Maps.newEnumMap(Map.of(ja.a.c, $$0, ja.a.a, a($$0, h.a(0, 90), $$1)));
   }

   public static Map<ja.a, ffc> b(ffc $$0) {
      return b($$0, e);
   }

   public static Map<ja.a, ffc> b(ffc $$0, fei $$1) {
      return Maps.newEnumMap(Map.of(ja.a.c, $$0, ja.a.a, a($$0, h.a(0, 90), $$1), ja.a.b, a($$0, h.a(90, 0), $$1)));
   }

   public static Map<ja, ffc> c(ffc $$0) {
      return c($$0, e);
   }

   public static Map<ja, ffc> c(ffc $$0, fei $$1) {
      return Maps.newEnumMap(Map.of(ja.c, $$0, ja.f, a($$0, h.a(0, 90), $$1), ja.d, a($$0, h.a(0, 180), $$1), ja.e, a($$0, h.a(0, 270), $$1)));
   }

   public static Map<ja, ffc> d(ffc $$0) {
      return d($$0, e);
   }

   public static Map<ja, ffc> d(ffc $$0, fei $$1) {
      return Maps.newEnumMap(
         Map.of(
            ja.c,
            $$0,
            ja.f,
            a($$0, h.a(0, 90), $$1),
            ja.d,
            a($$0, h.a(0, 180), $$1),
            ja.e,
            a($$0, h.a(0, 270), $$1),
            ja.b,
            a($$0, h.a(270, 0), $$1),
            ja.a,
            a($$0, h.a(90, 0), $$1)
         )
      );
   }

   public static Map<eak, Map<ja, ffc>> e(ffc $$0) {
      return Map.of(eak.b, c($$0), eak.a, c(a($$0, h.a(270, 0))), eak.c, c(a($$0, h.a(90, 180))));
   }

   public interface a {
      void consume(double var1, double var3, double var5, double var7, double var9, double var11);
   }
}
