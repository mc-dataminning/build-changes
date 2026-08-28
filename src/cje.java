import java.util.function.IntFunction;

public enum cje {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<cje> f = axp.a(cje::a, values(), axp.a.b);
   private final int g;

   private cje(final int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static cje a(int $$0) {
      return f.apply($$0);
   }
}
