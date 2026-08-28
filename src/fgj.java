import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

public final class fgj {
   public static final double a = 1.0E-7;
   public static final double b = 1.0E-6;
   private static final fgm d = ag.a(() -> {
      fgb $$0 = new ffv(1, 1, 1);
      $$0.c(0, 0, 0);
      return new ffz($$0);
   });
   private static final ffs e = new ffs(0.5, 0.5, 0.5);
   public static final fgm c = a(
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY
   );
   private static final fgm f = new ffu(
      new ffv(0, 0, 0), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0})
   );

   public static fgm a() {
      return f;
   }

   public static fgm b() {
      return d;
   }

   public static fgm a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      if (!($$0 > $$3) && !($$1 > $$4) && !($$2 > $$5)) {
         return b($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         throw new IllegalArgumentException("The min values need to be smaller or equals to the max values");
      }
   }

   public static fgm b(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      if (!($$3 - $$0 < 1.0E-7) && !($$4 - $$1 < 1.0E-7) && !($$5 - $$2 < 1.0E-7)) {
         int $$6 = a($$0, $$3);
         int $$7 = a($$1, $$4);
         int $$8 = a($$2, $$5);
         if ($$6 < 0 || $$7 < 0 || $$8 < 0) {
            return new ffu(
               d.a, DoubleArrayList.wrap(new double[]{$$0, $$3}), DoubleArrayList.wrap(new double[]{$$1, $$4}), DoubleArrayList.wrap(new double[]{$$2, $$5})
            );
         } else if ($$6 == 0 && $$7 == 0 && $$8 == 0) {
            return b();
         } else {
            int $$9 = 1 << $$6;
            int $$10 = 1 << $$7;
            int $$11 = 1 << $$8;
            ffv $$12 = ffv.a(
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
            return new ffz($$12);
         }
      } else {
         return a();
      }
   }

   public static fgm a(ffn $$0) {
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

   public static fgm a(fgm $$0, fgm $$1) {
      return a($$0, $$1, ffw.o);
   }

   public static fgm a(fgm $$0, fgm... $$1) {
      return Arrays.stream($$1).reduce($$0, fgj::a);
   }

   public static fgm a(fgm $$0, fgm $$1, ffw $$2) {
      return b($$0, $$1, $$2).d();
   }

   public static fgm b(fgm $$0, fgm $$1, ffw $$2) {
      if ($$2.apply(false, false)) {
         throw (IllegalArgumentException)ag.b(new IllegalArgumentException());
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
            fge $$5 = a(1, $$0.a(jc.a.a), $$1.a(jc.a.a), $$3, $$4);
            fge $$6 = a($$5.size() - 1, $$0.a(jc.a.b), $$1.a(jc.a.b), $$3, $$4);
            fge $$7 = a(($$5.size() - 1) * ($$6.size() - 1), $$0.a(jc.a.c), $$1.a(jc.a.c), $$3, $$4);
            ffv $$8 = ffv.a($$0.a, $$1.a, $$5, $$6, $$7, $$2);
            return (fgm)($$5 instanceof fga && $$6 instanceof fga && $$7 instanceof fga ? new ffz($$8) : new ffu($$8, $$5.a(), $$6.a(), $$7.a()));
         }
      }
   }

   public static boolean c(fgm $$0, fgm $$1, ffw $$2) {
      if ($$2.apply(false, false)) {
         throw (IllegalArgumentException)ag.b(new IllegalArgumentException());
      } else {
         boolean $$3 = $$0.c();
         boolean $$4 = $$1.c();
         if (!$$3 && !$$4) {
            if ($$0 == $$1) {
               return $$2.apply(true, true);
            } else {
               boolean $$5 = $$2.apply(true, false);
               boolean $$6 = $$2.apply(false, true);

               for (jc.a $$7 : it.d) {
                  if ($$0.c($$7) < $$1.b($$7) - 1.0E-7) {
                     return $$5 || $$6;
                  }

                  if ($$1.c($$7) < $$0.b($$7) - 1.0E-7) {
                     return $$5 || $$6;
                  }
               }

               fge $$8 = a(1, $$0.a(jc.a.a), $$1.a(jc.a.a), $$5, $$6);
               fge $$9 = a($$8.size() - 1, $$0.a(jc.a.b), $$1.a(jc.a.b), $$5, $$6);
               fge $$10 = a(($$8.size() - 1) * ($$9.size() - 1), $$0.a(jc.a.c), $$1.a(jc.a.c), $$5, $$6);
               return a($$8, $$9, $$10, $$0.a, $$1.a, $$2);
            }
         } else {
            return $$2.apply(!$$3, !$$4);
         }
      }
   }

   private static boolean a(fge $$0, fge $$1, fge $$2, fgb $$3, fgb $$4, ffw $$5) {
      return !$$0.a(($$5x, $$6, $$7) -> $$1.a(($$6x, $$7x, $$8) -> $$2.a(($$7xx, $$8x, $$9) -> !$$5.apply($$3.e($$5x, $$6x, $$7xx), $$4.e($$6, $$7x, $$8x)))));
   }

   public static double a(jc.a $$0, ffn $$1, Iterable<fgm> $$2, double $$3) {
      for (fgm $$4 : $$2) {
         if (Math.abs($$3) < 1.0E-7) {
            return 0.0;
         }

         $$3 = $$4.a($$0, $$1, $$3);
      }

      return $$3;
   }

   public static boolean a(fgm $$0, fgm $$1, jc $$2) {
      if ($$0 == b() && $$1 == b()) {
         return true;
      } else if ($$1.c()) {
         return false;
      } else {
         jc.a $$3 = $$2.o();
         jc.b $$4 = $$2.f();
         fgm $$5 = $$4 == jc.b.a ? $$0 : $$1;
         fgm $$6 = $$4 == jc.b.a ? $$1 : $$0;
         ffw $$7 = $$4 == jc.b.a ? ffw.e : ffw.c;
         return DoubleMath.fuzzyEquals($$5.c($$3), 1.0, 1.0E-7)
            && DoubleMath.fuzzyEquals($$6.b($$3), 0.0, 1.0E-7)
            && !c(new fgk($$5, $$3, $$5.a.c($$3) - 1), new fgk($$6, $$3, 0), $$7);
      }
   }

   public static boolean b(fgm $$0, fgm $$1, jc $$2) {
      if ($$0 != b() && $$1 != b()) {
         jc.a $$3 = $$2.o();
         jc.b $$4 = $$2.f();
         fgm $$5 = $$4 == jc.b.a ? $$0 : $$1;
         fgm $$6 = $$4 == jc.b.a ? $$1 : $$0;
         if (!DoubleMath.fuzzyEquals($$5.c($$3), 1.0, 1.0E-7)) {
            $$5 = a();
         }

         if (!DoubleMath.fuzzyEquals($$6.b($$3), 0.0, 1.0E-7)) {
            $$6 = a();
         }

         return !c(b(), b(new fgk($$5, $$3, $$5.a.c($$3) - 1), new fgk($$6, $$3, 0), ffw.o), ffw.e);
      } else {
         return true;
      }
   }

   public static boolean b(fgm $$0, fgm $$1) {
      if ($$0 == b() || $$1 == b()) {
         return true;
      } else {
         return $$0.c() && $$1.c() ? false : !c(b(), b($$0, $$1, ffw.o), ffw.e);
      }
   }

   @VisibleForTesting
   protected static fge a(int $$0, DoubleList $$1, DoubleList $$2, boolean $$3, boolean $$4) {
      int $$5 = $$1.size() - 1;
      int $$6 = $$2.size() - 1;
      if ($$1 instanceof ffy && $$2 instanceof ffy) {
         long $$7 = a($$5, $$6);
         if ((long)$$0 * $$7 <= 256L) {
            return new fga($$5, $$6);
         }
      }

      if ($$1.getDouble($$5) < $$2.getDouble(0) - 1.0E-7) {
         return new fgh($$1, $$2, false);
      } else if ($$2.getDouble($$6) < $$1.getDouble(0) - 1.0E-7) {
         return new fgh($$2, $$1, true);
      } else {
         return (fge)($$5 == $$6 && Objects.equals($$1, $$2) ? new fgd($$1) : new fgf($$1, $$2, $$3, $$4));
      }
   }

   public static fgm a(fgm $$0, h $$1) {
      return a($$0, $$1, e);
   }

   public static fgm a(fgm $$0, h $$1, ffs $$2) {
      if ($$1 == h.a) {
         return $$0;
      } else {
         fgb $$3 = $$0.a.a($$1);
         if ($$0 instanceof ffz && e.equals($$2)) {
            return new ffz($$3);
         } else {
            jc.a $$4 = $$1.b(jc.a.a);
            jc.a $$5 = $$1.b(jc.a.b);
            jc.a $$6 = $$1.b(jc.a.c);
            DoubleList $$7 = $$0.a($$4);
            DoubleList $$8 = $$0.a($$5);
            DoubleList $$9 = $$0.a($$6);
            boolean $$10 = $$1.a($$4);
            boolean $$11 = $$1.a($$5);
            boolean $$12 = $$1.a($$6);
            boolean $$13 = $$4.a($$10, $$11, $$12);
            boolean $$14 = $$5.a($$10, $$11, $$12);
            boolean $$15 = $$6.a($$10, $$11, $$12);
            return new ffu($$3, a($$7, $$13, $$2.a($$4), $$2.d), a($$8, $$14, $$2.a($$5), $$2.e), a($$9, $$15, $$2.a($$6), $$2.f));
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

   public static boolean c(fgm $$0, fgm $$1) {
      return !c($$0, $$1, ffw.g);
   }

   public static Map<jc.a, fgm> a(fgm $$0) {
      return a($$0, e);
   }

   public static Map<jc.a, fgm> a(fgm $$0, ffs $$1) {
      return Maps.newEnumMap(Map.of(jc.a.c, $$0, jc.a.a, a($$0, h.a(i.a, i.b), $$1)));
   }

   public static Map<jc.a, fgm> b(fgm $$0) {
      return b($$0, e);
   }

   public static Map<jc.a, fgm> b(fgm $$0, ffs $$1) {
      return Maps.newEnumMap(Map.of(jc.a.c, $$0, jc.a.a, a($$0, h.a(i.a, i.b), $$1), jc.a.b, a($$0, h.a(i.b, i.a), $$1)));
   }

   public static Map<jc, fgm> c(fgm $$0) {
      return c($$0, e);
   }

   public static Map<jc, fgm> c(fgm $$0, ffs $$1) {
      return Maps.newEnumMap(Map.of(jc.c, $$0, jc.f, a($$0, h.a(i.a, i.b), $$1), jc.d, a($$0, h.a(i.a, i.c), $$1), jc.e, a($$0, h.a(i.a, i.d), $$1)));
   }

   public static Map<jc, fgm> d(fgm $$0) {
      return d($$0, e);
   }

   public static Map<jc, fgm> d(fgm $$0, ffs $$1) {
      return Maps.newEnumMap(
         Map.of(
            jc.c,
            $$0,
            jc.f,
            a($$0, h.a(i.a, i.b), $$1),
            jc.d,
            a($$0, h.a(i.a, i.c), $$1),
            jc.e,
            a($$0, h.a(i.a, i.d), $$1),
            jc.b,
            a($$0, h.a(i.d, i.a), $$1),
            jc.a,
            a($$0, h.a(i.b, i.a), $$1)
         )
      );
   }

   public static Map<ebr, Map<jc, fgm>> e(fgm $$0) {
      return Map.of(ebr.b, c($$0), ebr.a, c(a($$0, h.a(i.d, i.a))), ebr.c, c(a($$0, h.a(i.b, i.c))));
   }

   public interface a {
      void consume(double var1, double var3, double var5, double var7, double var9, double var11);
   }
}
