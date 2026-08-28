import javax.annotation.Nullable;

public class ffv {
   private static final int a = 786432;
   private final ffq b;
   @Nullable
   private static ffv c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new ffv();
      }
   }

   public static ffv b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public ffv(int $$0) {
      this.b = new ffq($$0);
   }

   public ffv() {
      this(786432);
   }

   public ffo a(ffy.c $$0, ffy $$1) {
      return new ffo(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
