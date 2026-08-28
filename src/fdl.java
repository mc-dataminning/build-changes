import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

public final class fdl {
   public static final double a = 1.0E-7;
   public static final double b = 1.0E-6;
   private static final fdo d = af.a(() -> {
      fdd $$0 = new fcx(1, 1, 1);
      $$0.c(0, 0, 0);
      return new fdb($$0);
   });
   private static final fcu e = new fcu(0.5, 0.5, 0.5);
   public static final fdo c = a(
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY
   );
   private static final fdo f = new fcw(
      new fcx(0, 0, 0), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0})
   );

   public static fdo a() {
      return f;
   }

   public static fdo b() {
      return d;
   }

   public static fdo a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      if (!($$0 > $$3) && !($$1 > $$4) && !($$2 > $$5)) {
         return b($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         throw new IllegalArgumentException("The min values need to be smaller or equals to the max values");
      }
   }

   public static fdo b(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      if (!($$3 - $$0 < 1.0E-7) && !($$4 - $$1 < 1.0E-7) && !($$5 - $$2 < 1.0E-7)) {
         int $$6 = a($$0, $$3);
         int $$7 = a($$1, $$4);
         int $$8 = a($$2, $$5);
         if ($$6 < 0 || $$7 < 0 || $$8 < 0) {
            return new fcw(
               d.a, DoubleArrayList.wrap(new double[]{$$0, $$3}), DoubleArrayList.wrap(new double[]{$$1, $$4}), DoubleArrayList.wrap(new double[]{$$2, $$5})
            );
         } else if ($$6 == 0 && $$7 == 0 && $$8 == 0) {
            return b();
         } else {
            int $$9 = 1 << $$6;
            int $$10 = 1 << $$7;
            int $$11 = 1 << $$8;
            fcx $$12 = fcx.a(
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
            return new fdb($$12);
         }
      } else {
         return a();
      }
   }

   public static fdo a(fcp $$0) {
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

   public static fdo a(fdo $$0, fdo $$1) {
      return a($$0, $$1, fcy.o);
   }

   public static fdo a(fdo $$0, fdo... $$1) {
      return Arrays.stream($$1).reduce($$0, fdl::a);
   }

   public static fdo a(fdo $$0, fdo $$1, fcy $$2) {
      return b($$0, $$1, $$2).d();
   }

   public static fdo b(fdo $$0, fdo $$1, fcy $$2) {
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
            fdg $$5 = a(1, $$0.a(jo.a.a), $$1.a(jo.a.a), $$3, $$4);
            fdg $$6 = a($$5.size() - 1, $$0.a(jo.a.b), $$1.a(jo.a.b), $$3, $$4);
            fdg $$7 = a(($$5.size() - 1) * ($$6.size() - 1), $$0.a(jo.a.c), $$1.a(jo.a.c), $$3, $$4);
            fcx $$8 = fcx.a($$0.a, $$1.a, $$5, $$6, $$7, $$2);
            return (fdo)($$5 instanceof fdc && $$6 instanceof fdc && $$7 instanceof fdc ? new fdb($$8) : new fcw($$8, $$5.a(), $$6.a(), $$7.a()));
         }
      }
   }

   public static boolean c(fdo $$0, fdo $$1, fcy $$2) {
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

               for (jo.a $$7 : jg.d) {
                  if ($$0.c($$7) < $$1.b($$7) - 1.0E-7) {
                     return $$5 || $$6;
                  }

                  if ($$1.c($$7) < $$0.b($$7) - 1.0E-7) {
                     return $$5 || $$6;
                  }
               }

               fdg $$8 = a(1, $$0.a(jo.a.a), $$1.a(jo.a.a), $$5, $$6);
               fdg $$9 = a($$8.size() - 1, $$0.a(jo.a.b), $$1.a(jo.a.b), $$5, $$6);
               fdg $$10 = a(($$8.size() - 1) * ($$9.size() - 1), $$0.a(jo.a.c), $$1.a(jo.a.c), $$5, $$6);
               return a($$8, $$9, $$10, $$0.a, $$1.a, $$2);
            }
         } else {
            return $$2.apply(!$$3, !$$4);
         }
      }
   }

   private static boolean a(fdg $$0, fdg $$1, fdg $$2, fdd $$3, fdd $$4, fcy $$5) {
      return !$$0.a(($$5x, $$6, $$7) -> $$1.a(($$6x, $$7x, $$8) -> $$2.a(($$7xx, $$8x, $$9) -> !$$5.apply($$3.e($$5x, $$6x, $$7xx), $$4.e($$6, $$7x, $$8x)))));
   }

   public static double a(jo.a $$0, fcp $$1, Iterable<fdo> $$2, double $$3) {
      for (fdo $$4 : $$2) {
         if (Math.abs($$3) < 1.0E-7) {
            return 0.0;
         }

         $$3 = $$4.a($$0, $$1, $$3);
      }

      return $$3;
   }

   public static boolean a(fdo $$0, fdo $$1, jo $$2) {
      if ($$0 == b() && $$1 == b()) {
         return true;
      } else if ($$1.c()) {
         return false;
      } else {
         jo.a $$3 = $$2.o();
         jo.b $$4 = $$2.f();
         fdo $$5 = $$4 == jo.b.a ? $$0 : $$1;
         fdo $$6 = $$4 == jo.b.a ? $$1 : $$0;
         fcy $$7 = $$4 == jo.b.a ? fcy.e : fcy.c;
         return DoubleMath.fuzzyEquals($$5.c($$3), 1.0, 1.0E-7)
            && DoubleMath.fuzzyEquals($$6.b($$3), 0.0, 1.0E-7)
            && !c(new fdm($$5, $$3, $$5.a.c($$3) - 1), new fdm($$6, $$3, 0), $$7);
      }
   }

   public static boolean b(fdo $$0, fdo $$1, jo $$2) {
      if ($$0 != b() && $$1 != b()) {
         jo.a $$3 = $$2.o();
         jo.b $$4 = $$2.f();
         fdo $$5 = $$4 == jo.b.a ? $$0 : $$1;
         fdo $$6 = $$4 == jo.b.a ? $$1 : $$0;
         if (!DoubleMath.fuzzyEquals($$5.c($$3), 1.0, 1.0E-7)) {
            $$5 = a();
         }

         if (!DoubleMath.fuzzyEquals($$6.b($$3), 0.0, 1.0E-7)) {
            $$6 = a();
         }

         return !c(b(), b(new fdm($$5, $$3, $$5.a.c($$3) - 1), new fdm($$6, $$3, 0), fcy.o), fcy.e);
      } else {
         return true;
      }
   }

   public static boolean b(fdo $$0, fdo $$1) {
      if ($$0 == b() || $$1 == b()) {
         return true;
      } else {
         return $$0.c() && $$1.c() ? false : !c(b(), b($$0, $$1, fcy.o), fcy.e);
      }
   }

   @VisibleForTesting
   protected static fdg a(int $$0, DoubleList $$1, DoubleList $$2, boolean $$3, boolean $$4) {
      int $$5 = $$1.size() - 1;
      int $$6 = $$2.size() - 1;
      if ($$1 instanceof fda && $$2 instanceof fda) {
         long $$7 = a($$5, $$6);
         if ((long)$$0 * $$7 <= 256L) {
            return new fdc($$5, $$6);
         }
      }

      if ($$1.getDouble($$5) < $$2.getDouble(0) - 1.0E-7) {
         return new fdj($$1, $$2, false);
      } else if ($$2.getDouble($$6) < $$1.getDouble(0) - 1.0E-7) {
         return new fdj($$2, $$1, true);
      } else {
         return (fdg)($$5 == $$6 && Objects.equals($$1, $$2) ? new fdf($$1) : new fdh($$1, $$2, $$3, $$4));
      }
   }

   public static fdo a(fdo $$0, h $$1) {
      return a($$0, $$1, e);
   }

   public static fdo a(fdo $$0, h $$1, fcu $$2) {
      if ($$1 == h.a) {
         return $$0;
      } else {
         fdd $$3 = $$0.a.a($$1);
         if ($$0 instanceof fdb && e.equals($$2)) {
            return new fdb($$3);
         } else {
            jo.a $$4 = $$1.b(jo.a.a);
            jo.a $$5 = $$1.b(jo.a.b);
            jo.a $$6 = $$1.b(jo.a.c);
            DoubleList $$7 = $$0.a($$4);
            DoubleList $$8 = $$0.a($$5);
            DoubleList $$9 = $$0.a($$6);
            boolean $$10 = $$1.a($$4);
            boolean $$11 = $$1.a($$5);
            boolean $$12 = $$1.a($$6);
            boolean $$13 = $$4.a($$10, $$11, $$12);
            boolean $$14 = $$5.a($$10, $$11, $$12);
            boolean $$15 = $$6.a($$10, $$11, $$12);
            return new fcw($$3, a($$7, $$13, $$2.a($$4), $$2.d), a($$8, $$14, $$2.a($$5), $$2.e), a($$9, $$15, $$2.a($$6), $$2.f));
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

   public static boolean c(fdo $$0, fdo $$1) {
      return !c($$0, $$1, fcy.g);
   }

   public static Map<jo.a, fdo> a(fdo $$0) {
      return a($$0, e);
   }

   public static Map<jo.a, fdo> a(fdo $$0, fcu $$1) {
      return Maps.newEnumMap(Map.of(jo.a.c, $$0, jo.a.a, a($$0, h.a(0, 90), $$1)));
   }

   public static Map<jo.a, fdo> b(fdo $$0) {
      return b($$0, e);
   }

   public static Map<jo.a, fdo> b(fdo $$0, fcu $$1) {
      return Maps.newEnumMap(Map.of(jo.a.c, $$0, jo.a.a, a($$0, h.a(0, 90), $$1), jo.a.b, a($$0, h.a(90, 0), $$1)));
   }

   public static Map<jo, fdo> c(fdo $$0) {
      return c($$0, e);
   }

   public static Map<jo, fdo> c(fdo $$0, fcu $$1) {
      return Maps.newEnumMap(Map.of(jo.c, $$0, jo.f, a($$0, h.a(0, 90), $$1), jo.d, a($$0, h.a(0, 180), $$1), jo.e, a($$0, h.a(0, 270), $$1)));
   }

   public static Map<jo, fdo> d(fdo $$0) {
      return d($$0, e);
   }

   public static Map<jo, fdo> d(fdo $$0, fcu $$1) {
      return Maps.newEnumMap(
         Map.of(
            jo.c,
            $$0,
            jo.f,
            a($$0, h.a(0, 90), $$1),
            jo.d,
            a($$0, h.a(0, 180), $$1),
            jo.e,
            a($$0, h.a(0, 270), $$1),
            jo.b,
            a($$0, h.a(270, 0), $$1),
            jo.a,
            a($$0, h.a(90, 0), $$1)
         )
      );
   }

   public static Map<dyx, Map<jo, fdo>> e(fdo $$0) {
      return Map.of(dyx.b, c($$0), dyx.a, c(a($$0, h.a(270, 0))), dyx.c, c(a($$0, h.a(90, 180))));
   }

   public interface a {
      void consume(double var1, double var3, double var5, double var7, double var9, double var11);
   }
}
