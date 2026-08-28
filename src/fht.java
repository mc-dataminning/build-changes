import java.util.function.IntFunction;

public enum fht implements azf {
   a(0, "options.graphics.fast"),
   b(1, "options.graphics.fancy"),
   c(2, "options.graphics.fabulous");

   private static final IntFunction<fht> d = axt.a(fht::b, values(), axt.a.b);
   private final int e;
   private final String f;

   private fht(final int $$0, final String $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public int b() {
      return this.e;
   }

   @Override
   public String a() {
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

   public static fht a(int $$0) {
      return d.apply($$0);
   }
}
