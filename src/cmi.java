import java.util.function.IntFunction;

public enum cmi {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<cmi> f = ayo.a(cmi::a, values(), ayo.a.b);
   private final int g;

   private cmi(final int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static cmi a(int $$0) {
      return f.apply($$0);
   }
}
