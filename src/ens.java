import com.mojang.serialization.Codec;
import java.util.EnumSet;
import java.util.List;
import org.joml.Vector3f;

public class ens implements it {
   public static final Codec<ens> a = Codec.DOUBLE
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 3).map($$0x -> new ens((Double)$$0x.get(0), (Double)$$0x.get(1), (Double)$$0x.get(2))), $$0 -> List.of($$0.a(), $$0.b(), $$0.c())
      );
   public static final ens b = new ens(0.0, 0.0, 0.0);
   public final double c;
   public final double d;
   public final double e;

   public static ens a(int $$0) {
      double $$1 = (double)($$0 >> 16 & 0xFF) / 255.0;
      double $$2 = (double)($$0 >> 8 & 0xFF) / 255.0;
      double $$3 = (double)($$0 & 0xFF) / 255.0;
      return new ens($$1, $$2, $$3);
   }

   public static ens a(jd $$0) {
      return new ens((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
   }

   public static ens a(jd $$0, double $$1, double $$2, double $$3) {
      return new ens((double)$$0.u() + $$1, (double)$$0.v() + $$2, (double)$$0.w() + $$3);
   }

   public static ens b(jd $$0) {
      return a($$0, 0.5, 0.5, 0.5);
   }

   public static ens c(jd $$0) {
      return a($$0, 0.5, 0.0, 0.5);
   }

   public static ens a(jd $$0, double $$1) {
      return a($$0, 0.5, $$1, 0.5);
   }

   public ens(double $$0, double $$1, double $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public ens(Vector3f $$0) {
      this((double)$$0.x(), (double)$$0.y(), (double)$$0.z());
   }

   public ens a(ens $$0) {
      return new ens($$0.c - this.c, $$0.d - this.d, $$0.e - this.e);
   }

   public ens d() {
      double $$0 = Math.sqrt(this.c * this.c + this.d * this.d + this.e * this.e);
      return $$0 < 1.0E-4 ? b : new ens(this.c / $$0, this.d / $$0, this.e / $$0);
   }

   public double b(ens $$0) {
      return this.c * $$0.c + this.d * $$0.d + this.e * $$0.e;
   }

   public ens c(ens $$0) {
      return new ens(this.d * $$0.e - this.e * $$0.d, this.e * $$0.c - this.c * $$0.e, this.c * $$0.d - this.d * $$0.c);
   }

   public ens d(ens $$0) {
      return this.a($$0.c, $$0.d, $$0.e);
   }

   public ens a(double $$0, double $$1, double $$2) {
      return this.b(-$$0, -$$1, -$$2);
   }

   public ens e(ens $$0) {
      return this.b($$0.c, $$0.d, $$0.e);
   }

   public ens b(double $$0, double $$1, double $$2) {
      return new ens(this.c + $$0, this.d + $$1, this.e + $$2);
   }

   public boolean a(it $$0, double $$1) {
      return this.c($$0.a(), $$0.b(), $$0.c()) < $$1 * $$1;
   }

   public double f(ens $$0) {
      double $$1 = $$0.c - this.c;
      double $$2 = $$0.d - this.d;
      double $$3 = $$0.e - this.e;
      return Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double g(ens $$0) {
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

   public boolean a(ens $$0, double $$1, double $$2) {
      double $$3 = $$0.a() - this.c;
      double $$4 = $$0.b() - this.d;
      double $$5 = $$0.c() - this.e;
      return awh.e($$3, $$5) < awh.k($$1) && Math.abs($$4) < $$2;
   }

   public ens a(double $$0) {
      return this.d($$0, $$0, $$0);
   }

   public ens e() {
      return this.a(-1.0);
   }

   public ens h(ens $$0) {
      return this.d($$0.c, $$0.d, $$0.e);
   }

   public ens d(double $$0, double $$1, double $$2) {
      return new ens(this.c * $$0, this.d * $$1, this.e * $$2);
   }

   public ens a(awo $$0, float $$1) {
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
      } else if (!($$0 instanceof ens $$1)) {
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

   public ens a(ens $$0, double $$1) {
      return new ens(awh.d($$1, this.c, $$0.c), awh.d($$1, this.d, $$0.d), awh.d($$1, this.e, $$0.e));
   }

   public ens a(float $$0) {
      float $$1 = awh.b($$0);
      float $$2 = awh.a($$0);
      double $$3 = this.c;
      double $$4 = this.d * (double)$$1 + this.e * (double)$$2;
      double $$5 = this.e * (double)$$1 - this.d * (double)$$2;
      return new ens($$3, $$4, $$5);
   }

   public ens b(float $$0) {
      float $$1 = awh.b($$0);
      float $$2 = awh.a($$0);
      double $$3 = this.c * (double)$$1 + this.e * (double)$$2;
      double $$4 = this.d;
      double $$5 = this.e * (double)$$1 - this.c * (double)$$2;
      return new ens($$3, $$4, $$5);
   }

   public ens c(float $$0) {
      float $$1 = awh.b($$0);
      float $$2 = awh.a($$0);
      double $$3 = this.c * (double)$$1 + this.d * (double)$$2;
      double $$4 = this.d * (double)$$1 - this.c * (double)$$2;
      double $$5 = this.e;
      return new ens($$3, $$4, $$5);
   }

   public static ens a(enr $$0) {
      return a($$0.i, $$0.j);
   }

   public static ens a(float $$0, float $$1) {
      float $$2 = awh.b(-$$1 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$3 = awh.a(-$$1 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$4 = -awh.b(-$$0 * (float) (Math.PI / 180.0));
      float $$5 = awh.a(-$$0 * (float) (Math.PI / 180.0));
      return new ens((double)($$3 * $$4), (double)$$5, (double)($$2 * $$4));
   }

   public ens a(EnumSet<ie.a> $$0) {
      double $$1 = $$0.contains(ie.a.a) ? (double)awh.a(this.c) : this.c;
      double $$2 = $$0.contains(ie.a.b) ? (double)awh.a(this.d) : this.d;
      double $$3 = $$0.contains(ie.a.c) ? (double)awh.a(this.e) : this.e;
      return new ens($$1, $$2, $$3);
   }

   public double a(ie.a $$0) {
      return $$0.a(this.c, this.d, this.e);
   }

   public ens a(ie.a $$0, double $$1) {
      double $$2 = $$0 == ie.a.a ? $$1 : this.c;
      double $$3 = $$0 == ie.a.b ? $$1 : this.d;
      double $$4 = $$0 == ie.a.c ? $$1 : this.e;
      return new ens($$2, $$3, $$4);
   }

   public ens a(ie $$0, double $$1) {
      jd $$2 = $$0.q();
      return new ens(this.c + $$1 * (double)$$2.u(), this.d + $$1 * (double)$$2.v(), this.e + $$1 * (double)$$2.w());
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
