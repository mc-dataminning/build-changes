import com.mojang.serialization.Codec;

public enum bta implements azv {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bta> d = azv.a(bta::values);
   private final String e;

   private bta(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
