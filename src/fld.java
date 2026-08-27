public class fld<T extends blu> extends fke<T> {
   private final fmv a;
   private final fmv b;
   private final fmv f;

   public fld(fmv $$0) {
      this.a = $$0;
      this.b = $$0.b("left_blue_fin");
      this.f = $$0.b("right_blue_fin");
   }

   public static fnb b() {
      fnd $$0 = new fnd();
      fne $$1 = $$0.a();
      int $$2 = 22;
      $$1.a("body", fna.c().a(12, 22).a(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F), fmx.a(0.0F, 22.0F, 0.0F));
      $$1.a("right_blue_fin", fna.c().a(24, 0).a(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F), fmx.a(-2.5F, 17.0F, -1.5F));
      $$1.a("left_blue_fin", fna.c().a(24, 3).a(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F), fmx.a(2.5F, 17.0F, -1.5F));
      $$1.a("top_front_fin", fna.c().a(15, 16).a(-2.5F, -1.0F, 0.0F, 5.0F, 1.0F, 1.0F), fmx.a(0.0F, 17.0F, -2.5F, (float) (Math.PI / 4), 0.0F, 0.0F));
      $$1.a("top_back_fin", fna.c().a(10, 16).a(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F), fmx.a(0.0F, 17.0F, 2.5F, (float) (-Math.PI / 4), 0.0F, 0.0F));
      $$1.a("right_front_fin", fna.c().a(8, 16).a(-1.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F), fmx.a(-2.5F, 22.0F, -2.5F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$1.a("right_back_fin", fna.c().a(8, 16).a(-1.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F), fmx.a(-2.5F, 22.0F, 2.5F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("left_back_fin", fna.c().a(4, 16).a(0.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F), fmx.a(2.5F, 22.0F, 2.5F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$1.a("left_front_fin", fna.c().a(0, 16).a(0.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F), fmx.a(2.5F, 22.0F, -2.5F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("bottom_back_fin", fna.c().a(8, 22).a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), fmx.a(0.5F, 22.0F, 2.5F, (float) (Math.PI / 4), 0.0F, 0.0F));
      $$1.a("bottom_front_fin", fna.c().a(17, 21).a(-2.5F, 0.0F, 0.0F, 5.0F, 1.0F, 1.0F), fmx.a(0.0F, 22.0F, -2.5F, (float) (-Math.PI / 4), 0.0F, 0.0F));
      return fnb.a($$0, 32, 32);
   }

   @Override
   public fmv a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.g = -0.2F + 0.4F * aun.a($$3 * 0.2F);
      this.b.g = 0.2F - 0.4F * aun.a($$3 * 0.2F);
   }
}
