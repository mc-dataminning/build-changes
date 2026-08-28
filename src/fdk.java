import javax.annotation.Nullable;

public class fdk {
   private static final int a = 786432;
   private final fdf b;
   @Nullable
   private static fdk c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new fdk();
      }
   }

   public static fdk b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public fdk(int $$0) {
      this.b = new fdf($$0);
   }

   public fdk() {
      this(786432);
   }

   public fdd a(fdn.c $$0, fdn $$1) {
      return new fdd(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
