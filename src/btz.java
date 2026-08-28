import com.mojang.serialization.Codec;

public enum btz implements bba {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<btz> d = bba.a(btz::values);
   private final String e;

   private btz(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
