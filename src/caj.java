import java.util.Optional;

public class caj implements cag {
   protected final bum a;
   protected float b;
   protected float c;
   protected int d;
   protected double e;
   protected double f;
   protected double g;

   public caj(bum $$0) {
      this.a = $$0;
   }

   public void a(eys $$0) {
      this.a($$0.d, $$0.e, $$0.f);
   }

   public void a(bto $$0) {
      this.a($$0.dx(), b($$0), $$0.dD());
   }

   public void a(bto $$0, float $$1, float $$2) {
      this.a($$0.dx(), b($$0), $$0.dD(), $$1, $$2);
   }

   public void a(double $$0, double $$1, double $$2) {
      this.a($$0, $$1, $$2, (float)this.a.fR(), (float)this.a.ae());
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
         this.a.w(0.0F);
      }

      if (this.d > 0) {
         this.d--;
         this.i().ifPresent($$0 -> this.a.aV = this.a(this.a.aV, $$0, this.b));
         this.h().ifPresent($$0 -> this.a.w(this.a(this.a.dK(), $$0, this.c)));
      } else {
         this.a.aV = this.a(this.a.aV, this.a.aT, 10.0F);
      }

      this.b();
   }

   protected void b() {
      if (!this.a.P().m()) {
         this.a.aV = azd.c(this.a.aV, this.a.aT, (float)this.a.ag());
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
      double $$0 = this.e - this.a.dx();
      double $$1 = this.f - this.a.dB();
      double $$2 = this.g - this.a.dD();
      double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
      return !(Math.abs($$1) > 1.0E-5F) && !(Math.abs($$3) > 1.0E-5F) ? Optional.empty() : Optional.of((float)(-(azd.d($$1, $$3) * 180.0F / (float)Math.PI)));
   }

   protected Optional<Float> i() {
      double $$0 = this.e - this.a.dx();
      double $$1 = this.g - this.a.dD();
      return !(Math.abs($$1) > 1.0E-5F) && !(Math.abs($$0) > 1.0E-5F)
         ? Optional.empty()
         : Optional.of((float)(azd.d($$1, $$0) * 180.0F / (float)Math.PI) - 90.0F);
   }

   protected float a(float $$0, float $$1, float $$2) {
      float $$3 = azd.c($$0, $$1);
      float $$4 = azd.a($$3, -$$2, $$2);
      return $$0 + $$4;
   }

   private static double b(bto $$0) {
      return $$0 instanceof buk ? $$0.dB() : ($$0.cO().b + $$0.cO().e) / 2.0;
   }
}
