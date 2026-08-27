import com.mojang.serialization.Codec;

public enum bkr implements avj {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bkr> d = avj.a(bkr::values);
   private final String e;

   private bkr(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
