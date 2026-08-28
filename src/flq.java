import javax.annotation.Nullable;

public class flq {
   private static final int a = 786432;
   private final fll b;
   @Nullable
   private static flq c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new flq();
      }
   }

   public static flq b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public flq(int $$0) {
      this.b = new fll($$0);
   }

   public flq() {
      this(786432);
   }

   public flk a(fls.c $$0, fls $$1) {
      return new flk(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
