public class fmi extends fnn<cah> {
   private final fqf a;
   private final fqf b;
   private final fqf f;
   private final fqf g;
   private final fqf h;
   private final fqf i;
   private final fqf j;
   private final fqf k;

   public fmi(fqf $$0) {
      super(fwy::d);
      this.a = $$0;
      this.f = $$0.b("body");
      this.b = $$0.b("head");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
      this.k = this.f.b("feet");
   }

   public static fql b() {
      fqn $$0 = new fqn();
      fqo $$1 = $$0.a();
      fqo $$2 = $$1.a("body", fqk.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), fqh.a(0.0F, 17.0F, 0.0F));
      fqo $$3 = $$1.a("head", fqk.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), fqh.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", fqk.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), fqh.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", fqk.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), fqh.a(1.1F, -3.0F, 0.0F));
      fqo $$4 = $$2.a("right_wing", fqk.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fqh.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", fqk.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fqh.a(-2.0F, 0.0F, 0.0F));
      fqo $$5 = $$2.a("left_wing", fqk.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fqh.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", fqk.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fqh.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", fqk.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), fqh.a(0.0F, 5.0F, 0.0F));
      return fql.a($$0, 32, 32);
   }

   @Override
   public fqf a() {
      return this.a;
   }

   public void a(cah $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fqf::c);
      if ($$0.w()) {
         this.a($$4);
      }

      this.a($$0.d, ezf.b, $$3, 1.0F);
      this.a($$0.e, ezf.a, $$3, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
