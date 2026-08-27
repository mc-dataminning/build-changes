public class fip<T extends bkv> extends fid<T> {
   private final fkt a;

   public fip(fkt $$0) {
      this.a = $$0;
   }

   public static fkz b() {
      flb $$0 = new flb();
      flc $$1 = $$0.a();
      int $$2 = 20;
      int $$3 = 8;
      int $$4 = 16;
      int $$5 = 4;
      $$1.a("bottom", fky.c().a(0, 10).a(-10.0F, -8.0F, -1.0F, 20.0F, 16.0F, 2.0F), fkv.a(0.0F, 4.0F, 0.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("front", fky.c().a(0, 0).a(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F), fkv.a(-9.0F, 4.0F, 0.0F, 0.0F, (float) (Math.PI * 3.0 / 2.0), 0.0F));
      $$1.a("back", fky.c().a(0, 0).a(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F), fkv.a(9.0F, 4.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      $$1.a("left", fky.c().a(0, 0).a(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F), fkv.a(0.0F, 4.0F, -7.0F, 0.0F, (float) Math.PI, 0.0F));
      $$1.a("right", fky.c().a(0, 0).a(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F), fkv.a(0.0F, 4.0F, 7.0F));
      return fkz.a($$0, 64, 32);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
   }

   @Override
   public fkt a() {
      return this.a;
   }
}
