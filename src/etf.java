import com.mojang.serialization.Codec;
import java.util.EnumSet;
import java.util.List;
import org.joml.Vector3f;

public class etf implements jf {
   public static final Codec<etf> a = Codec.DOUBLE
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 3).map($$0x -> new etf((Double)$$0x.get(0), (Double)$$0x.get(1), (Double)$$0x.get(2))), $$0 -> List.of($$0.a(), $$0.b(), $$0.c())
      );
   public static final etf b = new etf(0.0, 0.0, 0.0);
   public final double c;
   public final double d;
   public final double e;

   public static etf a(int $$0) {
      double $$1 = (double)($$0 >> 16 & 0xFF) / 255.0;
      double $$2 = (double)($$0 >> 8 & 0xFF) / 255.0;
      double $$3 = (double)($$0 & 0xFF) / 255.0;
      return new etf($$1, $$2, $$3);
   }

   public static etf a(jq $$0) {
      return new etf((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
   }

   public static etf a(jq $$0, double $$1, double $$2, double $$3) {
      return new etf((double)$$0.u() + $$1, (double)$$0.v() + $$2, (double)$$0.w() + $$3);
   }

   public static etf b(jq $$0) {
      return a($$0, 0.5, 0.5, 0.5);
   }

   public static etf c(jq $$0) {
      return a($$0, 0.5, 0.0, 0.5);
   }

   public static etf a(jq $$0, double $$1) {
      return a($$0, 0.5, $$1, 0.5);
   }

   public etf(double $$0, double $$1, double $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public etf(Vector3f $$0) {
      this((double)$$0.x(), (double)$$0.y(), (double)$$0.z());
   }

   public etf a(etf $$0) {
      return new etf($$0.c - this.c, $$0.d - this.d, $$0.e - this.e);
   }

   public etf d() {
      double $$0 = Math.sqrt(this.c * this.c + this.d * this.d + this.e * this.e);
      return $$0 < 1.0E-4 ? b : new etf(this.c / $$0, this.d / $$0, this.e / $$0);
   }

   public double b(etf $$0) {
      return this.c * $$0.c + this.d * $$0.d + this.e * $$0.e;
   }

   public etf c(etf $$0) {
      return new etf(this.d * $$0.e - this.e * $$0.d, this.e * $$0.c - this.c * $$0.e, this.c * $$0.d - this.d * $$0.c);
   }

   public etf d(etf $$0) {
      return this.a($$0.c, $$0.d, $$0.e);
   }

   public etf a(double $$0, double $$1, double $$2) {
      return this.b(-$$0, -$$1, -$$2);
   }

   public etf e(etf $$0) {
      return this.b($$0.c, $$0.d, $$0.e);
   }

   public etf b(double $$0, double $$1, double $$2) {
      return new etf(this.c + $$0, this.d + $$1, this.e + $$2);
   }

   public boolean a(jf $$0, double $$1) {
      return this.c($$0.a(), $$0.b(), $$0.c()) < $$1 * $$1;
   }

   public double f(etf $$0) {
      double $$1 = $$0.c - this.c;
      double $$2 = $$0.d - this.d;
      double $$3 = $$0.e - this.e;
      return Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double g(etf $$0) {
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

   public boolean a(etf $$0, double $$1, double $$2) {
      double $$3 = $$0.a() - this.c;
      double $$4 = $$0.b() - this.d;
      double $$5 = $$0.c() - this.e;
      return axw.e($$3, $$5) < axw.k($$1) && Math.abs($$4) < $$2;
   }

   public etf a(double $$0) {
      return this.d($$0, $$0, $$0);
   }

   public etf e() {
      return this.a(-1.0);
   }

   public etf h(etf $$0) {
      return this.d($$0.c, $$0.d, $$0.e);
   }

   public etf d(double $$0, double $$1, double $$2) {
      return new etf(this.c * $$0, this.d * $$1, this.e * $$2);
   }

   public etf a(ayd $$0, float $$1) {
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
      } else if (!($$0 instanceof etf $$1)) {
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

   public etf a(etf $$0, double $$1) {
      return new etf(axw.d($$1, this.c, $$0.c), axw.d($$1, this.d, $$0.d), axw.d($$1, this.e, $$0.e));
   }

   public etf a(float $$0) {
      float $$1 = axw.b($$0);
      float $$2 = axw.a($$0);
      double $$3 = this.c;
      double $$4 = this.d * (double)$$1 + this.e * (double)$$2;
      double $$5 = this.e * (double)$$1 - this.d * (double)$$2;
      return new etf($$3, $$4, $$5);
   }

   public etf b(float $$0) {
      float $$1 = axw.b($$0);
      float $$2 = axw.a($$0);
      double $$3 = this.c * (double)$$1 + this.e * (double)$$2;
      double $$4 = this.d;
      double $$5 = this.e * (double)$$1 - this.c * (double)$$2;
      return new etf($$3, $$4, $$5);
   }

   public etf c(float $$0) {
      float $$1 = axw.b($$0);
      float $$2 = axw.a($$0);
      double $$3 = this.c * (double)$$1 + this.d * (double)$$2;
      double $$4 = this.d * (double)$$1 - this.c * (double)$$2;
      double $$5 = this.e;
      return new etf($$3, $$4, $$5);
   }

   public static etf a(ete $$0) {
      return a($$0.i, $$0.j);
   }

   public static etf a(float $$0, float $$1) {
      float $$2 = axw.b(-$$1 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$3 = axw.a(-$$1 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$4 = -axw.b(-$$0 * (float) (Math.PI / 180.0));
      float $$5 = axw.a(-$$0 * (float) (Math.PI / 180.0));
      return new etf((double)($$3 * $$4), (double)$$5, (double)($$2 * $$4));
   }

   public etf a(EnumSet<ir.a> $$0) {
      double $$1 = $$0.contains(ir.a.a) ? (double)axw.a(this.c) : this.c;
      double $$2 = $$0.contains(ir.a.b) ? (double)axw.a(this.d) : this.d;
      double $$3 = $$0.contains(ir.a.c) ? (double)axw.a(this.e) : this.e;
      return new etf($$1, $$2, $$3);
   }

   public double a(ir.a $$0) {
      return $$0.a(this.c, this.d, this.e);
   }

   public etf a(ir.a $$0, double $$1) {
      double $$2 = $$0 == ir.a.a ? $$1 : this.c;
      double $$3 = $$0 == ir.a.b ? $$1 : this.d;
      double $$4 = $$0 == ir.a.c ? $$1 : this.e;
      return new etf($$2, $$3, $$4);
   }

   public etf a(ir $$0, double $$1) {
      jq $$2 = $$0.q();
      return new etf(this.c + $$1 * (double)$$2.u(), this.d + $$1 * (double)$$2.v(), this.e + $$1 * (double)$$2.w());
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
