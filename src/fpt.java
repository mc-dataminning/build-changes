public class fpt extends fnn<cjg> {
   private static final int a = 16;
   private final fqf b;
   private final fqf f;
   private final fqf g;

   public fpt(fqf $$0) {
      super(fwy::i);
      this.b = $$0.b("bone");
      this.g = this.b.b("wind");
      this.f = this.b.b("wind_charge");
   }

   public static fql b() {
      fqn $$0 = new fqn();
      fqo $$1 = $$0.a();
      fqo $$2 = $$1.a("bone", fqk.c(), fqh.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         fqk.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new fqj(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new fqj(0.0F)),
         fqh.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", fqk.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new fqj(0.0F)), fqh.a(0.0F, 0.0F, 0.0F));
      return fql.a($$0, 64, 32);
   }

   public void a(cjg $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = -$$3 * 16.0F * (float) (Math.PI / 180.0);
      this.g.f = $$3 * 16.0F * (float) (Math.PI / 180.0);
   }

   @Override
   public fqf a() {
      return this.b;
   }
}
