import com.mojang.serialization.Codec;
import java.util.EnumSet;
import java.util.List;
import org.joml.Vector3f;

public class euk implements jh {
   public static final Codec<euk> a = Codec.DOUBLE
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 3).map($$0x -> new euk((Double)$$0x.get(0), (Double)$$0x.get(1), (Double)$$0x.get(2))), $$0 -> List.of($$0.a(), $$0.b(), $$0.c())
      );
   public static final euk b = new euk(0.0, 0.0, 0.0);
   public final double c;
   public final double d;
   public final double e;

   public static euk a(int $$0) {
      double $$1 = (double)($$0 >> 16 & 0xFF) / 255.0;
      double $$2 = (double)($$0 >> 8 & 0xFF) / 255.0;
      double $$3 = (double)($$0 & 0xFF) / 255.0;
      return new euk($$1, $$2, $$3);
   }

   public static euk a(js $$0) {
      return new euk((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
   }

   public static euk a(js $$0, double $$1, double $$2, double $$3) {
      return new euk((double)$$0.u() + $$1, (double)$$0.v() + $$2, (double)$$0.w() + $$3);
   }

   public static euk b(js $$0) {
      return a($$0, 0.5, 0.5, 0.5);
   }

   public static euk c(js $$0) {
      return a($$0, 0.5, 0.0, 0.5);
   }

   public static euk a(js $$0, double $$1) {
      return a($$0, 0.5, $$1, 0.5);
   }

   public euk(double $$0, double $$1, double $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public euk(Vector3f $$0) {
      this((double)$$0.x(), (double)$$0.y(), (double)$$0.z());
   }

   public euk a(euk $$0) {
      return new euk($$0.c - this.c, $$0.d - this.d, $$0.e - this.e);
   }

   public euk d() {
      double $$0 = Math.sqrt(this.c * this.c + this.d * this.d + this.e * this.e);
      return $$0 < 1.0E-4 ? b : new euk(this.c / $$0, this.d / $$0, this.e / $$0);
   }

   public double b(euk $$0) {
      return this.c * $$0.c + this.d * $$0.d + this.e * $$0.e;
   }

   public euk c(euk $$0) {
      return new euk(this.d * $$0.e - this.e * $$0.d, this.e * $$0.c - this.c * $$0.e, this.c * $$0.d - this.d * $$0.c);
   }

   public euk d(euk $$0) {
      return this.a($$0.c, $$0.d, $$0.e);
   }

   public euk a(double $$0, double $$1, double $$2) {
      return this.b(-$$0, -$$1, -$$2);
   }

   public euk e(euk $$0) {
      return this.b($$0.c, $$0.d, $$0.e);
   }

   public euk b(double $$0, double $$1, double $$2) {
      return new euk(this.c + $$0, this.d + $$1, this.e + $$2);
   }

   public boolean a(jh $$0, double $$1) {
      return this.c($$0.a(), $$0.b(), $$0.c()) < $$1 * $$1;
   }

   public double f(euk $$0) {
      double $$1 = $$0.c - this.c;
      double $$2 = $$0.d - this.d;
      double $$3 = $$0.e - this.e;
      return Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double g(euk $$0) {
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

   public boolean a(euk $$0, double $$1, double $$2) {
      double $$3 = $$0.a() - this.c;
      double $$4 = $$0.b() - this.d;
      double $$5 = $$0.c() - this.e;
      return ayd.e($$3, $$5) < ayd.k($$1) && Math.abs($$4) < $$2;
   }

   public euk a(double $$0) {
      return this.d($$0, $$0, $$0);
   }

   public euk e() {
      return this.a(-1.0);
   }

   public euk h(euk $$0) {
      return this.d($$0.c, $$0.d, $$0.e);
   }

   public euk d(double $$0, double $$1, double $$2) {
      return new euk(this.c * $$0, this.d * $$1, this.e * $$2);
   }

   public euk a(ayk $$0, float $$1) {
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
      } else if (!($$0 instanceof euk $$1)) {
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

   public euk a(euk $$0, double $$1) {
      return new euk(ayd.d($$1, this.c, $$0.c), ayd.d($$1, this.d, $$0.d), ayd.d($$1, this.e, $$0.e));
   }

   public euk a(float $$0) {
      float $$1 = ayd.b($$0);
      float $$2 = ayd.a($$0);
      double $$3 = this.c;
      double $$4 = this.d * (double)$$1 + this.e * (double)$$2;
      double $$5 = this.e * (double)$$1 - this.d * (double)$$2;
      return new euk($$3, $$4, $$5);
   }

   public euk b(float $$0) {
      float $$1 = ayd.b($$0);
      float $$2 = ayd.a($$0);
      double $$3 = this.c * (double)$$1 + this.e * (double)$$2;
      double $$4 = this.d;
      double $$5 = this.e * (double)$$1 - this.c * (double)$$2;
      return new euk($$3, $$4, $$5);
   }

   public euk c(float $$0) {
      float $$1 = ayd.b($$0);
      float $$2 = ayd.a($$0);
      double $$3 = this.c * (double)$$1 + this.d * (double)$$2;
      double $$4 = this.d * (double)$$1 - this.c * (double)$$2;
      double $$5 = this.e;
      return new euk($$3, $$4, $$5);
   }

   public static euk a(euj $$0) {
      return a($$0.i, $$0.j);
   }

   public static euk a(float $$0, float $$1) {
      float $$2 = ayd.b(-$$1 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$3 = ayd.a(-$$1 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$4 = -ayd.b(-$$0 * (float) (Math.PI / 180.0));
      float $$5 = ayd.a(-$$0 * (float) (Math.PI / 180.0));
      return new euk((double)($$3 * $$4), (double)$$5, (double)($$2 * $$4));
   }

   public euk a(EnumSet<it.a> $$0) {
      double $$1 = $$0.contains(it.a.a) ? (double)ayd.a(this.c) : this.c;
      double $$2 = $$0.contains(it.a.b) ? (double)ayd.a(this.d) : this.d;
      double $$3 = $$0.contains(it.a.c) ? (double)ayd.a(this.e) : this.e;
      return new euk($$1, $$2, $$3);
   }

   public double a(it.a $$0) {
      return $$0.a(this.c, this.d, this.e);
   }

   public euk a(it.a $$0, double $$1) {
      double $$2 = $$0 == it.a.a ? $$1 : this.c;
      double $$3 = $$0 == it.a.b ? $$1 : this.d;
      double $$4 = $$0 == it.a.c ? $$1 : this.e;
      return new euk($$2, $$3, $$4);
   }

   public euk a(it $$0, double $$1) {
      js $$2 = $$0.q();
      return new euk(this.c + $$1 * (double)$$2.u(), this.d + $$1 * (double)$$2.v(), this.e + $$1 * (double)$$2.w());
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
