import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.List;
import org.joml.Vector3f;

public class ezy implements ka {
   public static final Codec<ezy> a = Codec.DOUBLE
      .listOf()
      .comapFlatMap(
         $$0 -> ae.a($$0, 3).map($$0x -> new ezy((Double)$$0x.get(0), (Double)$$0x.get(1), (Double)$$0x.get(2))), $$0 -> List.of($$0.a(), $$0.b(), $$0.c())
      );
   public static final zh<ByteBuf, ezy> b = new zh<ByteBuf, ezy>() {
      public ezy a(ByteBuf $$0) {
         return wg.f($$0);
      }

      public void a(ByteBuf $$0, ezy $$1) {
         wg.a($$0, $$1);
      }
   };
   public static final ezy c = new ezy(0.0, 0.0, 0.0);
   public final double d;
   public final double e;
   public final double f;

   public static ezy a(int $$0) {
      double $$1 = (double)($$0 >> 16 & 0xFF) / 255.0;
      double $$2 = (double)($$0 >> 8 & 0xFF) / 255.0;
      double $$3 = (double)($$0 & 0xFF) / 255.0;
      return new ezy($$1, $$2, $$3);
   }

   public static ezy a(kl $$0) {
      return new ezy((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
   }

   public static ezy a(kl $$0, double $$1, double $$2, double $$3) {
      return new ezy((double)$$0.u() + $$1, (double)$$0.v() + $$2, (double)$$0.w() + $$3);
   }

   public static ezy b(kl $$0) {
      return a($$0, 0.5, 0.5, 0.5);
   }

   public static ezy c(kl $$0) {
      return a($$0, 0.5, 0.0, 0.5);
   }

   public static ezy a(kl $$0, double $$1) {
      return a($$0, 0.5, $$1, 0.5);
   }

   public ezy(double $$0, double $$1, double $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public ezy(Vector3f $$0) {
      this((double)$$0.x(), (double)$$0.y(), (double)$$0.z());
   }

   public ezy(kl $$0) {
      this((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
   }

   public ezy a(ezy $$0) {
      return new ezy($$0.d - this.d, $$0.e - this.e, $$0.f - this.f);
   }

   public ezy d() {
      double $$0 = Math.sqrt(this.d * this.d + this.e * this.e + this.f * this.f);
      return $$0 < 1.0E-5F ? c : new ezy(this.d / $$0, this.e / $$0, this.f / $$0);
   }

   public double b(ezy $$0) {
      return this.d * $$0.d + this.e * $$0.e + this.f * $$0.f;
   }

   public ezy c(ezy $$0) {
      return new ezy(this.e * $$0.f - this.f * $$0.e, this.f * $$0.d - this.d * $$0.f, this.d * $$0.e - this.e * $$0.d);
   }

   public ezy d(ezy $$0) {
      return this.a($$0.d, $$0.e, $$0.f);
   }

   public ezy a(double $$0) {
      return this.a($$0, $$0, $$0);
   }

   public ezy a(double $$0, double $$1, double $$2) {
      return this.b(-$$0, -$$1, -$$2);
   }

   public ezy b(double $$0) {
      return this.b($$0, $$0, $$0);
   }

   public ezy e(ezy $$0) {
      return this.b($$0.d, $$0.e, $$0.f);
   }

   public ezy b(double $$0, double $$1, double $$2) {
      return new ezy(this.d + $$0, this.e + $$1, this.f + $$2);
   }

   public boolean a(ka $$0, double $$1) {
      return this.c($$0.a(), $$0.b(), $$0.c()) < $$1 * $$1;
   }

   public double f(ezy $$0) {
      double $$1 = $$0.d - this.d;
      double $$2 = $$0.e - this.e;
      double $$3 = $$0.f - this.f;
      return Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double g(ezy $$0) {
      double $$1 = $$0.d - this.d;
      double $$2 = $$0.e - this.e;
      double $$3 = $$0.f - this.f;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public double c(double $$0, double $$1, double $$2) {
      double $$3 = $$0 - this.d;
      double $$4 = $$1 - this.e;
      double $$5 = $$2 - this.f;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public boolean a(ezy $$0, double $$1, double $$2) {
      double $$3 = $$0.a() - this.d;
      double $$4 = $$0.b() - this.e;
      double $$5 = $$0.c() - this.f;
      return azm.e($$3, $$5) < azm.k($$1) && Math.abs($$4) < $$2;
   }

   public ezy c(double $$0) {
      return this.d($$0, $$0, $$0);
   }

   public ezy e() {
      return this.c(-1.0);
   }

   public ezy h(ezy $$0) {
      return this.d($$0.d, $$0.e, $$0.f);
   }

   public ezy d(double $$0, double $$1, double $$2) {
      return new ezy(this.d * $$0, this.e * $$1, this.f * $$2);
   }

   public ezy f() {
      return new ezy(this.d, 0.0, this.f);
   }

   public ezy a(azu $$0, float $$1) {
      return this.b((double)(($$0.i() - 0.5F) * $$1), (double)(($$0.i() - 0.5F) * $$1), (double)(($$0.i() - 0.5F) * $$1));
   }

   public double g() {
      return Math.sqrt(this.d * this.d + this.e * this.e + this.f * this.f);
   }

   public double h() {
      return this.d * this.d + this.e * this.e + this.f * this.f;
   }

   public double i() {
      return Math.sqrt(this.d * this.d + this.f * this.f);
   }

   public double j() {
      return this.d * this.d + this.f * this.f;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if (!($$0 instanceof ezy $$1)) {
         return false;
      } else if (Double.compare($$1.d, this.d) != 0) {
         return false;
      } else {
         return Double.compare($$1.e, this.e) != 0 ? false : Double.compare($$1.f, this.f) == 0;
      }
   }

   @Override
   public int hashCode() {
      long $$0 = Double.doubleToLongBits(this.d);
      int $$1 = (int)($$0 ^ $$0 >>> 32);
      $$0 = Double.doubleToLongBits(this.e);
      $$1 = 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
      $$0 = Double.doubleToLongBits(this.f);
      return 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
   }

   @Override
   public String toString() {
      return "(" + this.d + ", " + this.e + ", " + this.f + ")";
   }

   public ezy a(ezy $$0, double $$1) {
      return new ezy(azm.d($$1, this.d, $$0.d), azm.d($$1, this.e, $$0.e), azm.d($$1, this.f, $$0.f));
   }

   public ezy a(float $$0) {
      float $$1 = azm.b($$0);
      float $$2 = azm.a($$0);
      double $$3 = this.d;
      double $$4 = this.e * (double)$$1 + this.f * (double)$$2;
      double $$5 = this.f * (double)$$1 - this.e * (double)$$2;
      return new ezy($$3, $$4, $$5);
   }

   public ezy b(float $$0) {
      float $$1 = azm.b($$0);
      float $$2 = azm.a($$0);
      double $$3 = this.d * (double)$$1 + this.f * (double)$$2;
      double $$4 = this.e;
      double $$5 = this.f * (double)$$1 - this.d * (double)$$2;
      return new ezy($$3, $$4, $$5);
   }

   public ezy c(float $$0) {
      float $$1 = azm.b($$0);
      float $$2 = azm.a($$0);
      double $$3 = this.d * (double)$$1 + this.e * (double)$$2;
      double $$4 = this.e * (double)$$1 - this.d * (double)$$2;
      double $$5 = this.f;
      return new ezy($$3, $$4, $$5);
   }

   public static ezy a(ezx $$0) {
      return a($$0.i, $$0.j);
   }

   public static ezy a(float $$0, float $$1) {
      float $$2 = azm.b(-$$1 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$3 = azm.a(-$$1 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$4 = -azm.b(-$$0 * (float) (Math.PI / 180.0));
      float $$5 = azm.a(-$$0 * (float) (Math.PI / 180.0));
      return new ezy((double)($$3 * $$4), (double)$$5, (double)($$2 * $$4));
   }

   public ezy a(EnumSet<jm.a> $$0) {
      double $$1 = $$0.contains(jm.a.a) ? (double)azm.a(this.d) : this.d;
      double $$2 = $$0.contains(jm.a.b) ? (double)azm.a(this.e) : this.e;
      double $$3 = $$0.contains(jm.a.c) ? (double)azm.a(this.f) : this.f;
      return new ezy($$1, $$2, $$3);
   }

   public double a(jm.a $$0) {
      return $$0.a(this.d, this.e, this.f);
   }

   public ezy a(jm.a $$0, double $$1) {
      double $$2 = $$0 == jm.a.a ? $$1 : this.d;
      double $$3 = $$0 == jm.a.b ? $$1 : this.e;
      double $$4 = $$0 == jm.a.c ? $$1 : this.f;
      return new ezy($$2, $$3, $$4);
   }

   public ezy a(jm $$0, double $$1) {
      kl $$2 = $$0.q();
      return new ezy(this.d + $$1 * (double)$$2.u(), this.e + $$1 * (double)$$2.v(), this.f + $$1 * (double)$$2.w());
   }

   @Override
   public final double a() {
      return this.d;
   }

   @Override
   public final double b() {
      return this.e;
   }

   @Override
   public final double c() {
      return this.f;
   }

   public Vector3f k() {
      return new Vector3f((float)this.d, (float)this.e, (float)this.f);
   }

   public ezy i(ezy $$0) {
      return $$0.h() == 0.0 ? $$0 : $$0.c(this.b($$0)).c(1.0 / $$0.h());
   }
}
