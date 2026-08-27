public class fjl<T extends blu> extends fke<T> {
   private final fmv a;
   private final fmv b;

   public fjl(fmv $$0) {
      this.a = $$0;
      this.b = $$0.b("tail_fin");
   }

   public static fnb b() {
      fnd $$0 = new fnd();
      fne $$1 = $$0.a();
      int $$2 = 22;
      $$1.a("body", fna.c().a(0, 0).a(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F), fmx.a(0.0F, 22.0F, 0.0F));
      $$1.a("head", fna.c().a(11, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), fmx.a(0.0F, 22.0F, 0.0F));
      $$1.a("nose", fna.c().a(0, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F), fmx.a(0.0F, 22.0F, -3.0F));
      $$1.a("right_fin", fna.c().a(22, 1).a(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), fmx.a(-1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", fna.c().a(22, 4).a(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), fmx.a(1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      $$1.a("tail_fin", fna.c().a(22, 3).a(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F), fmx.a(0.0F, 22.0F, 7.0F));
      $$1.a("top_fin", fna.c().a(20, -6).a(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F), fmx.a(0.0F, 20.0F, 0.0F));
      return fnb.a($$0, 32, 32);
   }

   @Override
   public fmv a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 1.0F;
      if (!$$0.aZ()) {
         $$6 = 1.5F;
      }

      this.b.f = -$$6 * 0.45F * aun.a(0.6F * $$3);
   }
}
