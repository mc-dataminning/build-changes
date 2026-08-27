import com.mojang.serialization.Codec;

public enum bhn implements asp {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bhn> d = asp.a(bhn::values);
   private final String e;

   private bhn(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
