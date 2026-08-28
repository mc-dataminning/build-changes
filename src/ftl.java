public class ftl extends fur<cej> {
   private final fxi a;
   private final fxi b;
   private final fxi f;
   private final fxi g;
   private final fxi h;
   private final fxi i;
   private final fxi j;
   private final fxi k;

   public ftl(fxi $$0) {
      super(gef::d);
      this.a = $$0;
      this.f = $$0.b("body");
      this.b = $$0.b("head");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
      this.k = this.f.b("feet");
   }

   public static fxo b() {
      fxq $$0 = new fxq();
      fxr $$1 = $$0.a();
      fxr $$2 = $$1.a("body", fxn.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), fxk.a(0.0F, 17.0F, 0.0F));
      fxr $$3 = $$1.a("head", fxn.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), fxk.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", fxn.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), fxk.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", fxn.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), fxk.a(1.1F, -3.0F, 0.0F));
      fxr $$4 = $$2.a("right_wing", fxn.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fxk.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", fxn.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fxk.a(-2.0F, 0.0F, 0.0F));
      fxr $$5 = $$2.a("left_wing", fxn.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fxk.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", fxn.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fxk.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", fxn.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), fxk.a(0.0F, 5.0F, 0.0F));
      return fxo.a($$0, 32, 32);
   }

   @Override
   public fxi a() {
      return this.a;
   }

   public void a(cej $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fxi::c);
      if ($$0.u()) {
         this.a($$4);
      }

      this.a($$0.d, fgh.b, $$3, 1.0F);
      this.a($$0.e, fgh.a, $$3, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
