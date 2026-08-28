public class fsy extends fue<cev> {
   private final fwv a;
   private final fwv b;
   private final fwv f;
   private final fwv g;
   private final fwv h;
   private final fwv i;
   private final fwv j;
   private final fwv k;

   public fsy(fwv $$0) {
      super(gdr::d);
      this.a = $$0;
      this.f = $$0.b("body");
      this.b = $$0.b("head");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
      this.k = this.f.b("feet");
   }

   public static fxb b() {
      fxd $$0 = new fxd();
      fxe $$1 = $$0.a();
      fxe $$2 = $$1.a("body", fxa.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), fwx.a(0.0F, 17.0F, 0.0F));
      fxe $$3 = $$1.a("head", fxa.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), fwx.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", fxa.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), fwx.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", fxa.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), fwx.a(1.1F, -3.0F, 0.0F));
      fxe $$4 = $$2.a("right_wing", fxa.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fwx.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", fxa.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fwx.a(-2.0F, 0.0F, 0.0F));
      fxe $$5 = $$2.a("left_wing", fxa.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fwx.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", fxa.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fwx.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", fxa.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), fwx.a(0.0F, 5.0F, 0.0F));
      return fxb.a($$0, 32, 32);
   }

   @Override
   public fwv a() {
      return this.a;
   }

   public void a(cev $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fwv::c);
      if ($$0.u()) {
         this.a($$4);
      }

      this.a($$0.d, ffu.b, $$3, 1.0F);
      this.a($$0.e, ffu.a, $$3, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
