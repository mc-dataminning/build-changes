public class fjm<T extends bkv> extends fid<T> {
   private static final String a = "main";
   private final fkt b;
   private final fkt f;

   public fjm(fkt $$0) {
      this.b = $$0;
      this.f = $$0.b("main");
   }

   public static fkz b() {
      flb $$0 = new flb();
      flc $$1 = $$0.a();
      $$1.a(
         "main",
         fky.c()
            .a(0, 0)
            .a(-4.0F, -4.0F, -1.0F, 8.0F, 8.0F, 2.0F)
            .a(0, 10)
            .a(-1.0F, -4.0F, -4.0F, 2.0F, 8.0F, 8.0F)
            .a(20, 0)
            .a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F),
         fkv.a
      );
      return fkz.a($$0, 64, 32);
   }

   @Override
   public fkt a() {
      return this.b;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = $$4 * (float) (Math.PI / 180.0);
      this.f.e = $$5 * (float) (Math.PI / 180.0);
   }
}
