public class ftc extends fui<cez> {
   private final fwz a;
   private final fwz b;
   private final fwz f;
   private final fwz g;
   private final fwz h;
   private final fwz i;
   private final fwz j;
   private final fwz k;

   public ftc(fwz $$0) {
      super(gdv::d);
      this.a = $$0;
      this.f = $$0.b("body");
      this.b = $$0.b("head");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
      this.k = this.f.b("feet");
   }

   public static fxf b() {
      fxh $$0 = new fxh();
      fxi $$1 = $$0.a();
      fxi $$2 = $$1.a("body", fxe.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), fxb.a(0.0F, 17.0F, 0.0F));
      fxi $$3 = $$1.a("head", fxe.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), fxb.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", fxe.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), fxb.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", fxe.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), fxb.a(1.1F, -3.0F, 0.0F));
      fxi $$4 = $$2.a("right_wing", fxe.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fxb.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", fxe.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fxb.a(-2.0F, 0.0F, 0.0F));
      fxi $$5 = $$2.a("left_wing", fxe.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fxb.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", fxe.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fxb.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", fxe.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), fxb.a(0.0F, 5.0F, 0.0F));
      return fxf.a($$0, 32, 32);
   }

   @Override
   public fwz a() {
      return this.a;
   }

   public void a(cez $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fwz::c);
      if ($$0.u()) {
         this.a($$4);
      }

      this.a($$0.d, ffy.b, $$3, 1.0F);
      this.a($$0.e, ffy.a, $$3, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
