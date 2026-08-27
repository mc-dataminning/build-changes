public class fpy extends fre<ccd> {
   private final ftv a;
   private final ftv b;
   private final ftv f;
   private final ftv g;
   private final ftv h;
   private final ftv i;
   private final ftv j;
   private final ftv k;

   public fpy(ftv $$0) {
      super(gaq::d);
      this.a = $$0;
      this.f = $$0.b("body");
      this.b = $$0.b("head");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
      this.k = this.f.b("feet");
   }

   public static fub b() {
      fud $$0 = new fud();
      fue $$1 = $$0.a();
      fue $$2 = $$1.a("body", fua.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), ftx.a(0.0F, 17.0F, 0.0F));
      fue $$3 = $$1.a("head", fua.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), ftx.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", fua.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), ftx.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", fua.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), ftx.a(1.1F, -3.0F, 0.0F));
      fue $$4 = $$2.a("right_wing", fua.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), ftx.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", fua.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), ftx.a(-2.0F, 0.0F, 0.0F));
      fue $$5 = $$2.a("left_wing", fua.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), ftx.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", fua.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), ftx.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", fua.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), ftx.a(0.0F, 5.0F, 0.0F));
      return fub.a($$0, 32, 32);
   }

   @Override
   public ftv a() {
      return this.a;
   }

   public void a(ccd $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(ftv::c);
      if ($$0.u()) {
         this.a($$4);
      }

      this.a($$0.d, fct.b, $$3, 1.0F);
      this.a($$0.e, fct.a, $$3, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
