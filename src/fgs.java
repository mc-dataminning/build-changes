import javax.annotation.Nullable;

public class fgs {
   private static final int a = 786432;
   private final fgn b;
   @Nullable
   private static fgs c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new fgs();
      }
   }

   public static fgs b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public fgs(int $$0) {
      this.b = new fgn($$0);
   }

   public fgs() {
      this(786432);
   }

   public fgl a(fgv.c $$0, fgv $$1) {
      return new fgl(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
