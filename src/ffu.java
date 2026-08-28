import javax.annotation.Nullable;

public class ffu {
   private static final int a = 786432;
   private final ffp b;
   @Nullable
   private static ffu c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new ffu();
      }
   }

   public static ffu b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public ffu(int $$0) {
      this.b = new ffp($$0);
   }

   public ffu() {
      this(786432);
   }

   public ffn a(ffx.c $$0, ffx $$1) {
      return new ffn(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
