public class ftf extends ful<cfc> {
   private final fxc a;
   private final fxc b;
   private final fxc f;
   private final fxc g;
   private final fxc h;
   private final fxc i;
   private final fxc j;
   private final fxc k;

   public ftf(fxc $$0) {
      super(gdy::d);
      this.a = $$0;
      this.f = $$0.b("body");
      this.b = $$0.b("head");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
      this.k = this.f.b("feet");
   }

   public static fxi b() {
      fxk $$0 = new fxk();
      fxl $$1 = $$0.a();
      fxl $$2 = $$1.a("body", fxh.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), fxe.a(0.0F, 17.0F, 0.0F));
      fxl $$3 = $$1.a("head", fxh.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), fxe.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", fxh.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), fxe.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", fxh.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), fxe.a(1.1F, -3.0F, 0.0F));
      fxl $$4 = $$2.a("right_wing", fxh.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fxe.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", fxh.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fxe.a(-2.0F, 0.0F, 0.0F));
      fxl $$5 = $$2.a("left_wing", fxh.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fxe.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", fxh.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fxe.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", fxh.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), fxe.a(0.0F, 5.0F, 0.0F));
      return fxi.a($$0, 32, 32);
   }

   @Override
   public fxc a() {
      return this.a;
   }

   public void a(cfc $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fxc::c);
      if ($$0.u()) {
         this.a($$4);
      }

      this.a($$0.d, fgb.b, $$3, 1.0F);
      this.a($$0.e, fgb.a, $$3, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
