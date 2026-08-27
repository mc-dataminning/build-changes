import java.util.function.IntFunction;

public enum cbz {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<cbz> f = auz.a(cbz::a, values(), auz.a.b);
   private final int g;

   private cbz(int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static cbz a(int $$0) {
      return f.apply($$0);
   }
}
