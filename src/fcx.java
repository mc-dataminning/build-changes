public class fcx<T extends bfj> extends fbo<T> {
   private static final String a = "main";
   private final fee b;
   private final fee f;

   public fcx(fee $$0) {
      this.b = $$0;
      this.f = $$0.b("main");
   }

   public static fek b() {
      fem $$0 = new fem();
      fen $$1 = $$0.a();
      $$1.a(
         "main",
         fej.c()
            .a(0, 0)
            .a(-4.0F, -4.0F, -1.0F, 8.0F, 8.0F, 2.0F)
            .a(0, 10)
            .a(-1.0F, -4.0F, -4.0F, 2.0F, 8.0F, 8.0F)
            .a(20, 0)
            .a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F),
         feg.a
      );
      return fek.a($$0, 64, 32);
   }

   @Override
   public fee a() {
      return this.b;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = $$4 * (float) (Math.PI / 180.0);
      this.f.e = $$5 * (float) (Math.PI / 180.0);
   }
}
