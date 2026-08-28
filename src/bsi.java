import com.mojang.serialization.Codec;

public enum bsi implements bab {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bsi> d = bab.a(bsi::values);
   private final String e;

   private bsi(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
