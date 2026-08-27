public class fgz extends fid<bwr> {
   private final fkt a;
   private final fkt b;
   private final fkt f;
   private final fkt g;
   private final fkt h;
   private final fkt i;
   private final fkt j;
   private final fkt k;

   public fgz(fkt $$0) {
      super(frh::d);
      this.a = $$0;
      this.f = $$0.b("body");
      this.b = $$0.b("head");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
      this.k = this.f.b("feet");
   }

   public static fkz b() {
      flb $$0 = new flb();
      flc $$1 = $$0.a();
      flc $$2 = $$1.a("body", fky.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), fkv.a(0.0F, 17.0F, 0.0F));
      flc $$3 = $$1.a("head", fky.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), fkv.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", fky.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), fkv.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", fky.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), fkv.a(1.1F, -3.0F, 0.0F));
      flc $$4 = $$2.a("right_wing", fky.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fkv.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", fky.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fkv.a(-2.0F, 0.0F, 0.0F));
      flc $$5 = $$2.a("left_wing", fky.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fkv.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", fky.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fkv.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", fky.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), fkv.a(0.0F, 5.0F, 0.0F));
      return fkz.a($$0, 32, 32);
   }

   @Override
   public fkt a() {
      return this.a;
   }

   public void a(bwr $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fkt::c);
      if ($$0.w()) {
         this.a($$4);
      }

      this.a($$0.d, euc.b, $$3, 1.0F);
      this.a($$0.e, euc.a, $$3, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
