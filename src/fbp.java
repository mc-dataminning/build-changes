import com.google.common.annotations.VisibleForTesting;
import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;
import java.util.Objects;

public final class fbp {
   public static final double a = 1.0E-7;
   public static final double b = 1.0E-6;
   private static final fbs d = af.a(() -> {
      fbh $$0 = new fbb(1, 1, 1);
      $$0.c(0, 0, 0);
      return new fbf($$0);
   });
   public static final fbs c = a(
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY
   );
   private static final fbs e = new fba(
      new fbb(0, 0, 0), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0})
   );

   public static fbs a() {
      return e;
   }

   public static fbs b() {
      return d;
   }

   public static fbs a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      if (!($$0 > $$3) && !($$1 > $$4) && !($$2 > $$5)) {
         return b($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         throw new IllegalArgumentException("The min values need to be smaller or equals to the max values");
      }
   }

   public static fbs b(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      if (!($$3 - $$0 < 1.0E-7) && !($$4 - $$1 < 1.0E-7) && !($$5 - $$2 < 1.0E-7)) {
         int $$6 = a($$0, $$3);
         int $$7 = a($$1, $$4);
         int $$8 = a($$2, $$5);
         if ($$6 < 0 || $$7 < 0 || $$8 < 0) {
            return new fba(
               d.a, DoubleArrayList.wrap(new double[]{$$0, $$3}), DoubleArrayList.wrap(new double[]{$$1, $$4}), DoubleArrayList.wrap(new double[]{$$2, $$5})
            );
         } else if ($$6 == 0 && $$7 == 0 && $$8 == 0) {
            return b();
         } else {
            int $$9 = 1 << $$6;
            int $$10 = 1 << $$7;
            int $$11 = 1 << $$8;
            fbb $$12 = fbb.a(
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
            return new fbf($$12);
         }
      } else {
         return a();
      }
   }

   public static fbs a(fat $$0) {
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

   public static fbs a(fbs $$0, fbs $$1) {
      return a($$0, $$1, fbc.o);
   }

   public static fbs a(fbs $$0, fbs... $$1) {
      return Arrays.stream($$1).reduce($$0, fbp::a);
   }

   public static fbs a(fbs $$0, fbs $$1, fbc $$2) {
      return b($$0, $$1, $$2).d();
   }

   public static fbs b(fbs $$0, fbs $$1, fbc $$2) {
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
            fbk $$5 = a(1, $$0.a(jn.a.a), $$1.a(jn.a.a), $$3, $$4);
            fbk $$6 = a($$5.size() - 1, $$0.a(jn.a.b), $$1.a(jn.a.b), $$3, $$4);
            fbk $$7 = a(($$5.size() - 1) * ($$6.size() - 1), $$0.a(jn.a.c), $$1.a(jn.a.c), $$3, $$4);
            fbb $$8 = fbb.a($$0.a, $$1.a, $$5, $$6, $$7, $$2);
            return (fbs)($$5 instanceof fbg && $$6 instanceof fbg && $$7 instanceof fbg ? new fbf($$8) : new fba($$8, $$5.a(), $$6.a(), $$7.a()));
         }
      }
   }

   public static boolean c(fbs $$0, fbs $$1, fbc $$2) {
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

               fbk $$8 = a(1, $$0.a(jn.a.a), $$1.a(jn.a.a), $$5, $$6);
               fbk $$9 = a($$8.size() - 1, $$0.a(jn.a.b), $$1.a(jn.a.b), $$5, $$6);
               fbk $$10 = a(($$8.size() - 1) * ($$9.size() - 1), $$0.a(jn.a.c), $$1.a(jn.a.c), $$5, $$6);
               return a($$8, $$9, $$10, $$0.a, $$1.a, $$2);
            }
         } else {
            return $$2.apply(!$$3, !$$4);
         }
      }
   }

   private static boolean a(fbk $$0, fbk $$1, fbk $$2, fbh $$3, fbh $$4, fbc $$5) {
      return !$$0.a(($$5x, $$6, $$7) -> $$1.a(($$6x, $$7x, $$8) -> $$2.a(($$7xx, $$8x, $$9) -> !$$5.apply($$3.e($$5x, $$6x, $$7xx), $$4.e($$6, $$7x, $$8x)))));
   }

   public static double a(jn.a $$0, fat $$1, Iterable<fbs> $$2, double $$3) {
      for (fbs $$4 : $$2) {
         if (Math.abs($$3) < 1.0E-7) {
            return 0.0;
         }

         $$3 = $$4.a($$0, $$1, $$3);
      }

      return $$3;
   }

   public static boolean a(fbs $$0, fbs $$1, jn $$2) {
      if ($$0 == b() && $$1 == b()) {
         return true;
      } else if ($$1.c()) {
         return false;
      } else {
         jn.a $$3 = $$2.o();
         jn.b $$4 = $$2.f();
         fbs $$5 = $$4 == jn.b.a ? $$0 : $$1;
         fbs $$6 = $$4 == jn.b.a ? $$1 : $$0;
         fbc $$7 = $$4 == jn.b.a ? fbc.e : fbc.c;
         return DoubleMath.fuzzyEquals($$5.c($$3), 1.0, 1.0E-7)
            && DoubleMath.fuzzyEquals($$6.b($$3), 0.0, 1.0E-7)
            && !c(new fbq($$5, $$3, $$5.a.c($$3) - 1), new fbq($$6, $$3, 0), $$7);
      }
   }

   public static boolean b(fbs $$0, fbs $$1, jn $$2) {
      if ($$0 != b() && $$1 != b()) {
         jn.a $$3 = $$2.o();
         jn.b $$4 = $$2.f();
         fbs $$5 = $$4 == jn.b.a ? $$0 : $$1;
         fbs $$6 = $$4 == jn.b.a ? $$1 : $$0;
         if (!DoubleMath.fuzzyEquals($$5.c($$3), 1.0, 1.0E-7)) {
            $$5 = a();
         }

         if (!DoubleMath.fuzzyEquals($$6.b($$3), 0.0, 1.0E-7)) {
            $$6 = a();
         }

         return !c(b(), b(new fbq($$5, $$3, $$5.a.c($$3) - 1), new fbq($$6, $$3, 0), fbc.o), fbc.e);
      } else {
         return true;
      }
   }

   public static boolean b(fbs $$0, fbs $$1) {
      if ($$0 == b() || $$1 == b()) {
         return true;
      } else {
         return $$0.c() && $$1.c() ? false : !c(b(), b($$0, $$1, fbc.o), fbc.e);
      }
   }

   @VisibleForTesting
   protected static fbk a(int $$0, DoubleList $$1, DoubleList $$2, boolean $$3, boolean $$4) {
      int $$5 = $$1.size() - 1;
      int $$6 = $$2.size() - 1;
      if ($$1 instanceof fbe && $$2 instanceof fbe) {
         long $$7 = a($$5, $$6);
         if ((long)$$0 * $$7 <= 256L) {
            return new fbg($$5, $$6);
         }
      }

      if ($$1.getDouble($$5) < $$2.getDouble(0) - 1.0E-7) {
         return new fbn($$1, $$2, false);
      } else if ($$2.getDouble($$6) < $$1.getDouble(0) - 1.0E-7) {
         return new fbn($$2, $$1, true);
      } else {
         return (fbk)($$5 == $$6 && Objects.equals($$1, $$2) ? new fbj($$1) : new fbl($$1, $$2, $$3, $$4));
      }
   }

   public interface a {
      void consume(double var1, double var3, double var5, double var7, double var9, double var11);
   }
}
