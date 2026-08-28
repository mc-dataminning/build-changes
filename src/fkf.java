import javax.annotation.Nullable;

public class fkf {
   private static final int a = 786432;
   private final fka b;
   @Nullable
   private static fkf c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new fkf();
      }
   }

   public static fkf b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public fkf(int $$0) {
      this.b = new fka($$0);
   }

   public fkf() {
      this(786432);
   }

   public fjz a(fki.c $$0, fki $$1) {
      return new fjz(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
