import com.mojang.serialization.Codec;

public enum bsf implements azz {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bsf> d = azz.a(bsf::values);
   private final String e;

   private bsf(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
