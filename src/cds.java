import java.util.Optional;

public class cds implements cdp {
   protected final bxw a;
   protected float b;
   protected float c;
   protected int d;
   protected double e;
   protected double f;
   protected double g;

   public cds(bxw $$0) {
      this.a = $$0;
   }

   public void a(ffq $$0) {
      this.a($$0.d, $$0.e, $$0.f);
   }

   public void a(bwt $$0) {
      this.a($$0.dA(), b($$0), $$0.dG());
   }

   public void a(bwt $$0, float $$1, float $$2) {
      this.a($$0.dA(), b($$0), $$0.dG(), $$1, $$2);
   }

   public void a(double $$0, double $$1, double $$2) {
      this.a($$0, $$1, $$2, (float)this.a.ah(), (float)this.a.ad());
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
         this.a.x(0.0F);
      }

      if (this.d > 0) {
         this.d--;
         this.i().ifPresent($$0 -> this.a.aX = this.a(this.a.aX, $$0, this.b));
         this.h().ifPresent($$0 -> this.a.x(this.a(this.a.dN(), $$0, this.c)));
      } else {
         this.a.aX = this.a(this.a.aX, this.a.aV, 10.0F);
      }

      this.b();
   }

   protected void b() {
      if (!this.a.O().k()) {
         this.a.aX = azo.c(this.a.aX, this.a.aV, (float)this.a.af());
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
      double $$0 = this.e - this.a.dA();
      double $$1 = this.f - this.a.dE();
      double $$2 = this.g - this.a.dG();
      double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
      return !(Math.abs($$1) > 1.0E-5F) && !(Math.abs($$3) > 1.0E-5F) ? Optional.empty() : Optional.of((float)(-(azo.d($$1, $$3) * 180.0F / (float)Math.PI)));
   }

   protected Optional<Float> i() {
      double $$0 = this.e - this.a.dA();
      double $$1 = this.g - this.a.dG();
      return !(Math.abs($$1) > 1.0E-5F) && !(Math.abs($$0) > 1.0E-5F)
         ? Optional.empty()
         : Optional.of((float)(azo.d($$1, $$0) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private static double b(bwt $$0) {
      return $$0 instanceof bxu ? $$0.dE() : ($$0.cR().b + $$0.cR().e) / 2.0;
   }
}
