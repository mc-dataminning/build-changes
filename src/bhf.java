import com.mojang.serialization.Codec;

public enum bhf implements ash {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bhf> d = ash.a(bhf::values);
   private final String e;

   private bhf(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
