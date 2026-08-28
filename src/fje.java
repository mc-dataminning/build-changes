import javax.annotation.Nullable;

public class fje {
   private static final int a = 786432;
   private final fiz b;
   @Nullable
   private static fje c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new fje();
      }
   }

   public static fje b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public fje(int $$0) {
      this.b = new fiz($$0);
   }

   public fje() {
      this(786432);
   }

   public fix a(fjh.c $$0, fjh $$1) {
      return new fix(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
