public class ftt extends fuz<cen> {
   private final fxq a;
   private final fxq b;
   private final fxq f;
   private final fxq g;
   private final fxq h;
   private final fxq i;
   private final fxq j;
   private final fxq k;

   public ftt(fxq $$0) {
      super(gen::d);
      this.a = $$0;
      this.f = $$0.b("body");
      this.b = $$0.b("head");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
      this.k = this.f.b("feet");
   }

   public static fxw b() {
      fxy $$0 = new fxy();
      fxz $$1 = $$0.a();
      fxz $$2 = $$1.a("body", fxv.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), fxs.a(0.0F, 17.0F, 0.0F));
      fxz $$3 = $$1.a("head", fxv.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), fxs.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", fxv.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), fxs.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", fxv.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), fxs.a(1.1F, -3.0F, 0.0F));
      fxz $$4 = $$2.a("right_wing", fxv.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fxs.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", fxv.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fxs.a(-2.0F, 0.0F, 0.0F));
      fxz $$5 = $$2.a("left_wing", fxv.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fxs.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", fxv.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fxs.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", fxv.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), fxs.a(0.0F, 5.0F, 0.0F));
      return fxw.a($$0, 32, 32);
   }

   @Override
   public fxq a() {
      return this.a;
   }

   public void a(cen $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fxq::c);
      if ($$0.t()) {
         this.a($$4);
      }

      this.a($$0.d, fgp.b, $$3, 1.0F);
      this.a($$0.e, fgp.a, $$3, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
