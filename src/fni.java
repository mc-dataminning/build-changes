public class fni extends fon<caz> {
   private final frf a;
   private final frf b;
   private final frf f;
   private final frf g;
   private final frf h;
   private final frf i;
   private final frf j;
   private final frf k;

   public fni(frf $$0) {
      super(fya::d);
      this.a = $$0;
      this.f = $$0.b("body");
      this.b = $$0.b("head");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
      this.k = this.f.b("feet");
   }

   public static frl b() {
      frn $$0 = new frn();
      fro $$1 = $$0.a();
      fro $$2 = $$1.a("body", frk.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), frh.a(0.0F, 17.0F, 0.0F));
      fro $$3 = $$1.a("head", frk.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), frh.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", frk.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), frh.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", frk.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), frh.a(1.1F, -3.0F, 0.0F));
      fro $$4 = $$2.a("right_wing", frk.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), frh.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", frk.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), frh.a(-2.0F, 0.0F, 0.0F));
      fro $$5 = $$2.a("left_wing", frk.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), frh.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", frk.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), frh.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", frk.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), frh.a(0.0F, 5.0F, 0.0F));
      return frl.a($$0, 32, 32);
   }

   @Override
   public frf a() {
      return this.a;
   }

   public void a(caz $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(frf::c);
      if ($$0.s()) {
         this.a($$4);
      }

      this.a($$0.d, fad.b, $$3, 1.0F);
      this.a($$0.e, fad.a, $$3, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
