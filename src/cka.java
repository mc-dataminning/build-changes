import java.util.function.IntFunction;

public enum cka {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<cka> f = ayv.a(cka::a, values(), ayv.a.b);
   private final int g;

   private cka(final int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static cka a(int $$0) {
      return f.apply($$0);
   }
}
