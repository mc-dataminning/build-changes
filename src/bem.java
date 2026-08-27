import com.mojang.serialization.Codec;

public enum bem implements apr {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bem> d = apr.a(bem::values);
   private final String e;

   private bem(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
