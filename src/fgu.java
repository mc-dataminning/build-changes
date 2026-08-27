public class fgu extends fhy<bwm> {
   private final fko a;
   private final fko b;
   private final fko f;
   private final fko g;
   private final fko h;
   private final fko i;
   private final fko j;
   private final fko k;

   public fgu(fko $$0) {
      super(frc::d);
      this.a = $$0.b("root");
      this.f = this.a.b("body");
      this.b = this.a.b("head");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
      this.k = this.f.b("feet");
   }

   public static fku b() {
      fkw $$0 = new fkw();
      fkx $$1 = $$0.a();
      fkx $$2 = $$1.a("root", fkt.c(), fkq.a(0.0F, 16.0F, 0.0F));
      fkx $$3 = $$2.a("body", fkt.c().a(0, 0).a(-1.5F, 2.0F, -1.0F, 3.0F, 5.0F, 2.0F), fkq.a);
      fkx $$4 = $$2.a("head", fkt.c().a(0, 7).a(-2.0F, -1.0F, -1.0F, 4.0F, 3.0F, 2.0F), fkq.a);
      $$4.a("right_ear", fkt.c().a(1, 15).a(-4.0F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), fkq.a);
      $$4.a("left_ear", fkt.c().a(8, 15).a(1.0F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), fkq.a);
      fkx $$5 = $$3.a("right_wing", fkt.c().a(12, 0).a(-2.0F, 0.0F, 0.0F, 2.0F, 7.0F, 0.0F), fkq.a(-1.5F, 0.0F, 0.0F));
      $$5.a("right_wing_tip", fkt.c().a(16, 0).a(-6.0F, 0.0F, 0.0F, 6.0F, 8.0F, 0.0F), fkq.a(-2.0F, 0.0F, 0.0F));
      fkx $$6 = $$3.a("left_wing", fkt.c().a(12, 7).a(0.0F, 0.0F, 0.0F, 2.0F, 7.0F, 0.0F), fkq.a(1.5F, 0.0F, 0.0F));
      $$6.a("left_wing_tip", fkt.c().a(16, 8).a(0.0F, 0.0F, 0.0F, 6.0F, 8.0F, 0.0F), fkq.a(2.0F, 0.0F, 0.0F));
      $$3.a("feet", fkt.c().a(16, 16).a(0.0F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), fkq.a(-1.5F, 7.0F, 0.0F));
      return fku.a($$0, 32, 32);
   }

   @Override
   public fko a() {
      return this.a;
   }

   public void a(bwm $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fko::c);
      if ($$0.w()) {
         this.a($$5, $$4);
      }

      this.a($$0.d, etx.b, $$3, 1.0F);
      this.a($$0.e, etx.a, $$3, 1.0F);
   }

   private void a(float $$0, float $$1) {
      this.b.e = $$0 * (float) (Math.PI / 180.0);
      this.b.f = (180.0F - $$1) * (float) (Math.PI / 180.0);
      this.b.g = (float) Math.PI;
   }
}
