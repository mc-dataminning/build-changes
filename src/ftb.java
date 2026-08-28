public class ftb extends fuh<cey> {
   private final fwy a;
   private final fwy b;
   private final fwy f;
   private final fwy g;
   private final fwy h;
   private final fwy i;
   private final fwy j;
   private final fwy k;

   public ftb(fwy $$0) {
      super(gdu::d);
      this.a = $$0;
      this.f = $$0.b("body");
      this.b = $$0.b("head");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
      this.k = this.f.b("feet");
   }

   public static fxe b() {
      fxg $$0 = new fxg();
      fxh $$1 = $$0.a();
      fxh $$2 = $$1.a("body", fxd.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), fxa.a(0.0F, 17.0F, 0.0F));
      fxh $$3 = $$1.a("head", fxd.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), fxa.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", fxd.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), fxa.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", fxd.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), fxa.a(1.1F, -3.0F, 0.0F));
      fxh $$4 = $$2.a("right_wing", fxd.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fxa.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", fxd.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fxa.a(-2.0F, 0.0F, 0.0F));
      fxh $$5 = $$2.a("left_wing", fxd.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fxa.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", fxd.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fxa.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", fxd.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), fxa.a(0.0F, 5.0F, 0.0F));
      return fxe.a($$0, 32, 32);
   }

   @Override
   public fwy a() {
      return this.a;
   }

   public void a(cey $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fwy::c);
      if ($$0.u()) {
         this.a($$4);
      }

      this.a($$0.d, ffx.b, $$3, 1.0F);
      this.a($$0.e, ffx.a, $$3, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
