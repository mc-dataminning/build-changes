import java.util.function.IntFunction;

public enum ciz {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<ciz> f = ayb.a(ciz::a, values(), ayb.a.b);
   private final int g;

   private ciz(final int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static ciz a(int $$0) {
      return f.apply($$0);
   }
}
