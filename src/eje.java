import com.mojang.serialization.Codec;

public enum eje implements azs {
   a("linear"),
   b("triangular");

   public static final Codec<eje> c = azs.a(eje::values);
   private final String d;

   private eje(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(azf $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
