import java.util.function.IntFunction;

public enum bwn {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<bwn> f = aqk.a(bwn::a, values(), aqk.a.b);
   private final int g;

   private bwn(int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static bwn a(int $$0) {
      return f.apply($$0);
   }
}
