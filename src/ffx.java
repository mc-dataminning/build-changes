import javax.annotation.Nullable;

public class ffx {
   private static final int a = 786432;
   private final ffs b;
   @Nullable
   private static ffx c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new ffx();
      }
   }

   public static ffx b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public ffx(int $$0) {
      this.b = new ffs($$0);
   }

   public ffx() {
      this(786432);
   }

   public ffq a(fga.c $$0, fga $$1) {
      return new ffq(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
