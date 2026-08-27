import com.mojang.serialization.Codec;

public enum bjf implements aub {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bjf> d = aub.a(bjf::values);
   private final String e;

   private bjf(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
