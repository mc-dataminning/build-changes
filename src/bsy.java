import com.mojang.serialization.Codec;

public enum bsy implements azu {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bsy> d = azu.a(bsy::values);
   private final String e;

   private bsy(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
