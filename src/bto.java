import com.mojang.serialization.Codec;

public enum bto implements azv {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bto> d = azv.a(bto::values);
   private final String e;

   private bto(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
