import java.util.function.IntFunction;

public enum fnx implements azn {
   a(0, "options.graphics.fast"),
   b(1, "options.graphics.fancy"),
   c(2, "options.graphics.fabulous");

   private static final IntFunction<fnx> d = aya.a(fnx::b, values(), aya.a.b);
   private final int e;
   private final String f;

   private fnx(final int $$0, final String $$1) {
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

   public static fnx a(int $$0) {
      return d.apply($$0);
   }
}
