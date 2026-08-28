import javax.annotation.Nullable;

public class fls {
   private static final int a = 786432;
   private final fln b;
   @Nullable
   private static fls c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new fls();
      }
   }

   public static fls b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public fls(int $$0) {
      this.b = new fln($$0);
   }

   public fls() {
      this(786432);
   }

   public flm a(flu.c $$0, flu $$1) {
      return new flm(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
