import com.mojang.serialization.Codec;

public enum bjs implements auk {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bjs> d = auk.a(bjs::values);
   private final String e;

   private bjs(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
