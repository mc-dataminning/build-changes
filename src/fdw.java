import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.List;
import org.joml.Vector3f;

public class fdw implements jo {
   public static final Codec<fdw> a = Codec.DOUBLE
      .listOf()
      .comapFlatMap(
         $$0 -> af.a($$0, 3).map($$0x -> new fdw((Double)$$0x.get(0), (Double)$$0x.get(1), (Double)$$0x.get(2))), $$0 -> List.of($$0.a(), $$0.b(), $$0.c())
      );
   public static final yu<ByteBuf, fdw> b = new yu<ByteBuf, fdw>() {
      public fdw a(ByteBuf $$0) {
         return vs.f($$0);
      }

      public void a(ByteBuf $$0, fdw $$1) {
         vs.a($$0, $$1);
      }
   };
   public static final fdw c = new fdw(0.0, 0.0, 0.0);
   public final double d;
   public final double e;
   public final double f;

   public static fdw a(int $$0) {
      double $$1 = (double)($$0 >> 16 & 0xFF) / 255.0;
      double $$2 = (double)($$0 >> 8 & 0xFF) / 255.0;
      double $$3 = (double)($$0 & 0xFF) / 255.0;
      return new fdw($$1, $$2, $$3);
   }

   public static fdw a(jz $$0) {
      return new fdw((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
   }

   public static fdw a(jz $$0, double $$1, double $$2, double $$3) {
      return new fdw((double)$$0.u() + $$1, (double)$$0.v() + $$2, (double)$$0.w() + $$3);
   }

   public static fdw b(jz $$0) {
      return a($$0, 0.5, 0.5, 0.5);
   }

   public static fdw c(jz $$0) {
      return a($$0, 0.5, 0.0, 0.5);
   }

   public static fdw a(jz $$0, double $$1) {
      return a($$0, 0.5, $$1, 0.5);
   }

   public fdw(double $$0, double $$1, double $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public fdw(Vector3f $$0) {
      this((double)$$0.x(), (double)$$0.y(), (double)$$0.z());
   }

   public fdw(jz $$0) {
      this((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
   }

   public fdw a(fdw $$0) {
      return new fdw($$0.d - this.d, $$0.e - this.e, $$0.f - this.f);
   }

   public fdw d() {
      double $$0 = Math.sqrt(this.d * this.d + this.e * this.e + this.f * this.f);
      return $$0 < 1.0E-5F ? c : new fdw(this.d / $$0, this.e / $$0, this.f / $$0);
   }

   public double b(fdw $$0) {
      return this.d * $$0.d + this.e * $$0.e + this.f * $$0.f;
   }

   public fdw c(fdw $$0) {
      return new fdw(this.e * $$0.f - this.f * $$0.e, this.f * $$0.d - this.d * $$0.f, this.d * $$0.e - this.e * $$0.d);
   }

   public fdw d(fdw $$0) {
      return this.a($$0.d, $$0.e, $$0.f);
   }

   public fdw a(double $$0) {
      return this.a($$0, $$0, $$0);
   }

   public fdw a(double $$0, double $$1, double $$2) {
      return this.b(-$$0, -$$1, -$$2);
   }

   public fdw b(double $$0) {
      return this.b($$0, $$0, $$0);
   }

   public fdw e(fdw $$0) {
      return this.b($$0.d, $$0.e, $$0.f);
   }

   public fdw b(double $$0, double $$1, double $$2) {
      return new fdw(this.d + $$0, this.e + $$1, this.f + $$2);
   }

   public boolean a(jo $$0, double $$1) {
      return this.c($$0.a(), $$0.b(), $$0.c()) < $$1 * $$1;
   }

   public double f(fdw $$0) {
      double $$1 = $$0.d - this.d;
      double $$2 = $$0.e - this.e;
      double $$3 = $$0.f - this.f;
      return Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double g(fdw $$0) {
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

   public boolean a(fdw $$0, double $$1, double $$2) {
      double $$3 = $$0.a() - this.d;
      double $$4 = $$0.b() - this.e;
      double $$5 = $$0.c() - this.f;
      return azk.e($$3, $$5) < azk.k($$1) && Math.abs($$4) < $$2;
   }

   public fdw c(double $$0) {
      return this.d($$0, $$0, $$0);
   }

   public fdw e() {
      return this.c(-1.0);
   }

   public fdw h(fdw $$0) {
      return this.d($$0.d, $$0.e, $$0.f);
   }

   public fdw d(double $$0, double $$1, double $$2) {
      return new fdw(this.d * $$0, this.e * $$1, this.f * $$2);
   }

   public fdw f() {
      return new fdw(this.d, 0.0, this.f);
   }

   public fdw a(azt $$0, float $$1) {
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
      } else if (!($$0 instanceof fdw $$1)) {
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

   public fdw a(fdw $$0, double $$1) {
      return new fdw(azk.d($$1, this.d, $$0.d), azk.d($$1, this.e, $$0.e), azk.d($$1, this.f, $$0.f));
   }

   public fdw a(float $$0) {
      float $$1 = azk.b($$0);
      float $$2 = azk.a($$0);
      double $$3 = this.d;
      double $$4 = this.e * (double)$$1 + this.f * (double)$$2;
      double $$5 = this.f * (double)$$1 - this.e * (double)$$2;
      return new fdw($$3, $$4, $$5);
   }

   public fdw b(float $$0) {
      float $$1 = azk.b($$0);
      float $$2 = azk.a($$0);
      double $$3 = this.d * (double)$$1 + this.f * (double)$$2;
      double $$4 = this.e;
      double $$5 = this.f * (double)$$1 - this.d * (double)$$2;
      return new fdw($$3, $$4, $$5);
   }

   public fdw c(float $$0) {
      float $$1 = azk.b($$0);
      float $$2 = azk.a($$0);
      double $$3 = this.d * (double)$$1 + this.e * (double)$$2;
      double $$4 = this.e * (double)$$1 - this.d * (double)$$2;
      double $$5 = this.f;
      return new fdw($$3, $$4, $$5);
   }

   public static fdw a(fdv $$0) {
      return a($$0.i, $$0.j);
   }

   public static fdw a(float $$0, float $$1) {
      float $$2 = azk.b(-$$1 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$3 = azk.a(-$$1 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$4 = -azk.b(-$$0 * (float) (Math.PI / 180.0));
      float $$5 = azk.a(-$$0 * (float) (Math.PI / 180.0));
      return new fdw((double)($$3 * $$4), (double)$$5, (double)($$2 * $$4));
   }

   public fdw a(EnumSet<ja.a> $$0) {
      double $$1 = $$0.contains(ja.a.a) ? (double)azk.a(this.d) : this.d;
      double $$2 = $$0.contains(ja.a.b) ? (double)azk.a(this.e) : this.e;
      double $$3 = $$0.contains(ja.a.c) ? (double)azk.a(this.f) : this.f;
      return new fdw($$1, $$2, $$3);
   }

   public double a(ja.a $$0) {
      return $$0.a(this.d, this.e, this.f);
   }

   public fdw a(ja.a $$0, double $$1) {
      double $$2 = $$0 == ja.a.a ? $$1 : this.d;
      double $$3 = $$0 == ja.a.b ? $$1 : this.e;
      double $$4 = $$0 == ja.a.c ? $$1 : this.f;
      return new fdw($$2, $$3, $$4);
   }

   public fdw a(ja $$0, double $$1) {
      jz $$2 = $$0.q();
      return new fdw(this.d + $$1 * (double)$$2.u(), this.e + $$1 * (double)$$2.v(), this.f + $$1 * (double)$$2.w());
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

   public fdw i(fdw $$0) {
      return $$0.h() == 0.0 ? $$0 : $$0.c(this.b($$0)).c(1.0 / $$0.h());
   }
}
