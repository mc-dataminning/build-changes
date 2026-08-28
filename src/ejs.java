import com.mojang.serialization.Codec;

public enum ejs implements azc {
   a("linear"),
   b("triangular");

   public static final Codec<ejs> c = azc.a(ejs::values);
   private final String d;

   private ejs(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(ayo $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
