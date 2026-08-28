import javax.annotation.Nullable;

public class fis {
   private static final int a = 786432;
   private final fin b;
   @Nullable
   private static fis c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new fis();
      }
   }

   public static fis b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public fis(int $$0) {
      this.b = new fin($$0);
   }

   public fis() {
      this(786432);
   }

   public fil a(fiv.c $$0, fiv $$1) {
      return new fil(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
