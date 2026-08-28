import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class fex {
   private static final double g = 1.0E-7;
   public final double a;
   public final double b;
   public final double c;
   public final double d;
   public final double e;
   public final double f;

   public fex(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      this.a = Math.min($$0, $$3);
      this.b = Math.min($$1, $$4);
      this.c = Math.min($$2, $$5);
      this.d = Math.max($$0, $$3);
      this.e = Math.max($$1, $$4);
      this.f = Math.max($$2, $$5);
   }

   public fex(iv $$0) {
      this((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), (double)($$0.u() + 1), (double)($$0.v() + 1), (double)($$0.w() + 1));
   }

   public fex(ffc $$0, ffc $$1) {
      this($$0.d, $$0.e, $$0.f, $$1.d, $$1.e, $$1.f);
   }

   public static fex a(erf $$0) {
      return new fex((double)$$0.h(), (double)$$0.i(), (double)$$0.j(), (double)($$0.k() + 1), (double)($$0.l() + 1), (double)($$0.m() + 1));
   }

   public static fex a(ffc $$0) {
      return new fex($$0.d, $$0.e, $$0.f, $$0.d + 1.0, $$0.e + 1.0, $$0.f + 1.0);
   }

   public static fex a(iv $$0, iv $$1) {
      return new fex(
         (double)Math.min($$0.u(), $$1.u()),
         (double)Math.min($$0.v(), $$1.v()),
         (double)Math.min($$0.w(), $$1.w()),
         (double)(Math.max($$0.u(), $$1.u()) + 1),
         (double)(Math.max($$0.v(), $$1.v()) + 1),
         (double)(Math.max($$0.w(), $$1.w()) + 1)
      );
   }

   public fex a(double $$0) {
      return new fex($$0, this.b, this.c, this.d, this.e, this.f);
   }

   public fex b(double $$0) {
      return new fex(this.a, $$0, this.c, this.d, this.e, this.f);
   }

   public fex c(double $$0) {
      return new fex(this.a, this.b, $$0, this.d, this.e, this.f);
   }

   public fex d(double $$0) {
      return new fex(this.a, this.b, this.c, $$0, this.e, this.f);
   }

   public fex e(double $$0) {
      return new fex(this.a, this.b, this.c, this.d, $$0, this.f);
   }

   public fex f(double $$0) {
      return new fex(this.a, this.b, this.c, this.d, this.e, $$0);
   }

   public double a(jb.a $$0) {
      return $$0.a(this.a, this.b, this.c);
   }

   public double b(jb.a $$0) {
      return $$0.a(this.d, this.e, this.f);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if (!($$0 instanceof fex $$1)) {
         return false;
      } else if (Double.compare($$1.a, this.a) != 0) {
         return false;
      } else if (Double.compare($$1.b, this.b) != 0) {
         return false;
      } else if (Double.compare($$1.c, this.c) != 0) {
         return false;
      } else if (Double.compare($$1.d, this.d) != 0) {
         return false;
      } else {
         return Double.compare($$1.e, this.e) != 0 ? false : Double.compare($$1.f, this.f) == 0;
      }
   }

   @Override
   public int hashCode() {
      long $$0 = Double.doubleToLongBits(this.a);
      int $$1 = (int)($$0 ^ $$0 >>> 32);
      $$0 = Double.doubleToLongBits(this.b);
      $$1 = 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
      $$0 = Double.doubleToLongBits(this.c);
      $$1 = 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
      $$0 = Double.doubleToLongBits(this.d);
      $$1 = 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
      $$0 = Double.doubleToLongBits(this.e);
      $$1 = 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
      $$0 = Double.doubleToLongBits(this.f);
      return 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
   }

   public fex a(double $$0, double $$1, double $$2) {
      double $$3 = this.a;
      double $$4 = this.b;
      double $$5 = this.c;
      double $$6 = this.d;
      double $$7 = this.e;
      double $$8 = this.f;
      if ($$0 < 0.0) {
         $$3 -= $$0;
      } else if ($$0 > 0.0) {
         $$6 -= $$0;
      }

      if ($$1 < 0.0) {
         $$4 -= $$1;
      } else if ($$1 > 0.0) {
         $$7 -= $$1;
      }

      if ($$2 < 0.0) {
         $$5 -= $$2;
      } else if ($$2 > 0.0) {
         $$8 -= $$2;
      }

      return new fex($$3, $$4, $$5, $$6, $$7, $$8);
   }

   public fex b(ffc $$0) {
      return this.b($$0.d, $$0.e, $$0.f);
   }

   public fex b(double $$0, double $$1, double $$2) {
      double $$3 = this.a;
      double $$4 = this.b;
      double $$5 = this.c;
      double $$6 = this.d;
      double $$7 = this.e;
      double $$8 = this.f;
      if ($$0 < 0.0) {
         $$3 += $$0;
      } else if ($$0 > 0.0) {
         $$6 += $$0;
      }

      if ($$1 < 0.0) {
         $$4 += $$1;
      } else if ($$1 > 0.0) {
         $$7 += $$1;
      }

      if ($$2 < 0.0) {
         $$5 += $$2;
      } else if ($$2 > 0.0) {
         $$8 += $$2;
      }

      return new fex($$3, $$4, $$5, $$6, $$7, $$8);
   }

   public fex c(double $$0, double $$1, double $$2) {
      double $$3 = this.a - $$0;
      double $$4 = this.b - $$1;
      double $$5 = this.c - $$2;
      double $$6 = this.d + $$0;
      double $$7 = this.e + $$1;
      double $$8 = this.f + $$2;
      return new fex($$3, $$4, $$5, $$6, $$7, $$8);
   }

   public fex g(double $$0) {
      return this.c($$0, $$0, $$0);
   }

   public fex a(fex $$0) {
      double $$1 = Math.max(this.a, $$0.a);
      double $$2 = Math.max(this.b, $$0.b);
      double $$3 = Math.max(this.c, $$0.c);
      double $$4 = Math.min(this.d, $$0.d);
      double $$5 = Math.min(this.e, $$0.e);
      double $$6 = Math.min(this.f, $$0.f);
      return new fex($$1, $$2, $$3, $$4, $$5, $$6);
   }

   public fex b(fex $$0) {
      double $$1 = Math.min(this.a, $$0.a);
      double $$2 = Math.min(this.b, $$0.b);
      double $$3 = Math.min(this.c, $$0.c);
      double $$4 = Math.max(this.d, $$0.d);
      double $$5 = Math.max(this.e, $$0.e);
      double $$6 = Math.max(this.f, $$0.f);
      return new fex($$1, $$2, $$3, $$4, $$5, $$6);
   }

   public fex d(double $$0, double $$1, double $$2) {
      return new fex(this.a + $$0, this.b + $$1, this.c + $$2, this.d + $$0, this.e + $$1, this.f + $$2);
   }

   public fex a(iv $$0) {
      return new fex(
         this.a + (double)$$0.u(),
         this.b + (double)$$0.v(),
         this.c + (double)$$0.w(),
         this.d + (double)$$0.u(),
         this.e + (double)$$0.v(),
         this.f + (double)$$0.w()
      );
   }

   public fex c(ffc $$0) {
      return this.d($$0.d, $$0.e, $$0.f);
   }

   public fex a(Vector3f $$0) {
      return this.d((double)$$0.x, (double)$$0.y, (double)$$0.z);
   }

   public boolean c(fex $$0) {
      return this.a($$0.a, $$0.b, $$0.c, $$0.d, $$0.e, $$0.f);
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return this.a < $$3 && this.d > $$0 && this.b < $$4 && this.e > $$1 && this.c < $$5 && this.f > $$2;
   }

   public boolean a(ffc $$0, ffc $$1) {
      return this.a(
         Math.min($$0.d, $$1.d), Math.min($$0.e, $$1.e), Math.min($$0.f, $$1.f), Math.max($$0.d, $$1.d), Math.max($$0.e, $$1.e), Math.max($$0.f, $$1.f)
      );
   }

   public boolean d(ffc $$0) {
      return this.e($$0.d, $$0.e, $$0.f);
   }

   public boolean e(double $$0, double $$1, double $$2) {
      return $$0 >= this.a && $$0 < this.d && $$1 >= this.b && $$1 < this.e && $$2 >= this.c && $$2 < this.f;
   }

   public double a() {
      double $$0 = this.b();
      double $$1 = this.c();
      double $$2 = this.d();
      return ($$0 + $$1 + $$2) / 3.0;
   }

   public double b() {
      return this.d - this.a;
   }

   public double c() {
      return this.e - this.b;
   }

   public double d() {
      return this.f - this.c;
   }

   public fex f(double $$0, double $$1, double $$2) {
      return this.c(-$$0, -$$1, -$$2);
   }

   public fex h(double $$0) {
      return this.g(-$$0);
   }

   public Optional<ffc> b(ffc $$0, ffc $$1) {
      return a(this.a, this.b, this.c, this.d, this.e, this.f, $$0, $$1);
   }

   public static Optional<ffc> a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, ffc $$6, ffc $$7) {
      double[] $$8 = new double[]{1.0};
      double $$9 = $$7.d - $$6.d;
      double $$10 = $$7.e - $$6.e;
      double $$11 = $$7.f - $$6.f;
      jb $$12 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, null, $$9, $$10, $$11);
      if ($$12 == null) {
         return Optional.empty();
      } else {
         double $$13 = $$8[0];
         return Optional.of($$6.b($$13 * $$9, $$13 * $$10, $$13 * $$11));
      }
   }

   @Nullable
   public static fey a(Iterable<fex> $$0, ffc $$1, ffc $$2, iv $$3) {
      double[] $$4 = new double[]{1.0};
      jb $$5 = null;
      double $$6 = $$2.d - $$1.d;
      double $$7 = $$2.e - $$1.e;
      double $$8 = $$2.f - $$1.f;

      for (fex $$9 : $$0) {
         $$5 = a($$9.a($$3), $$1, $$4, $$5, $$6, $$7, $$8);
      }

      if ($$5 == null) {
         return null;
      } else {
         double $$10 = $$4[0];
         return new fey($$1.b($$10 * $$6, $$10 * $$7, $$10 * $$8), $$5, $$3, false);
      }
   }

   @Nullable
   private static jb a(fex $$0, ffc $$1, double[] $$2, @Nullable jb $$3, double $$4, double $$5, double $$6) {
      return a($$0.a, $$0.b, $$0.c, $$0.d, $$0.e, $$0.f, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Nullable
   private static jb a(
      double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, ffc $$6, double[] $$7, @Nullable jb $$8, double $$9, double $$10, double $$11
   ) {
      if ($$9 > 1.0E-7) {
         $$8 = a($$7, $$8, $$9, $$10, $$11, $$0, $$1, $$4, $$2, $$5, jb.e, $$6.d, $$6.e, $$6.f);
      } else if ($$9 < -1.0E-7) {
         $$8 = a($$7, $$8, $$9, $$10, $$11, $$3, $$1, $$4, $$2, $$5, jb.f, $$6.d, $$6.e, $$6.f);
      }

      if ($$10 > 1.0E-7) {
         $$8 = a($$7, $$8, $$10, $$11, $$9, $$1, $$2, $$5, $$0, $$3, jb.a, $$6.e, $$6.f, $$6.d);
      } else if ($$10 < -1.0E-7) {
         $$8 = a($$7, $$8, $$10, $$11, $$9, $$4, $$2, $$5, $$0, $$3, jb.b, $$6.e, $$6.f, $$6.d);
      }

      if ($$11 > 1.0E-7) {
         $$8 = a($$7, $$8, $$11, $$9, $$10, $$2, $$0, $$3, $$1, $$4, jb.c, $$6.f, $$6.d, $$6.e);
      } else if ($$11 < -1.0E-7) {
         $$8 = a($$7, $$8, $$11, $$9, $$10, $$5, $$0, $$3, $$1, $$4, jb.d, $$6.f, $$6.d, $$6.e);
      }

      return $$8;
   }

   @Nullable
   private static jb a(
      double[] $$0,
      @Nullable jb $$1,
      double $$2,
      double $$3,
      double $$4,
      double $$5,
      double $$6,
      double $$7,
      double $$8,
      double $$9,
      jb $$10,
      double $$11,
      double $$12,
      double $$13
   ) {
      double $$14 = ($$5 - $$11) / $$2;
      double $$15 = $$12 + $$14 * $$3;
      double $$16 = $$13 + $$14 * $$4;
      if (0.0 < $$14 && $$14 < $$0[0] && $$6 - 1.0E-7 < $$15 && $$15 < $$7 + 1.0E-7 && $$8 - 1.0E-7 < $$16 && $$16 < $$9 + 1.0E-7) {
         $$0[0] = $$14;
         return $$10;
      } else {
         return $$1;
      }
   }

   public boolean a(ffc $$0, List<fex> $$1) {
      ffc $$2 = this.f();
      ffc $$3 = $$2.e($$0);

      for (fex $$4 : $$1) {
         fex $$5 = $$4.c(this.b() * 0.5, this.c() * 0.5, this.d() * 0.5);
         if ($$5.d($$3) || $$5.d($$2)) {
            return true;
         }

         if ($$5.b($$2, $$3).isPresent()) {
            return true;
         }
      }

      return false;
   }

   public double e(ffc $$0) {
      double $$1 = Math.max(Math.max(this.a - $$0.d, $$0.d - this.d), 0.0);
      double $$2 = Math.max(Math.max(this.b - $$0.e, $$0.e - this.e), 0.0);
      double $$3 = Math.max(Math.max(this.c - $$0.f, $$0.f - this.f), 0.0);
      return azm.f($$1, $$2, $$3);
   }

   @Override
   public String toString() {
      return "AABB[" + this.a + ", " + this.b + ", " + this.c + "] -> [" + this.d + ", " + this.e + ", " + this.f + "]";
   }

   public boolean e() {
      return Double.isNaN(this.a) || Double.isNaN(this.b) || Double.isNaN(this.c) || Double.isNaN(this.d) || Double.isNaN(this.e) || Double.isNaN(this.f);
   }

   public ffc f() {
      return new ffc(azm.d(0.5, this.a, this.d), azm.d(0.5, this.b, this.e), azm.d(0.5, this.c, this.f));
   }

   public ffc g() {
      return new ffc(azm.d(0.5, this.a, this.d), this.b, azm.d(0.5, this.c, this.f));
   }

   public ffc h() {
      return new ffc(this.a, this.b, this.c);
   }

   public ffc i() {
      return new ffc(this.d, this.e, this.f);
   }

   public static fex a(ffc $$0, double $$1, double $$2, double $$3) {
      return new fex($$0.d - $$1 / 2.0, $$0.e - $$2 / 2.0, $$0.f - $$3 / 2.0, $$0.d + $$1 / 2.0, $$0.e + $$2 / 2.0, $$0.f + $$3 / 2.0);
   }

   public static class a {
      private float a = Float.POSITIVE_INFINITY;
      private float b = Float.POSITIVE_INFINITY;
      private float c = Float.POSITIVE_INFINITY;
      private float d = Float.NEGATIVE_INFINITY;
      private float e = Float.NEGATIVE_INFINITY;
      private float f = Float.NEGATIVE_INFINITY;

      public void a(Vector3fc $$0) {
         this.a = Math.min(this.a, $$0.x());
         this.b = Math.min(this.b, $$0.y());
         this.c = Math.min(this.c, $$0.z());
         this.d = Math.max(this.d, $$0.x());
         this.e = Math.max(this.e, $$0.y());
         this.f = Math.max(this.f, $$0.z());
      }

      public fex a() {
         return new fex((double)this.a, (double)this.b, (double)this.c, (double)this.d, (double)this.e, (double)this.f);
      }
   }
}
