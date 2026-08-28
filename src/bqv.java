import com.mojang.serialization.Codec;

public enum bqv implements ayz {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bqv> d = ayz.a(bqv::values);
   private final String e;

   private bqv(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
