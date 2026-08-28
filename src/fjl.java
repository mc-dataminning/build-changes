import javax.annotation.Nullable;

public class fjl {
   private static final int a = 786432;
   private final fjg b;
   @Nullable
   private static fjl c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new fjl();
      }
   }

   public static fjl b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public fjl(int $$0) {
      this.b = new fjg($$0);
   }

   public fjl() {
      this(786432);
   }

   public fjf a(fjo.c $$0, fjo $$1) {
      return new fjf(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
