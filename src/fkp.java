public class fkp<T extends blu> extends fke<T> {
   private static final String a = "main";
   private final fmv b;

   public fkp(fmv $$0) {
      this.b = $$0;
   }

   public static fnb b() {
      fnd $$0 = new fnd();
      fne $$1 = $$0.a();
      int $$2 = 2;
      $$1.a(
         "main",
         fna.c()
            .a(0, 0)
            .a(-4.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F)
            .a(0.0F, -4.0F, 0.0F, 2.0F, 2.0F, 2.0F)
            .a(0.0F, 0.0F, -4.0F, 2.0F, 2.0F, 2.0F)
            .a(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F)
            .a(2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F)
            .a(0.0F, 2.0F, 0.0F, 2.0F, 2.0F, 2.0F)
            .a(0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 2.0F),
         fmx.a
      );
      return fnb.a($$0, 64, 32);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
   }

   @Override
   public fmv a() {
      return this.b;
   }
}
