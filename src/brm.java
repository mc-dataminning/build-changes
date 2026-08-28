import com.mojang.serialization.Codec;

public enum brm implements azu {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<brm> d = azu.a(brm::values);
   private final String e;

   private brm(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
