import com.mojang.serialization.Codec;

public enum ely implements azz {
   a("linear"),
   b("triangular");

   public static final Codec<ely> c = azz.a(ely::values);
   private final String d;

   private ely(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(azl $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
