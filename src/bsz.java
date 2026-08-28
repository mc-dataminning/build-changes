import com.mojang.serialization.Codec;

public enum bsz implements azv {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bsz> d = azv.a(bsz::values);
   private final String e;

   private bsz(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
