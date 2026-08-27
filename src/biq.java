import com.mojang.serialization.Codec;

public enum biq implements atr {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<biq> d = atr.a(biq::values);
   private final String e;

   private biq(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
