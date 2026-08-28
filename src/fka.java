import javax.annotation.Nullable;

public class fka {
   private static final int a = 786432;
   private final fjv b;
   @Nullable
   private static fka c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new fka();
      }
   }

   public static fka b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public fka(int $$0) {
      this.b = new fjv($$0);
   }

   public fka() {
      this(786432);
   }

   public fju a(fkd.c $$0, fkd $$1) {
      return new fju(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
