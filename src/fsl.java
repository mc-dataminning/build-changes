public class fsl<T extends bql> extends fsa<T> {
   private static final String a = "main";
   private final fur b;

   public fsl(fur $$0) {
      this.b = $$0;
   }

   public static fux b() {
      fuz $$0 = new fuz();
      fva $$1 = $$0.a();
      int $$2 = 2;
      $$1.a(
         "main",
         fuw.c()
            .a(0, 0)
            .a(-4.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F)
            .a(0.0F, -4.0F, 0.0F, 2.0F, 2.0F, 2.0F)
            .a(0.0F, 0.0F, -4.0F, 2.0F, 2.0F, 2.0F)
            .a(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F)
            .a(2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F)
            .a(0.0F, 2.0F, 0.0F, 2.0F, 2.0F, 2.0F)
            .a(0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 2.0F),
         fut.a
      );
      return fux.a($$0, 64, 32);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
   }

   @Override
   public fur a() {
      return this.b;
   }
}
