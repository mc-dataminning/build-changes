public class fja extends fkf<bxs> {
   private final fmw a;
   private final fmw b;
   private final fmw f;
   private final fmw g;
   private final fmw h;
   private final fmw i;
   private final fmw j;
   private final fmw k;

   public fja(fmw $$0) {
      super(fto::d);
      this.a = $$0;
      this.f = $$0.b("body");
      this.b = $$0.b("head");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
      this.k = this.f.b("feet");
   }

   public static fnc b() {
      fne $$0 = new fne();
      fnf $$1 = $$0.a();
      fnf $$2 = $$1.a("body", fnb.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), fmy.a(0.0F, 17.0F, 0.0F));
      fnf $$3 = $$1.a("head", fnb.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), fmy.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", fnb.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), fmy.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", fnb.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), fmy.a(1.1F, -3.0F, 0.0F));
      fnf $$4 = $$2.a("right_wing", fnb.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fmy.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", fnb.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fmy.a(-2.0F, 0.0F, 0.0F));
      fnf $$5 = $$2.a("left_wing", fnb.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fmy.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", fnb.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fmy.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", fnb.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), fmy.a(0.0F, 5.0F, 0.0F));
      return fnc.a($$0, 32, 32);
   }

   @Override
   public fmw a() {
      return this.a;
   }

   public void a(bxs $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fmw::c);
      if ($$0.w()) {
         this.a($$4);
      }

      this.a($$0.d, ewb.b, $$3, 1.0F);
      this.a($$0.e, ewb.a, $$3, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
