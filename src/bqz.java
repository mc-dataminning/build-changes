import com.mojang.serialization.Codec;

public enum bqz implements azc {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bqz> d = azc.a(bqz::values);
   private final String e;

   private bqz(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
