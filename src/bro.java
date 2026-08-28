import com.mojang.serialization.Codec;

public enum bro implements azu {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bro> d = azu.a(bro::values);
   private final String e;

   private bro(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
