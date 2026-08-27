import java.util.function.IntFunction;

public enum bwu {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<bwu> f = aqr.a(bwu::a, values(), aqr.a.b);
   private final int g;

   private bwu(int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static bwu a(int $$0) {
      return f.apply($$0);
   }
}
