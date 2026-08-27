import java.util.Optional;

public class bvo implements bvl {
   protected final bpr a;
   protected float b;
   protected float c;
   protected int d;
   protected double e;
   protected double f;
   protected double g;

   public bvo(bpr $$0) {
      this.a = $$0;
   }

   public void a(ept $$0) {
      this.a($$0.c, $$0.d, $$0.e);
   }

   public void a(box $$0) {
      this.a($$0.dr(), b($$0), $$0.dx());
   }

   public void a(box $$0, float $$1, float $$2) {
      this.a($$0.dr(), b($$0), $$0.dx(), $$1, $$2);
   }

   public void a(double $$0, double $$1, double $$2) {
      this.a($$0, $$1, $$2, (float)this.a.fN(), (float)this.a.Z());
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
         this.i().ifPresent($$0 -> this.a.aZ = this.a(this.a.aZ, $$0, this.b));
         this.h().ifPresent($$0 -> this.a.s(this.a(this.a.dE(), $$0, this.c)));
      } else {
         this.a.aZ = this.a(this.a.aZ, this.a.aX, 10.0F);
      }

      this.b();
   }

   protected void b() {
      if (!this.a.K().l()) {
         this.a.aZ = aww.c(this.a.aZ, this.a.aX, (float)this.a.aa());
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
      double $$0 = this.e - this.a.dr();
      double $$1 = this.f - this.a.dv();
      double $$2 = this.g - this.a.dx();
      double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
      return !(Math.abs($$1) > 1.0E-5F) && !(Math.abs($$3) > 1.0E-5F) ? Optional.empty() : Optional.of((float)(-(aww.d($$1, $$3) * 180.0F / (float)Math.PI)));
   }

   protected Optional<Float> i() {
      double $$0 = this.e - this.a.dr();
      double $$1 = this.g - this.a.dx();
      return !(Math.abs($$1) > 1.0E-5F) && !(Math.abs($$0) > 1.0E-5F)
         ? Optional.empty()
         : Optional.of((float)(aww.d($$1, $$0) * 180.0F / (float)Math.PI) - 90.0F);
   }

   protected float a(float $$0, float $$1, float $$2) {
      float $$3 = aww.c($$0, $$1);
      float $$4 = aww.a($$3, -$$2, $$2);
      return $$0 + $$4;
   }

   private static double b(box $$0) {
      return $$0 instanceof bpp ? $$0.dv() : ($$0.cH().b + $$0.cH().e) / 2.0;
   }
}
