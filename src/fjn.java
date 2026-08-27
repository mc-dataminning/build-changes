public class fjn extends fks<bxx> {
   private final fnj a;
   private final fnj b;
   private final fnj f;
   private final fnj g;
   private final fnj h;
   private final fnj i;
   private final fnj j;
   private final fnj k;

   public fjn(fnj $$0) {
      super(fub::d);
      this.a = $$0;
      this.f = $$0.b("body");
      this.b = $$0.b("head");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
      this.k = this.f.b("feet");
   }

   public static fnp b() {
      fnr $$0 = new fnr();
      fns $$1 = $$0.a();
      fns $$2 = $$1.a("body", fno.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), fnl.a(0.0F, 17.0F, 0.0F));
      fns $$3 = $$1.a("head", fno.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), fnl.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", fno.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), fnl.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", fno.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), fnl.a(1.1F, -3.0F, 0.0F));
      fns $$4 = $$2.a("right_wing", fno.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fnl.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", fno.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fnl.a(-2.0F, 0.0F, 0.0F));
      fns $$5 = $$2.a("left_wing", fno.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fnl.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", fno.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fnl.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", fno.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), fnl.a(0.0F, 5.0F, 0.0F));
      return fnp.a($$0, 32, 32);
   }

   @Override
   public fnj a() {
      return this.a;
   }

   public void a(bxx $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fnj::c);
      if ($$0.w()) {
         this.a($$4);
      }

      this.a($$0.d, ewm.b, $$3, 1.0F);
      this.a($$0.e, ewm.a, $$3, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
