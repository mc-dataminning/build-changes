public class flf extends fmk<bzo> {
   private final fpc a;
   private final fpc b;
   private final fpc f;
   private final fpc g;
   private final fpc h;
   private final fpc i;
   private final fpc j;
   private final fpc k;

   public flf(fpc $$0) {
      super(fvt::d);
      this.a = $$0;
      this.f = $$0.b("body");
      this.b = $$0.b("head");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
      this.k = this.f.b("feet");
   }

   public static fpi b() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      fpl $$2 = $$1.a("body", fph.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), fpe.a(0.0F, 17.0F, 0.0F));
      fpl $$3 = $$1.a("head", fph.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), fpe.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", fph.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), fpe.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", fph.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), fpe.a(1.1F, -3.0F, 0.0F));
      fpl $$4 = $$2.a("right_wing", fph.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fpe.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", fph.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fpe.a(-2.0F, 0.0F, 0.0F));
      fpl $$5 = $$2.a("left_wing", fph.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fpe.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", fph.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fpe.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", fph.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), fpe.a(0.0F, 5.0F, 0.0F));
      return fpi.a($$0, 32, 32);
   }

   @Override
   public fpc a() {
      return this.a;
   }

   public void a(bzo $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fpc::c);
      if ($$0.w()) {
         this.a($$4);
      }

      this.a($$0.d, eyc.b, $$3, 1.0F);
      this.a($$0.e, eyc.a, $$3, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
