import javax.annotation.Nullable;

public class fed {
   private static final int a = 786432;
   private final fdy b;
   @Nullable
   private static fed c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new fed();
      }
   }

   public static fed b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public fed(int $$0) {
      this.b = new fdy($$0);
   }

   public fed() {
      this(786432);
   }

   public fdw a(feg.c $$0, feg $$1) {
      return new fdw(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
