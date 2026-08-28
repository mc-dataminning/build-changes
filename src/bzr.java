import java.util.Optional;

public class bzr implements bzo {
   protected final btt a;
   protected float b;
   protected float c;
   protected int d;
   protected double e;
   protected double f;
   protected double g;

   public bzr(btt $$0) {
      this.a = $$0;
   }

   public void a(evt $$0) {
      this.a($$0.c, $$0.d, $$0.e);
   }

   public void a(bsw $$0) {
      this.a($$0.du(), b($$0), $$0.dA());
   }

   public void a(bsw $$0, float $$1, float $$2) {
      this.a($$0.du(), b($$0), $$0.dA(), $$1, $$2);
   }

   public void a(double $$0, double $$1, double $$2) {
      this.a($$0, $$1, $$2, (float)this.a.ae(), (float)this.a.aa());
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = 2;
   }

   public void a() {
      if (this.c()) {
         this.a.s(0.0F);
      }

      if (this.d > 0) {
         this.d--;
         this.i().ifPresent($$0 -> this.a.ba = this.a(this.a.ba, $$0, this.b));
         this.h().ifPresent($$0 -> this.a.s(this.a(this.a.dH(), $$0, this.c)));
      } else {
         this.a.ba = this.a(this.a.ba, this.a.aY, 10.0F);
      }

      this.b();
   }

   protected void b() {
      if (!this.a.K().l()) {
         this.a.ba = ayz.c(this.a.ba, this.a.aY, (float)this.a.ab());
      }
   }

   protected boolean c() {
      return true;
   }

   public boolean d() {
      return this.d > 0;
   }

   public double e() {
      return this.e;
   }

   public double f() {
      return this.f;
   }

   public double g() {
      return this.g;
   }

   protected Optional<Float> h() {
      double $$0 = this.e - this.a.du();
      double $$1 = this.f - this.a.dy();
      double $$2 = this.g - this.a.dA();
      double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
      return !(Math.abs($$1) > 1.0E-5F) && !(Math.abs($$3) > 1.0E-5F) ? Optional.empty() : Optional.of((float)(-(ayz.d($$1, $$3) * 180.0F / (float)Math.PI)));
   }

   protected Optional<Float> i() {
      double $$0 = this.e - this.a.du();
      double $$1 = this.g - this.a.dA();
      return !(Math.abs($$1) > 1.0E-5F) && !(Math.abs($$0) > 1.0E-5F)
         ? Optional.empty()
         : Optional.of((float)(ayz.d($$1, $$0) * 180.0F / (float)Math.PI) - 90.0F);
   }

   protected float a(float $$0, float $$1, float $$2) {
      float $$3 = ayz.c($$0, $$1);
      float $$4 = ayz.a($$3, -$$2, $$2);
      return $$0 + $$4;
   }

   private static double b(bsw $$0) {
      return $$0 instanceof btr ? $$0.dy() : ($$0.cK().b + $$0.cK().e) / 2.0;
   }
}
