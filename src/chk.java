import java.util.function.IntFunction;

public enum chk {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<chk> f = axd.a(chk::a, values(), axd.a.b);
   private final int g;

   private chk(final int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static chk a(int $$0) {
      return f.apply($$0);
   }
}
