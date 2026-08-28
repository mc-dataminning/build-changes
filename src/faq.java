import javax.annotation.Nullable;

public class faq {
   private static final int a = 786432;
   private final faj b;
   @Nullable
   private static faq c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new faq();
      }
   }

   public static faq b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public faq(int $$0) {
      this.b = new faj($$0);
   }

   public faq() {
      this(786432);
   }

   public void c() {
      fak.a(this.b.d());
   }

   public faj d() {
      return this.b;
   }
}
