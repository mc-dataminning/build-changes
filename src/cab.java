import java.util.function.IntFunction;

public enum cab {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<cab> f = atg.a(cab::a, values(), atg.a.b);
   private final int g;

   private cab(int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static cab a(int $$0) {
      return f.apply($$0);
   }
}
