import com.google.common.annotations.VisibleForTesting;
import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;
import java.util.Objects;

public final class ewp {
   public static final double a = 1.0E-7;
   public static final double b = 1.0E-6;
   private static final ews d = ac.a(() -> {
      ewi $$0 = new ewc(1, 1, 1);
      $$0.c(0, 0, 0);
      return new ewg($$0);
   });
   public static final ews c = a(
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY
   );
   private static final ews e = new ewb(
      new ewc(0, 0, 0), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0})
   );

   public static ews a() {
      return e;
   }

   public static ews b() {
      return d;
   }

   public static ews a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      if (!($$0 > $$3) && !($$1 > $$4) && !($$2 > $$5)) {
         return b($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         throw new IllegalArgumentException("The min values need to be smaller or equals to the max values");
      }
   }

   public static ews b(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      if (!($$3 - $$0 < 1.0E-7) && !($$4 - $$1 < 1.0E-7) && !($$5 - $$2 < 1.0E-7)) {
         int $$6 = a($$0, $$3);
         int $$7 = a($$1, $$4);
         int $$8 = a($$2, $$5);
         if ($$6 < 0 || $$7 < 0 || $$8 < 0) {
            return new ewb(
               d.a, DoubleArrayList.wrap(new double[]{$$0, $$3}), DoubleArrayList.wrap(new double[]{$$1, $$4}), DoubleArrayList.wrap(new double[]{$$2, $$5})
            );
         } else if ($$6 == 0 && $$7 == 0 && $$8 == 0) {
            return b();
         } else {
            int $$9 = 1 << $$6;
            int $$10 = 1 << $$7;
            int $$11 = 1 << $$8;
            ewc $$12 = ewc.a(
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
            return new ewg($$12);
         }
      } else {
         return a();
      }
   }

   public static ews a(evu $$0) {
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

   public static ews a(ews $$0, ews $$1) {
      return a($$0, $$1, ewd.o);
   }

   public static ews a(ews $$0, ews... $$1) {
      return Arrays.stream($$1).reduce($$0, ewp::a);
   }

   public static ews a(ews $$0, ews $$1, ewd $$2) {
      return b($$0, $$1, $$2).d();
   }

   public static ews b(ews $$0, ews $$1, ewd $$2) {
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
            ewl $$5 = a(1, $$0.a(jf.a.a), $$1.a(jf.a.a), $$3, $$4);
            ewl $$6 = a($$5.size() - 1, $$0.a(jf.a.b), $$1.a(jf.a.b), $$3, $$4);
            ewl $$7 = a(($$5.size() - 1) * ($$6.size() - 1), $$0.a(jf.a.c), $$1.a(jf.a.c), $$3, $$4);
            ewc $$8 = ewc.a($$0.a, $$1.a, $$5, $$6, $$7, $$2);
            return (ews)($$5 instanceof ewh && $$6 instanceof ewh && $$7 instanceof ewh ? new ewg($$8) : new ewb($$8, $$5.a(), $$6.a(), $$7.a()));
         }
      }
   }

   public static boolean c(ews $$0, ews $$1, ewd $$2) {
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

               for (jf.a $$7 : ix.d) {
                  if ($$0.c($$7) < $$1.b($$7) - 1.0E-7) {
                     return $$5 || $$6;
                  }

                  if ($$1.c($$7) < $$0.b($$7) - 1.0E-7) {
                     return $$5 || $$6;
                  }
               }

               ewl $$8 = a(1, $$0.a(jf.a.a), $$1.a(jf.a.a), $$5, $$6);
               ewl $$9 = a($$8.size() - 1, $$0.a(jf.a.b), $$1.a(jf.a.b), $$5, $$6);
               ewl $$10 = a(($$8.size() - 1) * ($$9.size() - 1), $$0.a(jf.a.c), $$1.a(jf.a.c), $$5, $$6);
               return a($$8, $$9, $$10, $$0.a, $$1.a, $$2);
            }
         } else {
            return $$2.apply(!$$3, !$$4);
         }
      }
   }

   private static boolean a(ewl $$0, ewl $$1, ewl $$2, ewi $$3, ewi $$4, ewd $$5) {
      return !$$0.a(($$5x, $$6, $$7) -> $$1.a(($$6x, $$7x, $$8) -> $$2.a(($$7xx, $$8x, $$9) -> !$$5.apply($$3.e($$5x, $$6x, $$7xx), $$4.e($$6, $$7x, $$8x)))));
   }

   public static double a(jf.a $$0, evu $$1, Iterable<ews> $$2, double $$3) {
      for (ews $$4 : $$2) {
         if (Math.abs($$3) < 1.0E-7) {
            return 0.0;
         }

         $$3 = $$4.a($$0, $$1, $$3);
      }

      return $$3;
   }

   public static boolean a(ews $$0, ews $$1, jf $$2) {
      if ($$0 == b() && $$1 == b()) {
         return true;
      } else if ($$1.c()) {
         return false;
      } else {
         jf.a $$3 = $$2.o();
         jf.b $$4 = $$2.f();
         ews $$5 = $$4 == jf.b.a ? $$0 : $$1;
         ews $$6 = $$4 == jf.b.a ? $$1 : $$0;
         ewd $$7 = $$4 == jf.b.a ? ewd.e : ewd.c;
         return DoubleMath.fuzzyEquals($$5.c($$3), 1.0, 1.0E-7)
            && DoubleMath.fuzzyEquals($$6.b($$3), 0.0, 1.0E-7)
            && !c(new ewq($$5, $$3, $$5.a.c($$3) - 1), new ewq($$6, $$3, 0), $$7);
      }
   }

   public static ews a(ews $$0, jf $$1) {
      if ($$0 == b()) {
         return b();
      } else {
         jf.a $$2 = $$1.o();
         boolean $$3;
         int $$4;
         if ($$1.f() == jf.b.a) {
            $$3 = DoubleMath.fuzzyEquals($$0.c($$2), 1.0, 1.0E-7);
            $$4 = $$0.a.c($$2) - 1;
         } else {
            $$3 = DoubleMath.fuzzyEquals($$0.b($$2), 0.0, 1.0E-7);
            $$4 = 0;
         }

         return (ews)(!$$3 ? a() : new ewq($$0, $$2, $$4));
      }
   }

   public static boolean b(ews $$0, ews $$1, jf $$2) {
      if ($$0 != b() && $$1 != b()) {
         jf.a $$3 = $$2.o();
         jf.b $$4 = $$2.f();
         ews $$5 = $$4 == jf.b.a ? $$0 : $$1;
         ews $$6 = $$4 == jf.b.a ? $$1 : $$0;
         if (!DoubleMath.fuzzyEquals($$5.c($$3), 1.0, 1.0E-7)) {
            $$5 = a();
         }

         if (!DoubleMath.fuzzyEquals($$6.b($$3), 0.0, 1.0E-7)) {
            $$6 = a();
         }

         return !c(b(), b(new ewq($$5, $$3, $$5.a.c($$3) - 1), new ewq($$6, $$3, 0), ewd.o), ewd.e);
      } else {
         return true;
      }
   }

   public static boolean b(ews $$0, ews $$1) {
      if ($$0 == b() || $$1 == b()) {
         return true;
      } else {
         return $$0.c() && $$1.c() ? false : !c(b(), b($$0, $$1, ewd.o), ewd.e);
      }
   }

   @VisibleForTesting
   protected static ewl a(int $$0, DoubleList $$1, DoubleList $$2, boolean $$3, boolean $$4) {
      int $$5 = $$1.size() - 1;
      int $$6 = $$2.size() - 1;
      if ($$1 instanceof ewf && $$2 instanceof ewf) {
         long $$7 = a($$5, $$6);
         if ((long)$$0 * $$7 <= 256L) {
            return new ewh($$5, $$6);
         }
      }

      if ($$1.getDouble($$5) < $$2.getDouble(0) - 1.0E-7) {
         return new ewn($$1, $$2, false);
      } else if ($$2.getDouble($$6) < $$1.getDouble(0) - 1.0E-7) {
         return new ewn($$2, $$1, true);
      } else {
         return (ewl)($$5 == $$6 && Objects.equals($$1, $$2) ? new ewk($$1) : new ewm($$1, $$2, $$3, $$4));
      }
   }

   public interface a {
      void consume(double var1, double var3, double var5, double var7, double var9, double var11);
   }
}
