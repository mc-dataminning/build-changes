import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

public final class fco {
   public static final double a = 1.0E-7;
   public static final double b = 1.0E-6;
   private static final fcr d = af.a(() -> {
      fcg $$0 = new fca(1, 1, 1);
      $$0.c(0, 0, 0);
      return new fce($$0);
   });
   private static final fbx e = new fbx(0.5, 0.5, 0.5);
   public static final fcr c = a(
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY
   );
   private static final fcr f = new fbz(
      new fca(0, 0, 0), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0})
   );

   public static fcr a() {
      return f;
   }

   public static fcr b() {
      return d;
   }

   public static fcr a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      if (!($$0 > $$3) && !($$1 > $$4) && !($$2 > $$5)) {
         return b($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         throw new IllegalArgumentException("The min values need to be smaller or equals to the max values");
      }
   }

   public static fcr b(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      if (!($$3 - $$0 < 1.0E-7) && !($$4 - $$1 < 1.0E-7) && !($$5 - $$2 < 1.0E-7)) {
         int $$6 = a($$0, $$3);
         int $$7 = a($$1, $$4);
         int $$8 = a($$2, $$5);
         if ($$6 < 0 || $$7 < 0 || $$8 < 0) {
            return new fbz(
               d.a, DoubleArrayList.wrap(new double[]{$$0, $$3}), DoubleArrayList.wrap(new double[]{$$1, $$4}), DoubleArrayList.wrap(new double[]{$$2, $$5})
            );
         } else if ($$6 == 0 && $$7 == 0 && $$8 == 0) {
            return b();
         } else {
            int $$9 = 1 << $$6;
            int $$10 = 1 << $$7;
            int $$11 = 1 << $$8;
            fca $$12 = fca.a(
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
            return new fce($$12);
         }
      } else {
         return a();
      }
   }

   public static fcr a(fbs $$0) {
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

   public static fcr a(fcr $$0, fcr $$1) {
      return a($$0, $$1, fcb.o);
   }

   public static fcr a(fcr $$0, fcr... $$1) {
      return Arrays.stream($$1).reduce($$0, fco::a);
   }

   public static fcr a(fcr $$0, fcr $$1, fcb $$2) {
      return b($$0, $$1, $$2).d();
   }

   public static fcr b(fcr $$0, fcr $$1, fcb $$2) {
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
            fcj $$5 = a(1, $$0.a(jn.a.a), $$1.a(jn.a.a), $$3, $$4);
            fcj $$6 = a($$5.size() - 1, $$0.a(jn.a.b), $$1.a(jn.a.b), $$3, $$4);
            fcj $$7 = a(($$5.size() - 1) * ($$6.size() - 1), $$0.a(jn.a.c), $$1.a(jn.a.c), $$3, $$4);
            fca $$8 = fca.a($$0.a, $$1.a, $$5, $$6, $$7, $$2);
            return (fcr)($$5 instanceof fcf && $$6 instanceof fcf && $$7 instanceof fcf ? new fce($$8) : new fbz($$8, $$5.a(), $$6.a(), $$7.a()));
         }
      }
   }

   public static boolean c(fcr $$0, fcr $$1, fcb $$2) {
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

               for (jn.a $$7 : jf.d) {
                  if ($$0.c($$7) < $$1.b($$7) - 1.0E-7) {
                     return $$5 || $$6;
                  }

                  if ($$1.c($$7) < $$0.b($$7) - 1.0E-7) {
                     return $$5 || $$6;
                  }
               }

               fcj $$8 = a(1, $$0.a(jn.a.a), $$1.a(jn.a.a), $$5, $$6);
               fcj $$9 = a($$8.size() - 1, $$0.a(jn.a.b), $$1.a(jn.a.b), $$5, $$6);
               fcj $$10 = a(($$8.size() - 1) * ($$9.size() - 1), $$0.a(jn.a.c), $$1.a(jn.a.c), $$5, $$6);
               return a($$8, $$9, $$10, $$0.a, $$1.a, $$2);
            }
         } else {
            return $$2.apply(!$$3, !$$4);
         }
      }
   }

   private static boolean a(fcj $$0, fcj $$1, fcj $$2, fcg $$3, fcg $$4, fcb $$5) {
      return !$$0.a(($$5x, $$6, $$7) -> $$1.a(($$6x, $$7x, $$8) -> $$2.a(($$7xx, $$8x, $$9) -> !$$5.apply($$3.e($$5x, $$6x, $$7xx), $$4.e($$6, $$7x, $$8x)))));
   }

   public static double a(jn.a $$0, fbs $$1, Iterable<fcr> $$2, double $$3) {
      for (fcr $$4 : $$2) {
         if (Math.abs($$3) < 1.0E-7) {
            return 0.0;
         }

         $$3 = $$4.a($$0, $$1, $$3);
      }

      return $$3;
   }

   public static boolean a(fcr $$0, fcr $$1, jn $$2) {
      if ($$0 == b() && $$1 == b()) {
         return true;
      } else if ($$1.c()) {
         return false;
      } else {
         jn.a $$3 = $$2.o();
         jn.b $$4 = $$2.f();
         fcr $$5 = $$4 == jn.b.a ? $$0 : $$1;
         fcr $$6 = $$4 == jn.b.a ? $$1 : $$0;
         fcb $$7 = $$4 == jn.b.a ? fcb.e : fcb.c;
         return DoubleMath.fuzzyEquals($$5.c($$3), 1.0, 1.0E-7)
            && DoubleMath.fuzzyEquals($$6.b($$3), 0.0, 1.0E-7)
            && !c(new fcp($$5, $$3, $$5.a.c($$3) - 1), new fcp($$6, $$3, 0), $$7);
      }
   }

   public static boolean b(fcr $$0, fcr $$1, jn $$2) {
      if ($$0 != b() && $$1 != b()) {
         jn.a $$3 = $$2.o();
         jn.b $$4 = $$2.f();
         fcr $$5 = $$4 == jn.b.a ? $$0 : $$1;
         fcr $$6 = $$4 == jn.b.a ? $$1 : $$0;
         if (!DoubleMath.fuzzyEquals($$5.c($$3), 1.0, 1.0E-7)) {
            $$5 = a();
         }

         if (!DoubleMath.fuzzyEquals($$6.b($$3), 0.0, 1.0E-7)) {
            $$6 = a();
         }

         return !c(b(), b(new fcp($$5, $$3, $$5.a.c($$3) - 1), new fcp($$6, $$3, 0), fcb.o), fcb.e);
      } else {
         return true;
      }
   }

   public static boolean b(fcr $$0, fcr $$1) {
      if ($$0 == b() || $$1 == b()) {
         return true;
      } else {
         return $$0.c() && $$1.c() ? false : !c(b(), b($$0, $$1, fcb.o), fcb.e);
      }
   }

   @VisibleForTesting
   protected static fcj a(int $$0, DoubleList $$1, DoubleList $$2, boolean $$3, boolean $$4) {
      int $$5 = $$1.size() - 1;
      int $$6 = $$2.size() - 1;
      if ($$1 instanceof fcd && $$2 instanceof fcd) {
         long $$7 = a($$5, $$6);
         if ((long)$$0 * $$7 <= 256L) {
            return new fcf($$5, $$6);
         }
      }

      if ($$1.getDouble($$5) < $$2.getDouble(0) - 1.0E-7) {
         return new fcm($$1, $$2, false);
      } else if ($$2.getDouble($$6) < $$1.getDouble(0) - 1.0E-7) {
         return new fcm($$2, $$1, true);
      } else {
         return (fcj)($$5 == $$6 && Objects.equals($$1, $$2) ? new fci($$1) : new fck($$1, $$2, $$3, $$4));
      }
   }

   public static fcr a(fcr $$0, h $$1) {
      return a($$0, $$1, e);
   }

   public static fcr a(fcr $$0, h $$1, fbx $$2) {
      if ($$1 == h.a) {
         return $$0;
      } else {
         fcg $$3 = $$0.a.a($$1);
         if ($$0 instanceof fce && e.equals($$2)) {
            return new fce($$3);
         } else {
            jn.a $$4 = $$1.b(jn.a.a);
            jn.a $$5 = $$1.b(jn.a.b);
            jn.a $$6 = $$1.b(jn.a.c);
            DoubleList $$7 = $$0.a($$4);
            DoubleList $$8 = $$0.a($$5);
            DoubleList $$9 = $$0.a($$6);
            boolean $$10 = $$1.a($$4);
            boolean $$11 = $$1.a($$5);
            boolean $$12 = $$1.a($$6);
            boolean $$13 = $$4.a($$10, $$11, $$12);
            boolean $$14 = $$5.a($$10, $$11, $$12);
            boolean $$15 = $$6.a($$10, $$11, $$12);
            return new fbz($$3, a($$7, $$13, $$2.a($$4), $$2.d), a($$8, $$14, $$2.a($$5), $$2.e), a($$9, $$15, $$2.a($$6), $$2.f));
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

   public static boolean c(fcr $$0, fcr $$1) {
      return !c($$0, $$1, fcb.g);
   }

   public static Map<jn.a, fcr> a(fcr $$0) {
      return a($$0, e);
   }

   public static Map<jn.a, fcr> a(fcr $$0, fbx $$1) {
      return Maps.newEnumMap(Map.of(jn.a.c, $$0, jn.a.a, a($$0, h.a(0, 90), $$1)));
   }

   public static Map<jn.a, fcr> b(fcr $$0) {
      return b($$0, e);
   }

   public static Map<jn.a, fcr> b(fcr $$0, fbx $$1) {
      return Maps.newEnumMap(Map.of(jn.a.c, $$0, jn.a.a, a($$0, h.a(0, 90), $$1), jn.a.b, a($$0, h.a(90, 0), $$1)));
   }

   public static Map<jn, fcr> c(fcr $$0) {
      return c($$0, e);
   }

   public static Map<jn, fcr> c(fcr $$0, fbx $$1) {
      return Maps.newEnumMap(Map.of(jn.c, $$0, jn.f, a($$0, h.a(0, 90), $$1), jn.d, a($$0, h.a(0, 180), $$1), jn.e, a($$0, h.a(0, 270), $$1)));
   }

   public static Map<jn, fcr> d(fcr $$0) {
      return d($$0, e);
   }

   public static Map<jn, fcr> d(fcr $$0, fbx $$1) {
      return Maps.newEnumMap(
         Map.of(
            jn.c,
            $$0,
            jn.f,
            a($$0, h.a(0, 90), $$1),
            jn.d,
            a($$0, h.a(0, 180), $$1),
            jn.e,
            a($$0, h.a(0, 270), $$1),
            jn.b,
            a($$0, h.a(270, 0), $$1),
            jn.a,
            a($$0, h.a(90, 0), $$1)
         )
      );
   }

   public static Map<dyb, Map<jn, fcr>> e(fcr $$0) {
      return Map.of(dyb.b, c($$0), dyb.a, c(a($$0, h.a(270, 0))), dyb.c, c(a($$0, h.a(90, 180))));
   }

   public interface a {
      void consume(double var1, double var3, double var5, double var7, double var9, double var11);
   }
}
