import com.mojang.serialization.Codec;

public enum bqs implements azg {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bqs> d = azg.a(bqs::values);
   private final String e;

   private bqs(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
