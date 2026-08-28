import javax.annotation.Nullable;

public class fhq {
   private static final int a = 786432;
   private final fhl b;
   @Nullable
   private static fhq c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new fhq();
      }
   }

   public static fhq b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public fhq(int $$0) {
      this.b = new fhl($$0);
   }

   public fhq() {
      this(786432);
   }

   public fhj a(fht.c $$0, fht $$1) {
      return new fhj(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
