public class fak extends fbo<brg> {
   private final fee a;
   private final fee b;
   private final fee f;
   private final fee g;
   private final fee h;
   private final fee i;
   private final fee j;

   public fak(fee $$0) {
      this.a = $$0;
      this.b = $$0.b("head");
      this.f = $$0.b("body");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
   }

   public static fek b() {
      fem $$0 = new fem();
      fen $$1 = $$0.a();
      fen $$2 = $$1.a("head", fej.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), feg.a);
      $$2.a("right_ear", fej.c().a(24, 0).a(-4.0F, -6.0F, -2.0F, 3.0F, 4.0F, 1.0F), feg.a);
      $$2.a("left_ear", fej.c().a(24, 0).a().a(1.0F, -6.0F, -2.0F, 3.0F, 4.0F, 1.0F), feg.a);
      fen $$3 = $$1.a("body", fej.c().a(0, 16).a(-3.0F, 4.0F, -3.0F, 6.0F, 12.0F, 6.0F).a(0, 34).a(-5.0F, 16.0F, 0.0F, 10.0F, 6.0F, 1.0F), feg.a);
      fen $$4 = $$3.a("right_wing", fej.c().a(42, 0).a(-12.0F, 1.0F, 1.5F, 10.0F, 16.0F, 1.0F), feg.a);
      $$4.a("right_wing_tip", fej.c().a(24, 16).a(-8.0F, 1.0F, 0.0F, 8.0F, 12.0F, 1.0F), feg.a(-12.0F, 1.0F, 1.5F));
      fen $$5 = $$3.a("left_wing", fej.c().a(42, 0).a().a(2.0F, 1.0F, 1.5F, 10.0F, 16.0F, 1.0F), feg.a);
      $$5.a("left_wing_tip", fej.c().a(24, 16).a().a(0.0F, 1.0F, 0.0F, 8.0F, 12.0F, 1.0F), feg.a(12.0F, 1.0F, 1.5F));
      return fek.a($$0, 64, 64);
   }

   @Override
   public fee a() {
      return this.a;
   }

   public void a(brg $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      if ($$0.r()) {
         this.b.e = $$5 * (float) (Math.PI / 180.0);
         this.b.f = (float) Math.PI - $$4 * (float) (Math.PI / 180.0);
         this.b.g = (float) Math.PI;
         this.b.a(0.0F, -2.0F, 0.0F);
         this.g.a(-3.0F, 0.0F, 3.0F);
         this.h.a(3.0F, 0.0F, 3.0F);
         this.f.e = (float) Math.PI;
         this.g.e = (float) (-Math.PI / 20);
         this.g.f = (float) (-Math.PI * 2.0 / 5.0);
         this.i.f = -1.7278761F;
         this.h.e = this.g.e;
         this.h.f = -this.g.f;
         this.j.f = -this.i.f;
      } else {
         this.b.e = $$5 * (float) (Math.PI / 180.0);
         this.b.f = $$4 * (float) (Math.PI / 180.0);
         this.b.g = 0.0F;
         this.b.a(0.0F, 0.0F, 0.0F);
         this.g.a(0.0F, 0.0F, 0.0F);
         this.h.a(0.0F, 0.0F, 0.0F);
         this.f.e = (float) (Math.PI / 4) + apa.b($$3 * 0.1F) * 0.15F;
         this.f.f = 0.0F;
         this.g.f = apa.b($$3 * 74.48451F * (float) (Math.PI / 180.0)) * (float) Math.PI * 0.25F;
         this.h.f = -this.g.f;
         this.i.f = this.g.f * 0.5F;
         this.j.f = -this.g.f * 0.5F;
      }
   }
}
