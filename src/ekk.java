import com.google.common.annotations.VisibleForTesting;
import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;
import java.util.Objects;

public final class ekk {
   public static final double a = 1.0E-7;
   public static final double b = 1.0E-6;
   private static final ekn d = ac.a(() -> {
      ekd $$0 = new ejx(1, 1, 1);
      $$0.c(0, 0, 0);
      return new ekb($$0);
   });
   public static final ekn c = a(
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY
   );
   private static final ekn e = new ejw(
      new ejx(0, 0, 0), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0})
   );

   public static ekn a() {
      return e;
   }

   public static ekn b() {
      return d;
   }

   public static ekn a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      if (!($$0 > $$3) && !($$1 > $$4) && !($$2 > $$5)) {
         return b($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         throw new IllegalArgumentException("The min values need to be smaller or equals to the max values");
      }
   }

   public static ekn b(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      if (!($$3 - $$0 < 1.0E-7) && !($$4 - $$1 < 1.0E-7) && !($$5 - $$2 < 1.0E-7)) {
         int $$6 = a($$0, $$3);
         int $$7 = a($$1, $$4);
         int $$8 = a($$2, $$5);
         if ($$6 < 0 || $$7 < 0 || $$8 < 0) {
            return new ejw(
               d.a, DoubleArrayList.wrap(new double[]{$$0, $$3}), DoubleArrayList.wrap(new double[]{$$1, $$4}), DoubleArrayList.wrap(new double[]{$$2, $$5})
            );
         } else if ($$6 == 0 && $$7 == 0 && $$8 == 0) {
            return b();
         } else {
            int $$9 = 1 << $$6;
            int $$10 = 1 << $$7;
            int $$11 = 1 << $$8;
            ejx $$12 = ejx.a(
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
            return new ekb($$12);
         }
      } else {
         return a();
      }
   }

   public static ekn a(ejp $$0) {
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

   public static ekn a(ekn $$0, ekn $$1) {
      return a($$0, $$1, ejy.o);
   }

   public static ekn a(ekn $$0, ekn... $$1) {
      return Arrays.stream($$1).reduce($$0, ekk::a);
   }

   public static ekn a(ekn $$0, ekn $$1, ejy $$2) {
      return b($$0, $$1, $$2).d();
   }

   public static ekn b(ekn $$0, ekn $$1, ejy $$2) {
      if ($$2.apply(false, false)) {
         throw (IllegalArgumentException)ac.b(new IllegalArgumentException());
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
            ekg $$5 = a(1, $$0.a(hx.a.a), $$1.a(hx.a.a), $$3, $$4);
            ekg $$6 = a($$5.size() - 1, $$0.a(hx.a.b), $$1.a(hx.a.b), $$3, $$4);
            ekg $$7 = a(($$5.size() - 1) * ($$6.size() - 1), $$0.a(hx.a.c), $$1.a(hx.a.c), $$3, $$4);
            ejx $$8 = ejx.a($$0.a, $$1.a, $$5, $$6, $$7, $$2);
            return (ekn)($$5 instanceof ekc && $$6 instanceof ekc && $$7 instanceof ekc ? new ekb($$8) : new ejw($$8, $$5.a(), $$6.a(), $$7.a()));
         }
      }
   }

   public static boolean c(ekn $$0, ekn $$1, ejy $$2) {
      if ($$2.apply(false, false)) {
         throw (IllegalArgumentException)ac.b(new IllegalArgumentException());
      } else {
         boolean $$3 = $$0.c();
         boolean $$4 = $$1.c();
         if (!$$3 && !$$4) {
            if ($$0 == $$1) {
               return $$2.apply(true, true);
            } else {
               boolean $$5 = $$2.apply(true, false);
               boolean $$6 = $$2.apply(false, true);

               for (hx.a $$7 : hr.d) {
                  if ($$0.c($$7) < $$1.b($$7) - 1.0E-7) {
                     return $$5 || $$6;
                  }

                  if ($$1.c($$7) < $$0.b($$7) - 1.0E-7) {
                     return $$5 || $$6;
                  }
               }

               ekg $$8 = a(1, $$0.a(hx.a.a), $$1.a(hx.a.a), $$5, $$6);
               ekg $$9 = a($$8.size() - 1, $$0.a(hx.a.b), $$1.a(hx.a.b), $$5, $$6);
               ekg $$10 = a(($$8.size() - 1) * ($$9.size() - 1), $$0.a(hx.a.c), $$1.a(hx.a.c), $$5, $$6);
               return a($$8, $$9, $$10, $$0.a, $$1.a, $$2);
            }
         } else {
            return $$2.apply(!$$3, !$$4);
         }
      }
   }

   private static boolean a(ekg $$0, ekg $$1, ekg $$2, ekd $$3, ekd $$4, ejy $$5) {
      return !$$0.a(($$5x, $$6, $$7) -> $$1.a(($$6x, $$7x, $$8) -> $$2.a(($$7xx, $$8x, $$9) -> !$$5.apply($$3.d($$5x, $$6x, $$7xx), $$4.d($$6, $$7x, $$8x)))));
   }

   public static double a(hx.a $$0, ejp $$1, Iterable<ekn> $$2, double $$3) {
      for (ekn $$4 : $$2) {
         if (Math.abs($$3) < 1.0E-7) {
            return 0.0;
         }

         $$3 = $$4.a($$0, $$1, $$3);
      }

      return $$3;
   }

   public static boolean a(ekn $$0, ekn $$1, hx $$2) {
      if ($$0 == b() && $$1 == b()) {
         return true;
      } else if ($$1.c()) {
         return false;
      } else {
         hx.a $$3 = $$2.o();
         hx.b $$4 = $$2.f();
         ekn $$5 = $$4 == hx.b.a ? $$0 : $$1;
         ekn $$6 = $$4 == hx.b.a ? $$1 : $$0;
         ejy $$7 = $$4 == hx.b.a ? ejy.e : ejy.c;
         return DoubleMath.fuzzyEquals($$5.c($$3), 1.0, 1.0E-7)
            && DoubleMath.fuzzyEquals($$6.b($$3), 0.0, 1.0E-7)
            && !c(new ekl($$5, $$3, $$5.a.c($$3) - 1), new ekl($$6, $$3, 0), $$7);
      }
   }

   public static ekn a(ekn $$0, hx $$1) {
      if ($$0 == b()) {
         return b();
      } else {
         hx.a $$2 = $$1.o();
         boolean $$3;
         int $$4;
         if ($$1.f() == hx.b.a) {
            $$3 = DoubleMath.fuzzyEquals($$0.c($$2), 1.0, 1.0E-7);
            $$4 = $$0.a.c($$2) - 1;
         } else {
            $$3 = DoubleMath.fuzzyEquals($$0.b($$2), 0.0, 1.0E-7);
            $$4 = 0;
         }

         return (ekn)(!$$3 ? a() : new ekl($$0, $$2, $$4));
      }
   }

   public static boolean b(ekn $$0, ekn $$1, hx $$2) {
      if ($$0 != b() && $$1 != b()) {
         hx.a $$3 = $$2.o();
         hx.b $$4 = $$2.f();
         ekn $$5 = $$4 == hx.b.a ? $$0 : $$1;
         ekn $$6 = $$4 == hx.b.a ? $$1 : $$0;
         if (!DoubleMath.fuzzyEquals($$5.c($$3), 1.0, 1.0E-7)) {
            $$5 = a();
         }

         if (!DoubleMath.fuzzyEquals($$6.b($$3), 0.0, 1.0E-7)) {
            $$6 = a();
         }

         return !c(b(), b(new ekl($$5, $$3, $$5.a.c($$3) - 1), new ekl($$6, $$3, 0), ejy.o), ejy.e);
      } else {
         return true;
      }
   }

   public static boolean b(ekn $$0, ekn $$1) {
      if ($$0 == b() || $$1 == b()) {
         return true;
      } else {
         return $$0.c() && $$1.c() ? false : !c(b(), b($$0, $$1, ejy.o), ejy.e);
      }
   }

   @VisibleForTesting
   protected static ekg a(int $$0, DoubleList $$1, DoubleList $$2, boolean $$3, boolean $$4) {
      int $$5 = $$1.size() - 1;
      int $$6 = $$2.size() - 1;
      if ($$1 instanceof eka && $$2 instanceof eka) {
         long $$7 = a($$5, $$6);
         if ((long)$$0 * $$7 <= 256L) {
            return new ekc($$5, $$6);
         }
      }

      if ($$1.getDouble($$5) < $$2.getDouble(0) - 1.0E-7) {
         return new eki($$1, $$2, false);
      } else if ($$2.getDouble($$6) < $$1.getDouble(0) - 1.0E-7) {
         return new eki($$2, $$1, true);
      } else {
         return (ekg)($$5 == $$6 && Objects.equals($$1, $$2) ? new ekf($$1) : new ekh($$1, $$2, $$3, $$4));
      }
   }

   public interface a {
      void consume(double var1, double var3, double var5, double var7, double var9, double var11);
   }
}
