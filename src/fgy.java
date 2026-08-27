public class fgy<T extends bil> extends ffh<T> {
   private static final String a = "upper_body";
   private final fhx b;
   private final fhx f;
   private final fhx g;
   private final fhx h;
   private final fhx i;

   public fgy(fhx $$0) {
      this.b = $$0;
      this.g = $$0.b("head");
      this.h = $$0.b("left_arm");
      this.i = $$0.b("right_arm");
      this.f = $$0.b("upper_body");
   }

   public static fid b() {
      fif $$0 = new fif();
      fig $$1 = $$0.a();
      float $$2 = 4.0F;
      fib $$3 = new fib(-0.5F);
      $$1.a("head", fic.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$3), fhz.a(0.0F, 4.0F, 0.0F));
      fic $$4 = fic.c().a(32, 0).a(-1.0F, 0.0F, -1.0F, 12.0F, 2.0F, 2.0F, $$3);
      $$1.a("left_arm", $$4, fhz.a(5.0F, 6.0F, 1.0F, 0.0F, 0.0F, 1.0F));
      $$1.a("right_arm", $$4, fhz.a(-5.0F, 6.0F, -1.0F, 0.0F, (float) Math.PI, -1.0F));
      $$1.a("upper_body", fic.c().a(0, 16).a(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, $$3), fhz.a(0.0F, 13.0F, 0.0F));
      $$1.a("lower_body", fic.c().a(0, 36).a(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F, $$3), fhz.a(0.0F, 24.0F, 0.0F));
      return fid.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.g.f = $$4 * (float) (Math.PI / 180.0);
      this.g.e = $$5 * (float) (Math.PI / 180.0);
      this.f.f = $$4 * (float) (Math.PI / 180.0) * 0.25F;
      float $$6 = ars.a(this.f.f);
      float $$7 = ars.b(this.f.f);
      this.h.f = this.f.f;
      this.i.f = this.f.f + (float) Math.PI;
      this.h.b = $$7 * 5.0F;
      this.h.d = -$$6 * 5.0F;
      this.i.b = -$$7 * 5.0F;
      this.i.d = $$6 * 5.0F;
   }

   @Override
   public fhx a() {
      return this.b;
   }

   public fhx c() {
      return this.g;
   }
}
