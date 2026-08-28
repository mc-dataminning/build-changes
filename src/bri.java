import com.mojang.serialization.Codec;

public enum bri implements azj {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bri> d = azj.a(bri::values);
   private final String e;

   private bri(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
