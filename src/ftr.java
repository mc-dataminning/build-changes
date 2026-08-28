public class ftr extends fux<cem> {
   private final fxo a;
   private final fxo b;
   private final fxo f;
   private final fxo g;
   private final fxo h;
   private final fxo i;
   private final fxo j;
   private final fxo k;

   public ftr(fxo $$0) {
      super(gel::d);
      this.a = $$0;
      this.f = $$0.b("body");
      this.b = $$0.b("head");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
      this.k = this.f.b("feet");
   }

   public static fxu b() {
      fxw $$0 = new fxw();
      fxx $$1 = $$0.a();
      fxx $$2 = $$1.a("body", fxt.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), fxq.a(0.0F, 17.0F, 0.0F));
      fxx $$3 = $$1.a("head", fxt.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), fxq.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", fxt.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), fxq.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", fxt.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), fxq.a(1.1F, -3.0F, 0.0F));
      fxx $$4 = $$2.a("right_wing", fxt.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fxq.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", fxt.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fxq.a(-2.0F, 0.0F, 0.0F));
      fxx $$5 = $$2.a("left_wing", fxt.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fxq.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", fxt.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fxq.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", fxt.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), fxq.a(0.0F, 5.0F, 0.0F));
      return fxu.a($$0, 32, 32);
   }

   @Override
   public fxo a() {
      return this.a;
   }

   public void a(cem $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fxo::c);
      if ($$0.u()) {
         this.a($$4);
      }

      this.a($$0.d, fgn.b, $$3, 1.0F);
      this.a($$0.e, fgn.a, $$3, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
