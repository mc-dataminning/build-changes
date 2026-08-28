public class ftd extends fuj<cfa> {
   private final fxa a;
   private final fxa b;
   private final fxa f;
   private final fxa g;
   private final fxa h;
   private final fxa i;
   private final fxa j;
   private final fxa k;

   public ftd(fxa $$0) {
      super(gdw::d);
      this.a = $$0;
      this.f = $$0.b("body");
      this.b = $$0.b("head");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
      this.k = this.f.b("feet");
   }

   public static fxg b() {
      fxi $$0 = new fxi();
      fxj $$1 = $$0.a();
      fxj $$2 = $$1.a("body", fxf.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), fxc.a(0.0F, 17.0F, 0.0F));
      fxj $$3 = $$1.a("head", fxf.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), fxc.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", fxf.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), fxc.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", fxf.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), fxc.a(1.1F, -3.0F, 0.0F));
      fxj $$4 = $$2.a("right_wing", fxf.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fxc.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", fxf.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fxc.a(-2.0F, 0.0F, 0.0F));
      fxj $$5 = $$2.a("left_wing", fxf.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fxc.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", fxf.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fxc.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", fxf.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), fxc.a(0.0F, 5.0F, 0.0F));
      return fxg.a($$0, 32, 32);
   }

   @Override
   public fxa a() {
      return this.a;
   }

   public void a(cfa $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fxa::c);
      if ($$0.u()) {
         this.a($$4);
      }

      this.a($$0.d, ffz.b, $$3, 1.0F);
      this.a($$0.e, ffz.a, $$3, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
