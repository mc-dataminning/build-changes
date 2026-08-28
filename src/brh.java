import com.mojang.serialization.Codec;

public enum brh implements azp {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<brh> d = azp.a(brh::values);
   private final String e;

   private brh(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
