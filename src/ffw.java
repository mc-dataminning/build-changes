import javax.annotation.Nullable;

public class ffw {
   private static final int a = 786432;
   private final ffr b;
   @Nullable
   private static ffw c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new ffw();
      }
   }

   public static ffw b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public ffw(int $$0) {
      this.b = new ffr($$0);
   }

   public ffw() {
      this(786432);
   }

   public ffp a(ffz.c $$0, ffz $$1) {
      return new ffp(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
