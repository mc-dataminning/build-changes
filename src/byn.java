import java.util.Optional;

public class byn implements byk {
   protected final bsq a;
   protected float b;
   protected float c;
   protected int d;
   protected double e;
   protected double f;
   protected double g;

   public byn(bsq $$0) {
      this.a = $$0;
   }

   public void a(ewu $$0) {
      this.a($$0.c, $$0.d, $$0.e);
   }

   public void a(brv $$0) {
      this.a($$0.dz(), b($$0), $$0.dF());
   }

   public void a(brv $$0, float $$1, float $$2) {
      this.a($$0.dz(), b($$0), $$0.dF(), $$1, $$2);
   }

   public void a(double $$0, double $$1, double $$2) {
      this.a($$0, $$1, $$2, (float)this.a.ac(), (float)this.a.Z());
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
         this.i().ifPresent($$0 -> this.a.bl = this.a(this.a.bl, $$0, this.b));
         this.h().ifPresent($$0 -> this.a.s(this.a(this.a.dM(), $$0, this.c)));
      } else {
         this.a.bl = this.a(this.a.bl, this.a.bj, 10.0F);
      }

      this.b();
   }

   protected void b() {
      if (!this.a.J().l()) {
         this.a.bl = aym.c(this.a.bl, this.a.bj, (float)this.a.aa());
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
      double $$0 = this.e - this.a.dz();
      double $$1 = this.f - this.a.dD();
      double $$2 = this.g - this.a.dF();
      double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
      return !(Math.abs($$1) > 1.0E-5F) && !(Math.abs($$3) > 1.0E-5F) ? Optional.empty() : Optional.of((float)(-(aym.d($$1, $$3) * 180.0F / (float)Math.PI)));
   }

   protected Optional<Float> i() {
      double $$0 = this.e - this.a.dz();
      double $$1 = this.g - this.a.dF();
      return !(Math.abs($$1) > 1.0E-5F) && !(Math.abs($$0) > 1.0E-5F)
         ? Optional.empty()
         : Optional.of((float)(aym.d($$1, $$0) * 180.0F / (float)Math.PI) - 90.0F);
   }

   protected float a(float $$0, float $$1, float $$2) {
      float $$3 = aym.c($$0, $$1);
      float $$4 = aym.a($$3, -$$2, $$2);
      return $$0 + $$4;
   }

   private static double b(brv $$0) {
      return $$0 instanceof bso ? $$0.dD() : ($$0.cP().b + $$0.cP().e) / 2.0;
   }
}
