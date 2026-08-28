import javax.annotation.Nullable;

public class fgu {
   private static final int a = 786432;
   private final fgp b;
   @Nullable
   private static fgu c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new fgu();
      }
   }

   public static fgu b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public fgu(int $$0) {
      this.b = new fgp($$0);
   }

   public fgu() {
      this(786432);
   }

   public fgn a(fgx.c $$0, fgx $$1) {
      return new fgn(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
