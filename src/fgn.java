import javax.annotation.Nullable;

public class fgn {
   private static final int a = 786432;
   private final fgi b;
   @Nullable
   private static fgn c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new fgn();
      }
   }

   public static fgn b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public fgn(int $$0) {
      this.b = new fgi($$0);
   }

   public fgn() {
      this(786432);
   }

   public fgg a(fgq.c $$0, fgq $$1) {
      return new fgg(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
