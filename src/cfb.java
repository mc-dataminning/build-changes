import java.util.function.IntFunction;

public enum cfb {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<cfb> f = awn.a(cfb::a, values(), awn.a.b);
   private final int g;

   private cfb(int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static cfb a(int $$0) {
      return f.apply($$0);
   }
}
