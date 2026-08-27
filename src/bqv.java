import java.util.Optional;

public class bqv implements bqs {
   protected final bla a;
   protected float b;
   protected float c;
   protected int d;
   protected double e;
   protected double f;
   protected double g;

   public bqv(bla $$0) {
      this.a = $$0;
   }

   public void a(eji $$0) {
      this.a($$0.c, $$0.d, $$0.e);
   }

   public void a(bki $$0) {
      this.a($$0.dq(), b($$0), $$0.dw());
   }

   public void a(bki $$0, float $$1, float $$2) {
      this.a($$0.dq(), b($$0), $$0.dw(), $$1, $$2);
   }

   public void a(double $$0, double $$1, double $$2) {
      this.a($$0, $$1, $$2, (float)this.a.fH(), (float)this.a.Y());
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
         this.i().ifPresent($$0 -> this.a.aW = this.a(this.a.aW, $$0, this.b));
         this.h().ifPresent($$0 -> this.a.s(this.a(this.a.dD(), $$0, this.c)));
      } else {
         this.a.aW = this.a(this.a.aW, this.a.aU, 10.0F);
      }

      this.b();
   }

   protected void b() {
      if (!this.a.L().l()) {
         this.a.aW = ati.c(this.a.aW, this.a.aU, (float)this.a.Z());
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
      double $$0 = this.e - this.a.dq();
      double $$1 = this.f - this.a.du();
      double $$2 = this.g - this.a.dw();
      double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
      return !(Math.abs($$1) > 1.0E-5F) && !(Math.abs($$3) > 1.0E-5F) ? Optional.empty() : Optional.of((float)(-(ati.d($$1, $$3) * 180.0F / (float)Math.PI)));
   }

   protected Optional<Float> i() {
      double $$0 = this.e - this.a.dq();
      double $$1 = this.g - this.a.dw();
      return !(Math.abs($$1) > 1.0E-5F) && !(Math.abs($$0) > 1.0E-5F)
         ? Optional.empty()
         : Optional.of((float)(ati.d($$1, $$0) * 180.0F / (float)Math.PI) - 90.0F);
   }

   protected float a(float $$0, float $$1, float $$2) {
      float $$3 = ati.c($$0, $$1);
      float $$4 = ati.a($$3, -$$2, $$2);
      return $$0 + $$4;
   }

   private static double b(bki $$0) {
      return $$0 instanceof bky ? $$0.du() : ($$0.cG().b + $$0.cG().e) / 2.0;
   }
}
