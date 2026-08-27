public class fkq<T extends blf> extends fjh<T> {
   private static final String a = "main";
   private final fly b;
   private final fly f;

   public fkq(fly $$0) {
      this.b = $$0;
      this.f = $$0.b("main");
   }

   public static fme b() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      $$1.a(
         "main",
         fmd.c()
            .a(0, 0)
            .a(-4.0F, -4.0F, -1.0F, 8.0F, 8.0F, 2.0F)
            .a(0, 10)
            .a(-1.0F, -4.0F, -4.0F, 2.0F, 8.0F, 8.0F)
            .a(20, 0)
            .a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F),
         fma.a
      );
      return fme.a($$0, 64, 32);
   }

   @Override
   public fly a() {
      return this.b;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = $$4 * (float) (Math.PI / 180.0);
      this.f.e = $$5 * (float) (Math.PI / 180.0);
   }
}
