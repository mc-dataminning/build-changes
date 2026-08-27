public class fre extends fsk<cdk> {
   private final fvb a;
   private final fvb b;
   private final fvb f;
   private final fvb g;
   private final fvb h;
   private final fvb i;
   private final fvb j;
   private final fvb k;

   public fre(fvb $$0) {
      super(gbw::d);
      this.a = $$0;
      this.f = $$0.b("body");
      this.b = $$0.b("head");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
      this.k = this.f.b("feet");
   }

   public static fvh b() {
      fvj $$0 = new fvj();
      fvk $$1 = $$0.a();
      fvk $$2 = $$1.a("body", fvg.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), fvd.a(0.0F, 17.0F, 0.0F));
      fvk $$3 = $$1.a("head", fvg.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), fvd.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", fvg.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), fvd.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", fvg.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), fvd.a(1.1F, -3.0F, 0.0F));
      fvk $$4 = $$2.a("right_wing", fvg.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fvd.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", fvg.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fvd.a(-2.0F, 0.0F, 0.0F));
      fvk $$5 = $$2.a("left_wing", fvg.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fvd.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", fvg.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fvd.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", fvg.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), fvd.a(0.0F, 5.0F, 0.0F));
      return fvh.a($$0, 32, 32);
   }

   @Override
   public fvb a() {
      return this.a;
   }

   public void a(cdk $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fvb::c);
      if ($$0.u()) {
         this.a($$4);
      }

      this.a($$0.d, fdz.b, $$3, 1.0F);
      this.a($$0.e, fdz.a, $$3, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
