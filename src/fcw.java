import javax.annotation.Nullable;

public class fcw {
   private static final int a = 786432;
   private final fcr b;
   @Nullable
   private static fcw c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new fcw();
      }
   }

   public static fcw b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public fcw(int $$0) {
      this.b = new fcr($$0);
   }

   public fcw() {
      this(786432);
   }

   public fcp a(fcz.c $$0, fcz $$1) {
      return new fcp(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
