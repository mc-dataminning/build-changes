import java.util.function.IntFunction;

public enum bym {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<bym> f = asb.a(bym::a, values(), asb.a.b);
   private final int g;

   private bym(int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static bym a(int $$0) {
      return f.apply($$0);
   }
}
