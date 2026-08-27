public class fic extends fjh<bxd> {
   private final fly a;
   private final fly b;
   private final fly f;
   private final fly g;
   private final fly h;
   private final fly i;
   private final fly j;
   private final fly k;

   public fic(fly $$0) {
      super(fsq::d);
      this.a = $$0;
      this.f = $$0.b("body");
      this.b = $$0.b("head");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
      this.k = this.f.b("feet");
   }

   public static fme b() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      fmh $$2 = $$1.a("body", fmd.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), fma.a(0.0F, 17.0F, 0.0F));
      fmh $$3 = $$1.a("head", fmd.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), fma.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", fmd.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), fma.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", fmd.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), fma.a(1.1F, -3.0F, 0.0F));
      fmh $$4 = $$2.a("right_wing", fmd.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fma.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", fmd.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fma.a(-2.0F, 0.0F, 0.0F));
      fmh $$5 = $$2.a("left_wing", fmd.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fma.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", fmd.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fma.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", fmd.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), fma.a(0.0F, 5.0F, 0.0F));
      return fme.a($$0, 32, 32);
   }

   @Override
   public fly a() {
      return this.a;
   }

   public void a(bxd $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fly::c);
      if ($$0.w()) {
         this.a($$4);
      }

      this.a($$0.d, eve.b, $$3, 1.0F);
      this.a($$0.e, eve.a, $$3, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
