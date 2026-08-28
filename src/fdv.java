import javax.annotation.Nullable;

public class fdv {
   private static final int a = 786432;
   private final fdq b;
   @Nullable
   private static fdv c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new fdv();
      }
   }

   public static fdv b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public fdv(int $$0) {
      this.b = new fdq($$0);
   }

   public fdv() {
      this(786432);
   }

   public fdo a(fdy.c $$0, fdy $$1) {
      return new fdo(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
