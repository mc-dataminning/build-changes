import com.google.common.annotations.VisibleForTesting;
import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;
import java.util.Objects;

public final class fci {
   public static final double a = 1.0E-7;
   public static final double b = 1.0E-6;
   private static final fcl d = ae.a(() -> {
      fca $$0 = new fbu(1, 1, 1);
      $$0.c(0, 0, 0);
      return new fby($$0);
   });
   public static final fcl c = a(
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY
   );
   private static final fcl e = new fbt(
      new fbu(0, 0, 0), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0})
   );

   public static fcl a() {
      return e;
   }

   public static fcl b() {
      return d;
   }

   public static fcl a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      if (!($$0 > $$3) && !($$1 > $$4) && !($$2 > $$5)) {
         return b($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         throw new IllegalArgumentException("The min values need to be smaller or equals to the max values");
      }
   }

   public static fcl b(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      if (!($$3 - $$0 < 1.0E-7) && !($$4 - $$1 < 1.0E-7) && !($$5 - $$2 < 1.0E-7)) {
         int $$6 = a($$0, $$3);
         int $$7 = a($$1, $$4);
         int $$8 = a($$2, $$5);
         if ($$6 < 0 || $$7 < 0 || $$8 < 0) {
            return new fbt(
               d.a, DoubleArrayList.wrap(new double[]{$$0, $$3}), DoubleArrayList.wrap(new double[]{$$1, $$4}), DoubleArrayList.wrap(new double[]{$$2, $$5})
            );
         } else if ($$6 == 0 && $$7 == 0 && $$8 == 0) {
            return b();
         } else {
            int $$9 = 1 << $$6;
            int $$10 = 1 << $$7;
            int $$11 = 1 << $$8;
            fbu $$12 = fbu.a(
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
            return new fby($$12);
         }
      } else {
         return a();
      }
   }

   public static fcl a(fbm $$0) {
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

   public static fcl a(fcl $$0, fcl $$1) {
      return a($$0, $$1, fbv.o);
   }

   public static fcl a(fcl $$0, fcl... $$1) {
      return Arrays.stream($$1).reduce($$0, fci::a);
   }

   public static fcl a(fcl $$0, fcl $$1, fbv $$2) {
      return b($$0, $$1, $$2).d();
   }

   public static fcl b(fcl $$0, fcl $$1, fbv $$2) {
      if ($$2.apply(false, false)) {
         throw (IllegalArgumentException)ae.b(new IllegalArgumentException());
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
            fcd $$5 = a(1, $$0.a(jm.a.a), $$1.a(jm.a.a), $$3, $$4);
            fcd $$6 = a($$5.size() - 1, $$0.a(jm.a.b), $$1.a(jm.a.b), $$3, $$4);
            fcd $$7 = a(($$5.size() - 1) * ($$6.size() - 1), $$0.a(jm.a.c), $$1.a(jm.a.c), $$3, $$4);
            fbu $$8 = fbu.a($$0.a, $$1.a, $$5, $$6, $$7, $$2);
            return (fcl)($$5 instanceof fbz && $$6 instanceof fbz && $$7 instanceof fbz ? new fby($$8) : new fbt($$8, $$5.a(), $$6.a(), $$7.a()));
         }
      }
   }

   public static boolean c(fcl $$0, fcl $$1, fbv $$2) {
      if ($$2.apply(false, false)) {
         throw (IllegalArgumentException)ae.b(new IllegalArgumentException());
      } else {
         boolean $$3 = $$0.c();
         boolean $$4 = $$1.c();
         if (!$$3 && !$$4) {
            if ($$0 == $$1) {
               return $$2.apply(true, true);
            } else {
               boolean $$5 = $$2.apply(true, false);
               boolean $$6 = $$2.apply(false, true);

               for (jm.a $$7 : je.d) {
                  if ($$0.c($$7) < $$1.b($$7) - 1.0E-7) {
                     return $$5 || $$6;
                  }

                  if ($$1.c($$7) < $$0.b($$7) - 1.0E-7) {
                     return $$5 || $$6;
                  }
               }

               fcd $$8 = a(1, $$0.a(jm.a.a), $$1.a(jm.a.a), $$5, $$6);
               fcd $$9 = a($$8.size() - 1, $$0.a(jm.a.b), $$1.a(jm.a.b), $$5, $$6);
               fcd $$10 = a(($$8.size() - 1) * ($$9.size() - 1), $$0.a(jm.a.c), $$1.a(jm.a.c), $$5, $$6);
               return a($$8, $$9, $$10, $$0.a, $$1.a, $$2);
            }
         } else {
            return $$2.apply(!$$3, !$$4);
         }
      }
   }

   private static boolean a(fcd $$0, fcd $$1, fcd $$2, fca $$3, fca $$4, fbv $$5) {
      return !$$0.a(($$5x, $$6, $$7) -> $$1.a(($$6x, $$7x, $$8) -> $$2.a(($$7xx, $$8x, $$9) -> !$$5.apply($$3.e($$5x, $$6x, $$7xx), $$4.e($$6, $$7x, $$8x)))));
   }

   public static double a(jm.a $$0, fbm $$1, Iterable<fcl> $$2, double $$3) {
      for (fcl $$4 : $$2) {
         if (Math.abs($$3) < 1.0E-7) {
            return 0.0;
         }

         $$3 = $$4.a($$0, $$1, $$3);
      }

      return $$3;
   }

   public static boolean a(fcl $$0, fcl $$1, jm $$2) {
      if ($$0 == b() && $$1 == b()) {
         return true;
      } else if ($$1.c()) {
         return false;
      } else {
         jm.a $$3 = $$2.o();
         jm.b $$4 = $$2.f();
         fcl $$5 = $$4 == jm.b.a ? $$0 : $$1;
         fcl $$6 = $$4 == jm.b.a ? $$1 : $$0;
         fbv $$7 = $$4 == jm.b.a ? fbv.e : fbv.c;
         return DoubleMath.fuzzyEquals($$5.c($$3), 1.0, 1.0E-7)
            && DoubleMath.fuzzyEquals($$6.b($$3), 0.0, 1.0E-7)
            && !c(new fcj($$5, $$3, $$5.a.c($$3) - 1), new fcj($$6, $$3, 0), $$7);
      }
   }

   public static boolean b(fcl $$0, fcl $$1, jm $$2) {
      if ($$0 != b() && $$1 != b()) {
         jm.a $$3 = $$2.o();
         jm.b $$4 = $$2.f();
         fcl $$5 = $$4 == jm.b.a ? $$0 : $$1;
         fcl $$6 = $$4 == jm.b.a ? $$1 : $$0;
         if (!DoubleMath.fuzzyEquals($$5.c($$3), 1.0, 1.0E-7)) {
            $$5 = a();
         }

         if (!DoubleMath.fuzzyEquals($$6.b($$3), 0.0, 1.0E-7)) {
            $$6 = a();
         }

         return !c(b(), b(new fcj($$5, $$3, $$5.a.c($$3) - 1), new fcj($$6, $$3, 0), fbv.o), fbv.e);
      } else {
         return true;
      }
   }

   public static boolean b(fcl $$0, fcl $$1) {
      if ($$0 == b() || $$1 == b()) {
         return true;
      } else {
         return $$0.c() && $$1.c() ? false : !c(b(), b($$0, $$1, fbv.o), fbv.e);
      }
   }

   @VisibleForTesting
   protected static fcd a(int $$0, DoubleList $$1, DoubleList $$2, boolean $$3, boolean $$4) {
      int $$5 = $$1.size() - 1;
      int $$6 = $$2.size() - 1;
      if ($$1 instanceof fbx && $$2 instanceof fbx) {
         long $$7 = a($$5, $$6);
         if ((long)$$0 * $$7 <= 256L) {
            return new fbz($$5, $$6);
         }
      }

      if ($$1.getDouble($$5) < $$2.getDouble(0) - 1.0E-7) {
         return new fcg($$1, $$2, false);
      } else if ($$2.getDouble($$6) < $$1.getDouble(0) - 1.0E-7) {
         return new fcg($$2, $$1, true);
      } else {
         return (fcd)($$5 == $$6 && Objects.equals($$1, $$2) ? new fcc($$1) : new fce($$1, $$2, $$3, $$4));
      }
   }

   public interface a {
      void consume(double var1, double var3, double var5, double var7, double var9, double var11);
   }
}
