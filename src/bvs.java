import com.mojang.serialization.Codec;

public enum bvs implements bax {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bvs> d = bax.a(bvs::values);
   private final String e;

   private bvs(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
