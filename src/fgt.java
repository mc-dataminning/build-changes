import javax.annotation.Nullable;

public class fgt {
   private static final int a = 786432;
   private final fgo b;
   @Nullable
   private static fgt c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new fgt();
      }
   }

   public static fgt b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public fgt(int $$0) {
      this.b = new fgo($$0);
   }

   public fgt() {
      this(786432);
   }

   public fgm a(fgw.c $$0, fgw $$1) {
      return new fgm(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
