import java.util.function.IntFunction;

public enum byz {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<byz> f = asj.a(byz::a, values(), asj.a.b);
   private final int g;

   private byz(int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static byz a(int $$0) {
      return f.apply($$0);
   }
}
