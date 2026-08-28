import java.util.Optional;

public class cby implements cbv {
   protected final bwa a;
   protected float b;
   protected float c;
   protected int d;
   protected double e;
   protected double f;
   protected double g;

   public cby(bwa $$0) {
      this.a = $$0;
   }

   public void a(fbx $$0) {
      this.a($$0.d, $$0.e, $$0.f);
   }

   public void a(bva $$0) {
      this.a($$0.dz(), b($$0), $$0.dF());
   }

   public void a(bva $$0, float $$1, float $$2) {
      this.a($$0.dz(), b($$0), $$0.dF(), $$1, $$2);
   }

   public void a(double $$0, double $$1, double $$2) {
      this.a($$0, $$1, $$2, (float)this.a.ag(), (float)this.a.ac());
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
         this.h().ifPresent($$0 -> this.a.x(this.a(this.a.dM(), $$0, this.c)));
      } else {
         this.a.aX = this.a(this.a.aX, this.a.aV, 10.0F);
      }

      this.b();
   }

   protected void b() {
      if (!this.a.O().k()) {
         this.a.aX = ayz.c(this.a.aX, this.a.aV, (float)this.a.ad());
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
      return !(Math.abs($$1) > 1.0E-5F) && !(Math.abs($$3) > 1.0E-5F) ? Optional.empty() : Optional.of((float)(-(ayz.d($$1, $$3) * 180.0F / (float)Math.PI)));
   }

   protected Optional<Float> i() {
      double $$0 = this.e - this.a.dz();
      double $$1 = this.g - this.a.dF();
      return !(Math.abs($$1) > 1.0E-5F) && !(Math.abs($$0) > 1.0E-5F)
         ? Optional.empty()
         : Optional.of((float)(ayz.d($$1, $$0) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private static double b(bva $$0) {
      return $$0 instanceof bvy ? $$0.dD() : ($$0.cQ().b + $$0.cQ().e) / 2.0;
   }
}
