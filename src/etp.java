import com.mojang.serialization.Codec;
import java.util.EnumSet;
import java.util.List;
import org.joml.Vector3f;

public class etp implements jg {
   public static final Codec<etp> a = Codec.DOUBLE
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 3).map($$0x -> new etp((Double)$$0x.get(0), (Double)$$0x.get(1), (Double)$$0x.get(2))), $$0 -> List.of($$0.a(), $$0.b(), $$0.c())
      );
   public static final etp b = new etp(0.0, 0.0, 0.0);
   public final double c;
   public final double d;
   public final double e;

   public static etp a(int $$0) {
      double $$1 = (double)($$0 >> 16 & 0xFF) / 255.0;
      double $$2 = (double)($$0 >> 8 & 0xFF) / 255.0;
      double $$3 = (double)($$0 & 0xFF) / 255.0;
      return new etp($$1, $$2, $$3);
   }

   public static etp a(jr $$0) {
      return new etp((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
   }

   public static etp a(jr $$0, double $$1, double $$2, double $$3) {
      return new etp((double)$$0.u() + $$1, (double)$$0.v() + $$2, (double)$$0.w() + $$3);
   }

   public static etp b(jr $$0) {
      return a($$0, 0.5, 0.5, 0.5);
   }

   public static etp c(jr $$0) {
      return a($$0, 0.5, 0.0, 0.5);
   }

   public static etp a(jr $$0, double $$1) {
      return a($$0, 0.5, $$1, 0.5);
   }

   public etp(double $$0, double $$1, double $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public etp(Vector3f $$0) {
      this((double)$$0.x(), (double)$$0.y(), (double)$$0.z());
   }

   public etp a(etp $$0) {
      return new etp($$0.c - this.c, $$0.d - this.d, $$0.e - this.e);
   }

   public etp d() {
      double $$0 = Math.sqrt(this.c * this.c + this.d * this.d + this.e * this.e);
      return $$0 < 1.0E-4 ? b : new etp(this.c / $$0, this.d / $$0, this.e / $$0);
   }

   public double b(etp $$0) {
      return this.c * $$0.c + this.d * $$0.d + this.e * $$0.e;
   }

   public etp c(etp $$0) {
      return new etp(this.d * $$0.e - this.e * $$0.d, this.e * $$0.c - this.c * $$0.e, this.c * $$0.d - this.d * $$0.c);
   }

   public etp d(etp $$0) {
      return this.a($$0.c, $$0.d, $$0.e);
   }

   public etp a(double $$0, double $$1, double $$2) {
      return this.b(-$$0, -$$1, -$$2);
   }

   public etp e(etp $$0) {
      return this.b($$0.c, $$0.d, $$0.e);
   }

   public etp b(double $$0, double $$1, double $$2) {
      return new etp(this.c + $$0, this.d + $$1, this.e + $$2);
   }

   public boolean a(jg $$0, double $$1) {
      return this.c($$0.a(), $$0.b(), $$0.c()) < $$1 * $$1;
   }

   public double f(etp $$0) {
      double $$1 = $$0.c - this.c;
      double $$2 = $$0.d - this.d;
      double $$3 = $$0.e - this.e;
      return Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double g(etp $$0) {
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

   public boolean a(etp $$0, double $$1, double $$2) {
      double $$3 = $$0.a() - this.c;
      double $$4 = $$0.b() - this.d;
      double $$5 = $$0.c() - this.e;
      return axz.e($$3, $$5) < axz.k($$1) && Math.abs($$4) < $$2;
   }

   public etp a(double $$0) {
      return this.d($$0, $$0, $$0);
   }

   public etp e() {
      return this.a(-1.0);
   }

   public etp h(etp $$0) {
      return this.d($$0.c, $$0.d, $$0.e);
   }

   public etp d(double $$0, double $$1, double $$2) {
      return new etp(this.c * $$0, this.d * $$1, this.e * $$2);
   }

   public etp a(ayg $$0, float $$1) {
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
      } else if (!($$0 instanceof etp $$1)) {
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

   public etp a(etp $$0, double $$1) {
      return new etp(axz.d($$1, this.c, $$0.c), axz.d($$1, this.d, $$0.d), axz.d($$1, this.e, $$0.e));
   }

   public etp a(float $$0) {
      float $$1 = axz.b($$0);
      float $$2 = axz.a($$0);
      double $$3 = this.c;
      double $$4 = this.d * (double)$$1 + this.e * (double)$$2;
      double $$5 = this.e * (double)$$1 - this.d * (double)$$2;
      return new etp($$3, $$4, $$5);
   }

   public etp b(float $$0) {
      float $$1 = axz.b($$0);
      float $$2 = axz.a($$0);
      double $$3 = this.c * (double)$$1 + this.e * (double)$$2;
      double $$4 = this.d;
      double $$5 = this.e * (double)$$1 - this.c * (double)$$2;
      return new etp($$3, $$4, $$5);
   }

   public etp c(float $$0) {
      float $$1 = axz.b($$0);
      float $$2 = axz.a($$0);
      double $$3 = this.c * (double)$$1 + this.d * (double)$$2;
      double $$4 = this.d * (double)$$1 - this.c * (double)$$2;
      double $$5 = this.e;
      return new etp($$3, $$4, $$5);
   }

   public static etp a(eto $$0) {
      return a($$0.i, $$0.j);
   }

   public static etp a(float $$0, float $$1) {
      float $$2 = axz.b(-$$1 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$3 = axz.a(-$$1 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$4 = -axz.b(-$$0 * (float) (Math.PI / 180.0));
      float $$5 = axz.a(-$$0 * (float) (Math.PI / 180.0));
      return new etp((double)($$3 * $$4), (double)$$5, (double)($$2 * $$4));
   }

   public etp a(EnumSet<is.a> $$0) {
      double $$1 = $$0.contains(is.a.a) ? (double)axz.a(this.c) : this.c;
      double $$2 = $$0.contains(is.a.b) ? (double)axz.a(this.d) : this.d;
      double $$3 = $$0.contains(is.a.c) ? (double)axz.a(this.e) : this.e;
      return new etp($$1, $$2, $$3);
   }

   public double a(is.a $$0) {
      return $$0.a(this.c, this.d, this.e);
   }

   public etp a(is.a $$0, double $$1) {
      double $$2 = $$0 == is.a.a ? $$1 : this.c;
      double $$3 = $$0 == is.a.b ? $$1 : this.d;
      double $$4 = $$0 == is.a.c ? $$1 : this.e;
      return new etp($$2, $$3, $$4);
   }

   public etp a(is $$0, double $$1) {
      jr $$2 = $$0.q();
      return new etp(this.c + $$1 * (double)$$2.u(), this.d + $$1 * (double)$$2.v(), this.e + $$1 * (double)$$2.w());
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
