import java.util.function.IntFunction;

public enum cke {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<cke> f = ayv.a(cke::a, values(), ayv.a.b);
   private final int g;

   private cke(final int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static cke a(int $$0) {
      return f.apply($$0);
   }
}
