import javax.annotation.Nullable;

public class fet {
   private static final int a = 786432;
   private final feo b;
   @Nullable
   private static fet c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new fet();
      }
   }

   public static fet b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public fet(int $$0) {
      this.b = new feo($$0);
   }

   public fet() {
      this(786432);
   }

   public fem a(few.c $$0, few $$1) {
      return new fem(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
