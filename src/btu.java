import com.mojang.serialization.Codec;

public enum btu implements bba {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<btu> d = bba.a(btu::values);
   private final String e;

   private btu(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
