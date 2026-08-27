public class fpp extends fqv<cby> {
   private final ftm a;
   private final ftm b;
   private final ftm f;
   private final ftm g;
   private final ftm h;
   private final ftm i;
   private final ftm j;
   private final ftm k;

   public fpp(ftm $$0) {
      super(gah::d);
      this.a = $$0;
      this.f = $$0.b("body");
      this.b = $$0.b("head");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
      this.k = this.f.b("feet");
   }

   public static fts b() {
      ftu $$0 = new ftu();
      ftv $$1 = $$0.a();
      ftv $$2 = $$1.a("body", ftr.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), fto.a(0.0F, 17.0F, 0.0F));
      ftv $$3 = $$1.a("head", ftr.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), fto.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", ftr.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), fto.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", ftr.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), fto.a(1.1F, -3.0F, 0.0F));
      ftv $$4 = $$2.a("right_wing", ftr.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fto.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", ftr.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fto.a(-2.0F, 0.0F, 0.0F));
      ftv $$5 = $$2.a("left_wing", ftr.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fto.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", ftr.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fto.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", ftr.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), fto.a(0.0F, 5.0F, 0.0F));
      return fts.a($$0, 32, 32);
   }

   @Override
   public ftm a() {
      return this.a;
   }

   public void a(cby $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(ftm::c);
      if ($$0.u()) {
         this.a($$4);
      }

      this.a($$0.d, fck.b, $$3, 1.0F);
      this.a($$0.e, fck.a, $$3, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
