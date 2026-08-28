import com.mojang.serialization.Codec;
import java.util.EnumSet;
import java.util.List;
import org.joml.Vector3f;

public class evq implements js {
   public static final Codec<evq> a = Codec.DOUBLE
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 3).map($$0x -> new evq((Double)$$0x.get(0), (Double)$$0x.get(1), (Double)$$0x.get(2))), $$0 -> List.of($$0.a(), $$0.b(), $$0.c())
      );
   public static final evq b = new evq(0.0, 0.0, 0.0);
   public final double c;
   public final double d;
   public final double e;

   public static evq a(int $$0) {
      double $$1 = (double)($$0 >> 16 & 0xFF) / 255.0;
      double $$2 = (double)($$0 >> 8 & 0xFF) / 255.0;
      double $$3 = (double)($$0 & 0xFF) / 255.0;
      return new evq($$1, $$2, $$3);
   }

   public static evq a(kd $$0) {
      return new evq((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
   }

   public static evq a(kd $$0, double $$1, double $$2, double $$3) {
      return new evq((double)$$0.u() + $$1, (double)$$0.v() + $$2, (double)$$0.w() + $$3);
   }

   public static evq b(kd $$0) {
      return a($$0, 0.5, 0.5, 0.5);
   }

   public static evq c(kd $$0) {
      return a($$0, 0.5, 0.0, 0.5);
   }

   public static evq a(kd $$0, double $$1) {
      return a($$0, 0.5, $$1, 0.5);
   }

   public evq(double $$0, double $$1, double $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public evq(Vector3f $$0) {
      this((double)$$0.x(), (double)$$0.y(), (double)$$0.z());
   }

   public evq a(evq $$0) {
      return new evq($$0.c - this.c, $$0.d - this.d, $$0.e - this.e);
   }

   public evq d() {
      double $$0 = Math.sqrt(this.c * this.c + this.d * this.d + this.e * this.e);
      return $$0 < 1.0E-4 ? b : new evq(this.c / $$0, this.d / $$0, this.e / $$0);
   }

   public double b(evq $$0) {
      return this.c * $$0.c + this.d * $$0.d + this.e * $$0.e;
   }

   public evq c(evq $$0) {
      return new evq(this.d * $$0.e - this.e * $$0.d, this.e * $$0.c - this.c * $$0.e, this.c * $$0.d - this.d * $$0.c);
   }

   public evq d(evq $$0) {
      return this.a($$0.c, $$0.d, $$0.e);
   }

   public evq a(double $$0, double $$1, double $$2) {
      return this.b(-$$0, -$$1, -$$2);
   }

   public evq e(evq $$0) {
      return this.b($$0.c, $$0.d, $$0.e);
   }

   public evq b(double $$0, double $$1, double $$2) {
      return new evq(this.c + $$0, this.d + $$1, this.e + $$2);
   }

   public boolean a(js $$0, double $$1) {
      return this.c($$0.a(), $$0.b(), $$0.c()) < $$1 * $$1;
   }

   public double f(evq $$0) {
      double $$1 = $$0.c - this.c;
      double $$2 = $$0.d - this.d;
      double $$3 = $$0.e - this.e;
      return Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double g(evq $$0) {
      double $$1 = $$0.c - this.c;
      double $$2 = $$0.d - this.d;
      double $$3 = $$0.e - this.e;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public double c(double $$0, double $$1, double $$2) {
      double $$3 = $$0 - this.c;
      double $$4 = $$1 - this.d;
      double $$5 = $$2 - this.e;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public boolean a(evq $$0, double $$1, double $$2) {
      double $$3 = $$0.a() - this.c;
      double $$4 = $$0.b() - this.d;
      double $$5 = $$0.c() - this.e;
      return ayy.e($$3, $$5) < ayy.k($$1) && Math.abs($$4) < $$2;
   }

   public evq a(double $$0) {
      return this.d($$0, $$0, $$0);
   }

   public evq e() {
      return this.a(-1.0);
   }

   public evq h(evq $$0) {
      return this.d($$0.c, $$0.d, $$0.e);
   }

   public evq d(double $$0, double $$1, double $$2) {
      return new evq(this.c * $$0, this.d * $$1, this.e * $$2);
   }

   public evq a(azg $$0, float $$1) {
      return this.b((double)(($$0.i() - 0.5F) * $$1), (double)(($$0.i() - 0.5F) * $$1), (double)(($$0.i() - 0.5F) * $$1));
   }

   public double f() {
      return Math.sqrt(this.c * this.c + this.d * this.d + this.e * this.e);
   }

   public double g() {
      return this.c * this.c + this.d * this.d + this.e * this.e;
   }

   public double h() {
      return Math.sqrt(this.c * this.c + this.e * this.e);
   }

   public double i() {
      return this.c * this.c + this.e * this.e;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if (!($$0 instanceof evq $$1)) {
         return false;
      } else if (Double.compare($$1.c, this.c) != 0) {
         return false;
      } else {
         return Double.compare($$1.d, this.d) != 0 ? false : Double.compare($$1.e, this.e) == 0;
      }
   }

   @Override
   public int hashCode() {
      long $$0 = Double.doubleToLongBits(this.c);
      int $$1 = (int)($$0 ^ $$0 >>> 32);
      $$0 = Double.doubleToLongBits(this.d);
      $$1 = 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
      $$0 = Double.doubleToLongBits(this.e);
      return 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
   }

   @Override
   public String toString() {
      return "(" + this.c + ", " + this.d + ", " + this.e + ")";
   }

   public evq a(evq $$0, double $$1) {
      return new evq(ayy.d($$1, this.c, $$0.c), ayy.d($$1, this.d, $$0.d), ayy.d($$1, this.e, $$0.e));
   }

   public evq a(float $$0) {
      float $$1 = ayy.b($$0);
      float $$2 = ayy.a($$0);
      double $$3 = this.c;
      double $$4 = this.d * (double)$$1 + this.e * (double)$$2;
      double $$5 = this.e * (double)$$1 - this.d * (double)$$2;
      return new evq($$3, $$4, $$5);
   }

   public evq b(float $$0) {
      float $$1 = ayy.b($$0);
      float $$2 = ayy.a($$0);
      double $$3 = this.c * (double)$$1 + this.e * (double)$$2;
      double $$4 = this.d;
      double $$5 = this.e * (double)$$1 - this.c * (double)$$2;
      return new evq($$3, $$4, $$5);
   }

   public evq c(float $$0) {
      float $$1 = ayy.b($$0);
      float $$2 = ayy.a($$0);
      double $$3 = this.c * (double)$$1 + this.d * (double)$$2;
      double $$4 = this.d * (double)$$1 - this.c * (double)$$2;
      double $$5 = this.e;
      return new evq($$3, $$4, $$5);
   }

   public static evq a(evp $$0) {
      return a($$0.i, $$0.j);
   }

   public static evq a(float $$0, float $$1) {
      float $$2 = ayy.b(-$$1 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$3 = ayy.a(-$$1 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$4 = -ayy.b(-$$0 * (float) (Math.PI / 180.0));
      float $$5 = ayy.a(-$$0 * (float) (Math.PI / 180.0));
      return new evq((double)($$3 * $$4), (double)$$5, (double)($$2 * $$4));
   }

   public evq a(EnumSet<je.a> $$0) {
      double $$1 = $$0.contains(je.a.a) ? (double)ayy.a(this.c) : this.c;
      double $$2 = $$0.contains(je.a.b) ? (double)ayy.a(this.d) : this.d;
      double $$3 = $$0.contains(je.a.c) ? (double)ayy.a(this.e) : this.e;
      return new evq($$1, $$2, $$3);
   }

   public double a(je.a $$0) {
      return $$0.a(this.c, this.d, this.e);
   }

   public evq a(je.a $$0, double $$1) {
      double $$2 = $$0 == je.a.a ? $$1 : this.c;
      double $$3 = $$0 == je.a.b ? $$1 : this.d;
      double $$4 = $$0 == je.a.c ? $$1 : this.e;
      return new evq($$2, $$3, $$4);
   }

   public evq a(je $$0, double $$1) {
      kd $$2 = $$0.q();
      return new evq(this.c + $$1 * (double)$$2.u(), this.d + $$1 * (double)$$2.v(), this.e + $$1 * (double)$$2.w());
   }

   @Override
   public final double a() {
      return this.c;
   }

   @Override
   public final double b() {
      return this.d;
   }

   @Override
   public final double c() {
      return this.e;
   }

   public Vector3f j() {
      return new Vector3f((float)this.c, (float)this.d, (float)this.e);
   }
}
