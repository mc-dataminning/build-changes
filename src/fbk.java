import javax.annotation.Nullable;

public class fbk {
   private static final int a = 786432;
   private final fbf b;
   @Nullable
   private static fbk c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new fbk();
      }
   }

   public static fbk b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public fbk(int $$0) {
      this.b = new fbf($$0);
   }

   public fbk() {
      this(786432);
   }

   public fbd a(fbn.c $$0, fbn $$1) {
      return new fbd(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
