import javax.annotation.Nullable;

public class fbi {
   private static final int a = 786432;
   private final fbd b;
   @Nullable
   private static fbi c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new fbi();
      }
   }

   public static fbi b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public fbi(int $$0) {
      this.b = new fbd($$0);
   }

   public fbi() {
      this(786432);
   }

   public fbb a(fbl.c $$0, fbl $$1) {
      return new fbb(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
