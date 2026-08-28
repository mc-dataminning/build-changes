import com.mojang.serialization.Codec;

public enum bvj implements bao {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bvj> d = bao.a(bvj::values);
   private final String e;

   private bvj(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
