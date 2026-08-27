import com.mojang.serialization.Codec;

public enum bos implements aye {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bos> d = aye.a(bos::values);
   private final String e;

   private bos(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
