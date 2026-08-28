import com.mojang.serialization.Codec;

public enum bty implements bba {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bty> d = bba.a(bty::values);
   private final String e;

   private bty(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
