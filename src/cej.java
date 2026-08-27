import java.util.function.IntFunction;

public enum cej {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<cej> f = awb.a(cej::a, values(), awb.a.b);
   private final int g;

   private cej(int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static cej a(int $$0) {
      return f.apply($$0);
   }
}
