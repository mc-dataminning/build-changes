public class fmv<T extends bno> extends fmk<T> {
   private static final String a = "main";
   private final fpc b;

   public fmv(fpc $$0) {
      this.b = $$0;
   }

   public static fpi b() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      int $$2 = 2;
      $$1.a(
         "main",
         fph.c()
            .a(0, 0)
            .a(-4.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F)
            .a(0.0F, -4.0F, 0.0F, 2.0F, 2.0F, 2.0F)
            .a(0.0F, 0.0F, -4.0F, 2.0F, 2.0F, 2.0F)
            .a(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F)
            .a(2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F)
            .a(0.0F, 2.0F, 0.0F, 2.0F, 2.0F, 2.0F)
            .a(0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 2.0F),
         fpe.a
      );
      return fpi.a($$0, 64, 32);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
   }

   @Override
   public fpc a() {
      return this.b;
   }
}
