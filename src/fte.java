public class fte extends fuk<cfb> {
   private final fxb a;
   private final fxb b;
   private final fxb f;
   private final fxb g;
   private final fxb h;
   private final fxb i;
   private final fxb j;
   private final fxb k;

   public fte(fxb $$0) {
      super(gdx::d);
      this.a = $$0;
      this.f = $$0.b("body");
      this.b = $$0.b("head");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
      this.k = this.f.b("feet");
   }

   public static fxh b() {
      fxj $$0 = new fxj();
      fxk $$1 = $$0.a();
      fxk $$2 = $$1.a("body", fxg.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), fxd.a(0.0F, 17.0F, 0.0F));
      fxk $$3 = $$1.a("head", fxg.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), fxd.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", fxg.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), fxd.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", fxg.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), fxd.a(1.1F, -3.0F, 0.0F));
      fxk $$4 = $$2.a("right_wing", fxg.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fxd.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", fxg.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fxd.a(-2.0F, 0.0F, 0.0F));
      fxk $$5 = $$2.a("left_wing", fxg.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fxd.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", fxg.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fxd.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", fxg.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), fxd.a(0.0F, 5.0F, 0.0F));
      return fxh.a($$0, 32, 32);
   }

   @Override
   public fxb a() {
      return this.a;
   }

   public void a(cfb $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fxb::c);
      if ($$0.u()) {
         this.a($$4);
      }

      this.a($$0.d, fga.b, $$3, 1.0F);
      this.a($$0.e, fga.a, $$3, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
