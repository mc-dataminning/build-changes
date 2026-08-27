public class fka<T extends bkv> extends fhm<T> {
   private final fkt a;
   private final fkt b;

   public fka(fkt $$0) {
      this.a = $$0;
      this.b = $$0.b("tail");
   }

   public static fkz a(fkx $$0) {
      flb $$1 = new flb();
      flc $$2 = $$1.a();
      int $$3 = 22;
      $$2.a("body", fky.c().a(0, 0).a(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, $$0), fkv.a(0.0F, 22.0F, 0.0F));
      $$2.a("tail", fky.c().a(22, -6).a(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), fkv.a(0.0F, 22.0F, 3.0F));
      $$2.a("right_fin", fky.c().a(2, 16).a(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), fkv.a(-1.0F, 22.5F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("left_fin", fky.c().a(2, 12).a(0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), fkv.a(1.0F, 22.5F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("top_fin", fky.c().a(10, -5).a(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), fkv.a(0.0F, 20.5F, -3.0F));
      return fkz.a($$1, 32, 32);
   }

   @Override
   public fkt a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 1.0F;
      if (!$$0.aZ()) {
         $$6 = 1.5F;
      }

      this.b.f = -$$6 * 0.45F * atq.a(0.6F * $$3);
   }
}
