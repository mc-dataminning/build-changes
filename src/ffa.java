import java.util.function.IntFunction;

public enum ffa implements azc {
   a(0, "options.graphics.fast"),
   b(1, "options.graphics.fancy"),
   c(2, "options.graphics.fabulous");

   private static final IntFunction<ffa> d = axp.a(ffa::a, values(), axp.a.b);
   private final int e;
   private final String f;

   private ffa(final int $$0, final String $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public int a() {
      return this.e;
   }

   @Override
   public String b() {
      return this.f;
   }

   @Override
   public String toString() {
      return switch (this) {
         case a -> "fast";
         case b -> "fancy";
         case c -> "fabulous";
      };
   }

   public static ffa a(int $$0) {
      return d.apply($$0);
   }
}
