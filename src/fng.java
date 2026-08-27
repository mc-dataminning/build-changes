public class fng extends fol<cay> {
   private final frd a;
   private final frd b;
   private final frd f;
   private final frd g;
   private final frd h;
   private final frd i;
   private final frd j;
   private final frd k;

   public fng(frd $$0) {
      super(fxy::d);
      this.a = $$0;
      this.f = $$0.b("body");
      this.b = $$0.b("head");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
      this.k = this.f.b("feet");
   }

   public static frj b() {
      frl $$0 = new frl();
      frm $$1 = $$0.a();
      frm $$2 = $$1.a("body", fri.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), frf.a(0.0F, 17.0F, 0.0F));
      frm $$3 = $$1.a("head", fri.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), frf.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", fri.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), frf.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", fri.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), frf.a(1.1F, -3.0F, 0.0F));
      frm $$4 = $$2.a("right_wing", fri.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), frf.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", fri.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), frf.a(-2.0F, 0.0F, 0.0F));
      frm $$5 = $$2.a("left_wing", fri.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), frf.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", fri.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), frf.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", fri.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), frf.a(0.0F, 5.0F, 0.0F));
      return frj.a($$0, 32, 32);
   }

   @Override
   public frd a() {
      return this.a;
   }

   public void a(cay $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(frd::c);
      if ($$0.s()) {
         this.a($$4);
      }

      this.a($$0.d, fab.b, $$3, 1.0F);
      this.a($$0.e, fab.a, $$3, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
