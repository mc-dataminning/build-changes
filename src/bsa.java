import com.mojang.serialization.Codec;

public enum bsa implements azy {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bsa> d = azy.a(bsa::values);
   private final String e;

   private bsa(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
