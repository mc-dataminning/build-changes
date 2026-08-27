import java.util.Optional;

public class buw implements but {
   protected final boz a;
   protected float b;
   protected float c;
   protected int d;
   protected double e;
   protected double f;
   protected double g;

   public buw(boz $$0) {
      this.a = $$0;
   }

   public void a(eov $$0) {
      this.a($$0.c, $$0.d, $$0.e);
   }

   public void a(bof $$0) {
      this.a($$0.do(), b($$0), $$0.du());
   }

   public void a(bof $$0, float $$1, float $$2) {
      this.a($$0.do(), b($$0), $$0.du(), $$1, $$2);
   }

   public void a(double $$0, double $$1, double $$2) {
      this.a($$0, $$1, $$2, (float)this.a.fL(), (float)this.a.ab());
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
         this.i().ifPresent($$0 -> this.a.aX = this.a(this.a.aX, $$0, this.b));
         this.h().ifPresent($$0 -> this.a.s(this.a(this.a.dB(), $$0, this.c)));
      } else {
         this.a.aX = this.a(this.a.aX, this.a.aV, 10.0F);
      }

      this.b();
   }

   protected void b() {
      if (!this.a.N().l()) {
         this.a.aX = awm.c(this.a.aX, this.a.aV, (float)this.a.fJ());
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
      double $$0 = this.e - this.a.do();
      double $$1 = this.f - this.a.ds();
      double $$2 = this.g - this.a.du();
      double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
      return !(Math.abs($$1) > 1.0E-5F) && !(Math.abs($$3) > 1.0E-5F) ? Optional.empty() : Optional.of((float)(-(awm.d($$1, $$3) * 180.0F / (float)Math.PI)));
   }

   protected Optional<Float> i() {
      double $$0 = this.e - this.a.do();
      double $$1 = this.g - this.a.du();
      return !(Math.abs($$1) > 1.0E-5F) && !(Math.abs($$0) > 1.0E-5F)
         ? Optional.empty()
         : Optional.of((float)(awm.d($$1, $$0) * 180.0F / (float)Math.PI) - 90.0F);
   }

   protected float a(float $$0, float $$1, float $$2) {
      float $$3 = awm.c($$0, $$1);
      float $$4 = awm.a($$3, -$$2, $$2);
      return $$0 + $$4;
   }

   private static double b(bof $$0) {
      return $$0 instanceof box ? $$0.ds() : ($$0.cE().b + $$0.cE().e) / 2.0;
   }
}
