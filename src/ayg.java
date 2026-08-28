import java.util.Locale;
import java.util.UUID;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import org.apache.commons.lang3.math.Fraction;
import org.apache.commons.lang3.math.NumberUtils;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ayg {
   private static final long k = 61440L;
   private static final long l = 16384L;
   private static final long m = -4611686018427387904L;
   private static final long n = Long.MIN_VALUE;
   public static final float a = (float) Math.PI;
   public static final float b = (float) (Math.PI / 2);
   public static final float c = (float) (Math.PI * 2);
   public static final float d = (float) (Math.PI / 180.0);
   public static final float e = 180.0F / (float)Math.PI;
   public static final float f = 1.0E-5F;
   public static final float g = c(2.0F);
   private static final float o = 10430.378F;
   public static final Vector3f h = new Vector3f(0.0F, 1.0F, 0.0F);
   public static final Vector3f i = new Vector3f(1.0F, 0.0F, 0.0F);
   public static final Vector3f j = new Vector3f(0.0F, 0.0F, 1.0F);
   private static final float[] p = ac.a(new float[65536], $$0x -> {
      for (int $$1x = 0; $$1x < $$0x.length; $$1x++) {
         $$0x[$$1x] = (float)Math.sin((double)$$1x * Math.PI * 2.0 / 65536.0);
      }
   });
   private static final ayo q = ayo.b();
   private static final int[] r = new int[]{
      0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9
   };
   private static final double s = 0.16666666666666666;
   private static final int t = 8;
   private static final int u = 257;
   private static final double v = Double.longBitsToDouble(4805340802404319232L);
   private static final double[] w = new double[257];
   private static final double[] x = new double[257];

   public static float a(float $$0) {
      return p[(int)($$0 * 10430.378F) & 65535];
   }

   public static float b(float $$0) {
      return p[(int)($$0 * 10430.378F + 16384.0F) & 65535];
   }

   public static float c(float $$0) {
      return (float)Math.sqrt((double)$$0);
   }

   public static int d(float $$0) {
      int $$1 = (int)$$0;
      return $$0 < (float)$$1 ? $$1 - 1 : $$1;
   }

   public static int a(double $$0) {
      int $$1 = (int)$$0;
      return $$0 < (double)$$1 ? $$1 - 1 : $$1;
   }

   public static long b(double $$0) {
      long $$1 = (long)$$0;
      return $$0 < (double)$$1 ? $$1 - 1L : $$1;
   }

   public static float e(float $$0) {
      return Math.abs($$0);
   }

   public static int a(int $$0) {
      return Math.abs($$0);
   }

   public static int f(float $$0) {
      int $$1 = (int)$$0;
      return $$0 > (float)$$1 ? $$1 + 1 : $$1;
   }

   public static int c(double $$0) {
      int $$1 = (int)$$0;
      return $$0 > (double)$$1 ? $$1 + 1 : $$1;
   }

   public static int a(int $$0, int $$1, int $$2) {
      return Math.min(Math.max($$0, $$1), $$2);
   }

   public static long a(long $$0, long $$1, long $$2) {
      return Math.min(Math.max($$0, $$1), $$2);
   }

   public static float a(float $$0, float $$1, float $$2) {
      return $$0 < $$1 ? $$1 : Math.min($$0, $$2);
   }

   public static double a(double $$0, double $$1, double $$2) {
      return $$0 < $$1 ? $$1 : Math.min($$0, $$2);
   }

   public static double b(double $$0, double $$1, double $$2) {
      if ($$2 < 0.0) {
         return $$0;
      } else {
         return $$2 > 1.0 ? $$1 : d($$2, $$0, $$1);
      }
   }

   public static float b(float $$0, float $$1, float $$2) {
      if ($$2 < 0.0F) {
         return $$0;
      } else {
         return $$2 > 1.0F ? $$1 : i($$2, $$0, $$1);
      }
   }

   public static double a(double $$0, double $$1) {
      if ($$0 < 0.0) {
         $$0 = -$$0;
      }

      if ($$1 < 0.0) {
         $$1 = -$$1;
      }

      return Math.max($$0, $$1);
   }

   public static int a(int $$0, int $$1) {
      return Math.floorDiv($$0, $$1);
   }

   public static int a(ayo $$0, int $$1, int $$2) {
      return $$1 >= $$2 ? $$1 : $$0.a($$2 - $$1 + 1) + $$1;
   }

   public static float a(ayo $$0, float $$1, float $$2) {
      return $$1 >= $$2 ? $$1 : $$0.i() * ($$2 - $$1) + $$1;
   }

   public static double a(ayo $$0, double $$1, double $$2) {
      return $$1 >= $$2 ? $$1 : $$0.j() * ($$2 - $$1) + $$1;
   }

   public static boolean a(float $$0, float $$1) {
      return Math.abs($$1 - $$0) < 1.0E-5F;
   }

   public static boolean b(double $$0, double $$1) {
      return Math.abs($$1 - $$0) < 1.0E-5F;
   }

   public static int b(int $$0, int $$1) {
      return Math.floorMod($$0, $$1);
   }

   public static float b(float $$0, float $$1) {
      return ($$0 % $$1 + $$1) % $$1;
   }

   public static double c(double $$0, double $$1) {
      return ($$0 % $$1 + $$1) % $$1;
   }

   public static boolean c(int $$0, int $$1) {
      return $$0 % $$1 == 0;
   }

   public static int b(int $$0) {
      int $$1 = $$0 % 360;
      if ($$1 >= 180) {
         $$1 -= 360;
      }

      if ($$1 < -180) {
         $$1 += 360;
      }

      return $$1;
   }

   public static float g(float $$0) {
      float $$1 = $$0 % 360.0F;
      if ($$1 >= 180.0F) {
         $$1 -= 360.0F;
      }

      if ($$1 < -180.0F) {
         $$1 += 360.0F;
      }

      return $$1;
   }

   public static double d(double $$0) {
      double $$1 = $$0 % 360.0;
      if ($$1 >= 180.0) {
         $$1 -= 360.0;
      }

      if ($$1 < -180.0) {
         $$1 += 360.0;
      }

      return $$1;
   }

   public static float c(float $$0, float $$1) {
      return g($$1 - $$0);
   }

   public static float d(float $$0, float $$1) {
      return e(c($$0, $$1));
   }

   public static float c(float $$0, float $$1, float $$2) {
      float $$3 = c($$0, $$1);
      float $$4 = a($$3, -$$2, $$2);
      return $$1 - $$4;
   }

   public static float d(float $$0, float $$1, float $$2) {
      $$2 = e($$2);
      return $$0 < $$1 ? a($$0 + $$2, $$0, $$1) : a($$0 - $$2, $$1, $$0);
   }

   public static float e(float $$0, float $$1, float $$2) {
      float $$3 = c($$0, $$1);
      return d($$0, $$0 + $$3, $$2);
   }

   public static int a(String $$0, int $$1) {
      return NumberUtils.toInt($$0, $$1);
   }

   public static int c(int $$0) {
      int $$1 = $$0 - 1;
      $$1 |= $$1 >> 1;
      $$1 |= $$1 >> 2;
      $$1 |= $$1 >> 4;
      $$1 |= $$1 >> 8;
      $$1 |= $$1 >> 16;
      return $$1 + 1;
   }

   public static boolean d(int $$0) {
      return $$0 != 0 && ($$0 & $$0 - 1) == 0;
   }

   public static int e(int $$0) {
      $$0 = d($$0) ? $$0 : c($$0);
      return r[(int)((long)$$0 * 125613361L >> 27) & 31];
   }

   public static int f(int $$0) {
      return e($$0) - (d($$0) ? 0 : 1);
   }

   public static int f(float $$0, float $$1, float $$2) {
      return axq.b.a(0, d($$0 * 255.0F), d($$1 * 255.0F), d($$2 * 255.0F));
   }

   public static float h(float $$0) {
      return $$0 - (float)d($$0);
   }

   public static double e(double $$0) {
      return $$0 - (double)b($$0);
   }

   @Deprecated
   public static long a(ke $$0) {
      return b($$0.u(), $$0.v(), $$0.w());
   }

   @Deprecated
   public static long b(int $$0, int $$1, int $$2) {
      long $$3 = (long)($$0 * 3129871) ^ (long)$$2 * 116129781L ^ (long)$$1;
      $$3 = $$3 * $$3 * 42317861L + $$3 * 11L;
      return $$3 >> 16;
   }

   public static UUID a(ayo $$0) {
      long $$1 = $$0.g() & -61441L | 16384L;
      long $$2 = $$0.g() & 4611686018427387903L | Long.MIN_VALUE;
      return new UUID($$1, $$2);
   }

   public static UUID a() {
      return a(q);
   }

   public static double c(double $$0, double $$1, double $$2) {
      return ($$0 - $$1) / ($$2 - $$1);
   }

   public static float g(float $$0, float $$1, float $$2) {
      return ($$0 - $$1) / ($$2 - $$1);
   }

   public static boolean a(ewf $$0, ewf $$1, ewa $$2) {
      double $$3 = ($$2.a + $$2.d) * 0.5;
      double $$4 = ($$2.d - $$2.a) * 0.5;
      double $$5 = $$0.c - $$3;
      if (Math.abs($$5) > $$4 && $$5 * $$1.c >= 0.0) {
         return false;
      } else {
         double $$6 = ($$2.b + $$2.e) * 0.5;
         double $$7 = ($$2.e - $$2.b) * 0.5;
         double $$8 = $$0.d - $$6;
         if (Math.abs($$8) > $$7 && $$8 * $$1.d >= 0.0) {
            return false;
         } else {
            double $$9 = ($$2.c + $$2.f) * 0.5;
            double $$10 = ($$2.f - $$2.c) * 0.5;
            double $$11 = $$0.e - $$9;
            if (Math.abs($$11) > $$10 && $$11 * $$1.e >= 0.0) {
               return false;
            } else {
               double $$12 = Math.abs($$1.c);
               double $$13 = Math.abs($$1.d);
               double $$14 = Math.abs($$1.e);
               double $$15 = $$1.d * $$11 - $$1.e * $$8;
               if (Math.abs($$15) > $$7 * $$14 + $$10 * $$13) {
                  return false;
               } else {
                  $$15 = $$1.e * $$5 - $$1.c * $$11;
                  if (Math.abs($$15) > $$4 * $$14 + $$10 * $$12) {
                     return false;
                  } else {
                     $$15 = $$1.c * $$8 - $$1.d * $$5;
                     return Math.abs($$15) < $$4 * $$13 + $$7 * $$12;
                  }
               }
            }
         }
      }
   }

   public static double d(double $$0, double $$1) {
      double $$2 = $$1 * $$1 + $$0 * $$0;
      if (Double.isNaN($$2)) {
         return Double.NaN;
      } else {
         boolean $$3 = $$0 < 0.0;
         if ($$3) {
            $$0 = -$$0;
         }

         boolean $$4 = $$1 < 0.0;
         if ($$4) {
            $$1 = -$$1;
         }

         boolean $$5 = $$0 > $$1;
         if ($$5) {
            double $$6 = $$1;
            $$1 = $$0;
            $$0 = $$6;
         }

         double $$7 = g($$2);
         $$1 *= $$7;
         $$0 *= $$7;
         double $$8 = v + $$0;
         int $$9 = (int)Double.doubleToRawLongBits($$8);
         double $$10 = w[$$9];
         double $$11 = x[$$9];
         double $$12 = $$8 - v;
         double $$13 = $$0 * $$11 - $$1 * $$12;
         double $$14 = (6.0 + $$13 * $$13) * $$13 * 0.16666666666666666;
         double $$15 = $$10 + $$14;
         if ($$5) {
            $$15 = (Math.PI / 2) - $$15;
         }

         if ($$4) {
            $$15 = Math.PI - $$15;
         }

         if ($$3) {
            $$15 = -$$15;
         }

         return $$15;
      }
   }

   public static float i(float $$0) {
      return org.joml.Math.invsqrt($$0);
   }

   public static double f(double $$0) {
      return org.joml.Math.invsqrt($$0);
   }

   @Deprecated
   public static double g(double $$0) {
      double $$1 = 0.5 * $$0;
      long $$2 = Double.doubleToRawLongBits($$0);
      $$2 = 6910469410427058090L - ($$2 >> 1);
      $$0 = Double.longBitsToDouble($$2);
      return $$0 * (1.5 - $$1 * $$0 * $$0);
   }

   public static float j(float $$0) {
      int $$1 = Float.floatToIntBits($$0);
      $$1 = 1419967116 - $$1 / 3;
      float $$2 = Float.intBitsToFloat($$1);
      $$2 = 0.6666667F * $$2 + 1.0F / (3.0F * $$2 * $$2 * $$0);
      return 0.6666667F * $$2 + 1.0F / (3.0F * $$2 * $$2 * $$0);
   }

   public static int h(float $$0, float $$1, float $$2) {
      int $$3 = (int)($$0 * 6.0F) % 6;
      float $$4 = $$0 * 6.0F - (float)$$3;
      float $$5 = $$2 * (1.0F - $$1);
      float $$6 = $$2 * (1.0F - $$4 * $$1);
      float $$7 = $$2 * (1.0F - (1.0F - $$4) * $$1);
      float $$8;
      float $$9;
      float $$10;
      switch ($$3) {
         case 0:
            $$8 = $$2;
            $$9 = $$7;
            $$10 = $$5;
            break;
         case 1:
            $$8 = $$6;
            $$9 = $$2;
            $$10 = $$5;
            break;
         case 2:
            $$8 = $$5;
            $$9 = $$2;
            $$10 = $$7;
            break;
         case 3:
            $$8 = $$5;
            $$9 = $$6;
            $$10 = $$2;
            break;
         case 4:
            $$8 = $$7;
            $$9 = $$5;
            $$10 = $$2;
            break;
         case 5:
            $$8 = $$2;
            $$9 = $$5;
            $$10 = $$6;
            break;
         default:
            throw new RuntimeException("Something went wrong when converting from HSV to RGB. Input was " + $$0 + ", " + $$1 + ", " + $$2);
      }

      return axq.b.a(0, a((int)($$8 * 255.0F), 0, 255), a((int)($$9 * 255.0F), 0, 255), a((int)($$10 * 255.0F), 0, 255));
   }

   public static int g(int $$0) {
      $$0 ^= $$0 >>> 16;
      $$0 *= -2048144789;
      $$0 ^= $$0 >>> 13;
      $$0 *= -1028477387;
      return $$0 ^ $$0 >>> 16;
   }

   public static int a(int $$0, int $$1, IntPredicate $$2) {
      int $$3 = $$1 - $$0;

      while ($$3 > 0) {
         int $$4 = $$3 / 2;
         int $$5 = $$0 + $$4;
         if ($$2.test($$5)) {
            $$3 = $$4;
         } else {
            $$0 = $$5 + 1;
            $$3 -= $$4 + 1;
         }
      }

      return $$0;
   }

   public static int a(float $$0, int $$1, int $$2) {
      return $$1 + d($$0 * (float)($$2 - $$1));
   }

   public static int b(float $$0, int $$1, int $$2) {
      int $$3 = $$2 - $$1;
      return $$1 + d($$0 * (float)($$3 - 1)) + ($$0 > 0.0F ? 1 : 0);
   }

   public static float i(float $$0, float $$1, float $$2) {
      return $$1 + $$0 * ($$2 - $$1);
   }

   public static double d(double $$0, double $$1, double $$2) {
      return $$1 + $$0 * ($$2 - $$1);
   }

   public static double a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return d($$1, d($$0, $$2, $$3), d($$0, $$4, $$5));
   }

   public static double a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8, double $$9, double $$10) {
      return d($$2, a($$0, $$1, $$3, $$4, $$5, $$6), a($$0, $$1, $$7, $$8, $$9, $$10));
   }

   public static float a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      return 0.5F
         * (2.0F * $$2 + ($$3 - $$1) * $$0 + (2.0F * $$1 - 5.0F * $$2 + 4.0F * $$3 - $$4) * $$0 * $$0 + (3.0F * $$2 - $$1 - 3.0F * $$3 + $$4) * $$0 * $$0 * $$0);
   }

   public static double h(double $$0) {
      return $$0 * $$0 * $$0 * ($$0 * ($$0 * 6.0 - 15.0) + 10.0);
   }

   public static double i(double $$0) {
      return 30.0 * $$0 * $$0 * ($$0 - 1.0) * ($$0 - 1.0);
   }

   public static int j(double $$0) {
      if ($$0 == 0.0) {
         return 0;
      } else {
         return $$0 > 0.0 ? 1 : -1;
      }
   }

   public static float j(float $$0, float $$1, float $$2) {
      return $$1 + $$0 * g($$2 - $$1);
   }

   public static double e(double $$0, double $$1, double $$2) {
      return $$1 + $$0 * d($$2 - $$1);
   }

   public static float e(float $$0, float $$1) {
      return (Math.abs($$0 % $$1 - $$1 * 0.5F) - $$1 * 0.25F) / ($$1 * 0.25F);
   }

   public static float k(float $$0) {
      return $$0 * $$0;
   }

   public static double k(double $$0) {
      return $$0 * $$0;
   }

   public static int h(int $$0) {
      return $$0 * $$0;
   }

   public static long a(long $$0) {
      return $$0 * $$0;
   }

   public static double a(double $$0, double $$1, double $$2, double $$3, double $$4) {
      return b($$3, $$4, c($$0, $$1, $$2));
   }

   public static float b(float $$0, float $$1, float $$2, float $$3, float $$4) {
      return b($$3, $$4, g($$0, $$1, $$2));
   }

   public static double b(double $$0, double $$1, double $$2, double $$3, double $$4) {
      return d(c($$0, $$1, $$2), $$3, $$4);
   }

   public static float c(float $$0, float $$1, float $$2, float $$3, float $$4) {
      return i(g($$0, $$1, $$2), $$3, $$4);
   }

   public static double l(double $$0) {
      return $$0 + (2.0 * ayo.a((long)a($$0 * 3000.0)).j() - 1.0) * 1.0E-7 / 2.0;
   }

   public static int d(int $$0, int $$1) {
      return e($$0, $$1) * $$1;
   }

   public static int e(int $$0, int $$1) {
      return -Math.floorDiv(-$$0, $$1);
   }

   public static int b(ayo $$0, int $$1, int $$2) {
      return $$0.a($$2 - $$1 + 1) + $$1;
   }

   public static float b(ayo $$0, float $$1, float $$2) {
      return $$0.i() * ($$2 - $$1) + $$1;
   }

   public static float c(ayo $$0, float $$1, float $$2) {
      return $$1 + (float)$$0.k() * $$2;
   }

   public static double e(double $$0, double $$1) {
      return $$0 * $$0 + $$1 * $$1;
   }

   public static double f(double $$0, double $$1) {
      return Math.sqrt(e($$0, $$1));
   }

   public static double f(double $$0, double $$1, double $$2) {
      return $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
   }

   public static double g(double $$0, double $$1, double $$2) {
      return Math.sqrt(f($$0, $$1, $$2));
   }

   public static int a(double $$0, int $$1) {
      return a($$0 / (double)$$1) * $$1;
   }

   public static IntStream c(int $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static IntStream a(int $$0, int $$1, int $$2, int $$3) {
      if ($$1 > $$2) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "upperbound %d expected to be > lowerBound %d", $$2, $$1));
      } else if ($$3 < 1) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "steps expected to be >= 1, was %d", $$3));
      } else {
         return $$0 >= $$1 && $$0 <= $$2 ? IntStream.iterate($$0, $$3x -> {
            int $$4 = Math.abs($$0 - $$3x);
            return $$0 - $$4 >= $$1 || $$0 + $$4 <= $$2;
         }, $$4 -> {
            boolean $$5 = $$4 <= $$0;
            int $$6 = Math.abs($$0 - $$4);
            boolean $$7 = $$0 + $$6 + $$3 <= $$2;
            if (!$$5 || !$$7) {
               int $$8 = $$0 - $$6 - ($$5 ? $$3 : 0);
               if ($$8 >= $$1) {
                  return $$8;
               }
            }

            return $$0 + $$6 + $$3;
         }) : IntStream.empty();
      }
   }

   public static Quaternionf a(Vector3f $$0, Quaternionf $$1, Quaternionf $$2) {
      float $$3 = $$0.dot($$1.x, $$1.y, $$1.z);
      return $$2.set($$0.x * $$3, $$0.y * $$3, $$0.z * $$3, $$1.w).normalize();
   }

   public static int a(Fraction $$0, int $$1) {
      return $$0.getNumerator() * $$1 / $$0.getDenominator();
   }

   static {
      for (int $$0 = 0; $$0 < 257; $$0++) {
         double $$1 = (double)$$0 / 256.0;
         double $$2 = Math.asin($$1);
         x[$$0] = Math.cos($$2);
         w[$$0] = $$2;
      }
   }
}
