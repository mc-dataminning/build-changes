import com.google.common.annotations.VisibleForTesting;
import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;
import java.util.Objects;

public final class eyu {
   public static final double a = 1.0E-7;
   public static final double b = 1.0E-6;
   private static final eyx d = ad.a(() -> {
      eyn $$0 = new eyh(1, 1, 1);
      $$0.c(0, 0, 0);
      return new eyl($$0);
   });
   public static final eyx c = a(
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY
   );
   private static final eyx e = new eyg(
      new eyh(0, 0, 0), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0})
   );

   public static eyx a() {
      return e;
   }

   public static eyx b() {
      return d;
   }

   public static eyx a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      if (!($$0 > $$3) && !($$1 > $$4) && !($$2 > $$5)) {
         return b($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         throw new IllegalArgumentException("The min values need to be smaller or equals to the max values");
      }
   }

   public static eyx b(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      if (!($$3 - $$0 < 1.0E-7) && !($$4 - $$1 < 1.0E-7) && !($$5 - $$2 < 1.0E-7)) {
         int $$6 = a($$0, $$3);
         int $$7 = a($$1, $$4);
         int $$8 = a($$2, $$5);
         if ($$6 < 0 || $$7 < 0 || $$8 < 0) {
            return new eyg(
               d.a, DoubleArrayList.wrap(new double[]{$$0, $$3}), DoubleArrayList.wrap(new double[]{$$1, $$4}), DoubleArrayList.wrap(new double[]{$$2, $$5})
            );
         } else if ($$6 == 0 && $$7 == 0 && $$8 == 0) {
            return b();
         } else {
            int $$9 = 1 << $$6;
            int $$10 = 1 << $$7;
            int $$11 = 1 << $$8;
            eyh $$12 = eyh.a(
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
            return new eyl($$12);
         }
      } else {
         return a();
      }
   }

   public static eyx a(exz $$0) {
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

   public static eyx a(eyx $$0, eyx $$1) {
      return a($$0, $$1, eyi.o);
   }

   public static eyx a(eyx $$0, eyx... $$1) {
      return Arrays.stream($$1).reduce($$0, eyu::a);
   }

   public static eyx a(eyx $$0, eyx $$1, eyi $$2) {
      return b($$0, $$1, $$2).d();
   }

   public static eyx b(eyx $$0, eyx $$1, eyi $$2) {
      if ($$2.apply(false, false)) {
         throw (IllegalArgumentException)ad.b(new IllegalArgumentException());
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
            eyq $$5 = a(1, $$0.a(jj.a.a), $$1.a(jj.a.a), $$3, $$4);
            eyq $$6 = a($$5.size() - 1, $$0.a(jj.a.b), $$1.a(jj.a.b), $$3, $$4);
            eyq $$7 = a(($$5.size() - 1) * ($$6.size() - 1), $$0.a(jj.a.c), $$1.a(jj.a.c), $$3, $$4);
            eyh $$8 = eyh.a($$0.a, $$1.a, $$5, $$6, $$7, $$2);
            return (eyx)($$5 instanceof eym && $$6 instanceof eym && $$7 instanceof eym ? new eyl($$8) : new eyg($$8, $$5.a(), $$6.a(), $$7.a()));
         }
      }
   }

   public static boolean c(eyx $$0, eyx $$1, eyi $$2) {
      if ($$2.apply(false, false)) {
         throw (IllegalArgumentException)ad.b(new IllegalArgumentException());
      } else {
         boolean $$3 = $$0.c();
         boolean $$4 = $$1.c();
         if (!$$3 && !$$4) {
            if ($$0 == $$1) {
               return $$2.apply(true, true);
            } else {
               boolean $$5 = $$2.apply(true, false);
               boolean $$6 = $$2.apply(false, true);

               for (jj.a $$7 : jb.d) {
                  if ($$0.c($$7) < $$1.b($$7) - 1.0E-7) {
                     return $$5 || $$6;
                  }

                  if ($$1.c($$7) < $$0.b($$7) - 1.0E-7) {
                     return $$5 || $$6;
                  }
               }

               eyq $$8 = a(1, $$0.a(jj.a.a), $$1.a(jj.a.a), $$5, $$6);
               eyq $$9 = a($$8.size() - 1, $$0.a(jj.a.b), $$1.a(jj.a.b), $$5, $$6);
               eyq $$10 = a(($$8.size() - 1) * ($$9.size() - 1), $$0.a(jj.a.c), $$1.a(jj.a.c), $$5, $$6);
               return a($$8, $$9, $$10, $$0.a, $$1.a, $$2);
            }
         } else {
            return $$2.apply(!$$3, !$$4);
         }
      }
   }

   private static boolean a(eyq $$0, eyq $$1, eyq $$2, eyn $$3, eyn $$4, eyi $$5) {
      return !$$0.a(($$5x, $$6, $$7) -> $$1.a(($$6x, $$7x, $$8) -> $$2.a(($$7xx, $$8x, $$9) -> !$$5.apply($$3.e($$5x, $$6x, $$7xx), $$4.e($$6, $$7x, $$8x)))));
   }

   public static double a(jj.a $$0, exz $$1, Iterable<eyx> $$2, double $$3) {
      for (eyx $$4 : $$2) {
         if (Math.abs($$3) < 1.0E-7) {
            return 0.0;
         }

         $$3 = $$4.a($$0, $$1, $$3);
      }

      return $$3;
   }

   public static boolean a(eyx $$0, eyx $$1, jj $$2) {
      if ($$0 == b() && $$1 == b()) {
         return true;
      } else if ($$1.c()) {
         return false;
      } else {
         jj.a $$3 = $$2.o();
         jj.b $$4 = $$2.f();
         eyx $$5 = $$4 == jj.b.a ? $$0 : $$1;
         eyx $$6 = $$4 == jj.b.a ? $$1 : $$0;
         eyi $$7 = $$4 == jj.b.a ? eyi.e : eyi.c;
         return DoubleMath.fuzzyEquals($$5.c($$3), 1.0, 1.0E-7)
            && DoubleMath.fuzzyEquals($$6.b($$3), 0.0, 1.0E-7)
            && !c(new eyv($$5, $$3, $$5.a.c($$3) - 1), new eyv($$6, $$3, 0), $$7);
      }
   }

   public static boolean b(eyx $$0, eyx $$1, jj $$2) {
      if ($$0 != b() && $$1 != b()) {
         jj.a $$3 = $$2.o();
         jj.b $$4 = $$2.f();
         eyx $$5 = $$4 == jj.b.a ? $$0 : $$1;
         eyx $$6 = $$4 == jj.b.a ? $$1 : $$0;
         if (!DoubleMath.fuzzyEquals($$5.c($$3), 1.0, 1.0E-7)) {
            $$5 = a();
         }

         if (!DoubleMath.fuzzyEquals($$6.b($$3), 0.0, 1.0E-7)) {
            $$6 = a();
         }

         return !c(b(), b(new eyv($$5, $$3, $$5.a.c($$3) - 1), new eyv($$6, $$3, 0), eyi.o), eyi.e);
      } else {
         return true;
      }
   }

   public static boolean b(eyx $$0, eyx $$1) {
      if ($$0 == b() || $$1 == b()) {
         return true;
      } else {
         return $$0.c() && $$1.c() ? false : !c(b(), b($$0, $$1, eyi.o), eyi.e);
      }
   }

   @VisibleForTesting
   protected static eyq a(int $$0, DoubleList $$1, DoubleList $$2, boolean $$3, boolean $$4) {
      int $$5 = $$1.size() - 1;
      int $$6 = $$2.size() - 1;
      if ($$1 instanceof eyk && $$2 instanceof eyk) {
         long $$7 = a($$5, $$6);
         if ((long)$$0 * $$7 <= 256L) {
            return new eym($$5, $$6);
         }
      }

      if ($$1.getDouble($$5) < $$2.getDouble(0) - 1.0E-7) {
         return new eys($$1, $$2, false);
      } else if ($$2.getDouble($$6) < $$1.getDouble(0) - 1.0E-7) {
         return new eys($$2, $$1, true);
      } else {
         return (eyq)($$5 == $$6 && Objects.equals($$1, $$2) ? new eyp($$1) : new eyr($$1, $$2, $$3, $$4));
      }
   }

   public interface a {
      void consume(double var1, double var3, double var5, double var7, double var9, double var11);
   }
}
