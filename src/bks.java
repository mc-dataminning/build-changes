import com.mojang.serialization.Codec;

public enum bks implements avk {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bks> d = avk.a(bks::values);
   private final String e;

   private bks(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
