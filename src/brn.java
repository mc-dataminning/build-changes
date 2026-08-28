import com.mojang.serialization.Codec;

public enum brn implements azu {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<brn> d = azu.a(brn::values);
   private final String e;

   private brn(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
