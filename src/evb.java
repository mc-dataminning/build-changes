import java.util.function.IntFunction;

public enum evb implements auq {
   a(0, "options.graphics.fast"),
   b(1, "options.graphics.fancy"),
   c(2, "options.graphics.fabulous");

   private static final IntFunction<evb> d = atg.a(evb::a, values(), atg.a.b);
   private final int e;
   private final String f;

   private evb(int $$0, String $$1) {
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

   public static evb a(int $$0) {
      return d.apply($$0);
   }
}
