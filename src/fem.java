import javax.annotation.Nullable;

public class fem {
   private static final int a = 786432;
   private final feh b;
   @Nullable
   private static fem c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new fem();
      }
   }

   public static fem b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public fem(int $$0) {
      this.b = new feh($$0);
   }

   public fem() {
      this(786432);
   }

   public fef a(fep.c $$0, fep $$1) {
      return new fef(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
