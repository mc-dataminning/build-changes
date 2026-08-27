public class flm extends fmr<bzs> {
   private final fpj a;
   private final fpj b;
   private final fpj f;
   private final fpj g;
   private final fpj h;
   private final fpj i;
   private final fpj j;
   private final fpj k;

   public flm(fpj $$0) {
      super(fwb::d);
      this.a = $$0;
      this.f = $$0.b("body");
      this.b = $$0.b("head");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
      this.k = this.f.b("feet");
   }

   public static fpp b() {
      fpr $$0 = new fpr();
      fps $$1 = $$0.a();
      fps $$2 = $$1.a("body", fpo.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), fpl.a(0.0F, 17.0F, 0.0F));
      fps $$3 = $$1.a("head", fpo.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), fpl.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", fpo.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), fpl.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", fpo.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), fpl.a(1.1F, -3.0F, 0.0F));
      fps $$4 = $$2.a("right_wing", fpo.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fpl.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", fpo.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fpl.a(-2.0F, 0.0F, 0.0F));
      fps $$5 = $$2.a("left_wing", fpo.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fpl.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", fpo.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fpl.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", fpo.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), fpl.a(0.0F, 5.0F, 0.0F));
      return fpp.a($$0, 32, 32);
   }

   @Override
   public fpj a() {
      return this.a;
   }

   public void a(bzs $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fpj::c);
      if ($$0.w()) {
         this.a($$4);
      }

      this.a($$0.d, eyj.b, $$3, 1.0F);
      this.a($$0.e, eyj.a, $$3, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
