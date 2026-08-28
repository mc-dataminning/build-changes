import javax.annotation.Nullable;

public class fbe {
   private static final int a = 786432;
   private final faz b;
   @Nullable
   private static fbe c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new fbe();
      }
   }

   public static fbe b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public fbe(int $$0) {
      this.b = new faz($$0);
   }

   public fbe() {
      this(786432);
   }

   public fax a(fbh.c $$0, fbh $$1) {
      return new fax(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
