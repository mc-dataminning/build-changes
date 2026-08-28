import com.mojang.serialization.Codec;

public enum bqy implements azc {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bqy> d = azc.a(bqy::values);
   private final String e;

   private bqy(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
