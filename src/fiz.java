public class fiz extends fke<bxs> {
   private final fmv a;
   private final fmv b;
   private final fmv f;
   private final fmv g;
   private final fmv h;
   private final fmv i;
   private final fmv j;
   private final fmv k;

   public fiz(fmv $$0) {
      super(ftn::d);
      this.a = $$0;
      this.f = $$0.b("body");
      this.b = $$0.b("head");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
      this.k = this.f.b("feet");
   }

   public static fnb b() {
      fnd $$0 = new fnd();
      fne $$1 = $$0.a();
      fne $$2 = $$1.a("body", fna.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), fmx.a(0.0F, 17.0F, 0.0F));
      fne $$3 = $$1.a("head", fna.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), fmx.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", fna.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), fmx.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", fna.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), fmx.a(1.1F, -3.0F, 0.0F));
      fne $$4 = $$2.a("right_wing", fna.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fmx.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", fna.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fmx.a(-2.0F, 0.0F, 0.0F));
      fne $$5 = $$2.a("left_wing", fna.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fmx.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", fna.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fmx.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", fna.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), fmx.a(0.0F, 5.0F, 0.0F));
      return fnb.a($$0, 32, 32);
   }

   @Override
   public fmv a() {
      return this.a;
   }

   public void a(bxs $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fmv::c);
      if ($$0.w()) {
         this.a($$4);
      }

      this.a($$0.d, ewa.b, $$3, 1.0F);
      this.a($$0.e, ewa.a, $$3, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
