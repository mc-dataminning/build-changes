import java.util.function.IntFunction;

public enum caa {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<caa> f = atf.a(caa::a, values(), atf.a.b);
   private final int g;

   private caa(int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static caa a(int $$0) {
      return f.apply($$0);
   }
}
