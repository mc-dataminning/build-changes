import com.mojang.serialization.Codec;

public enum bhi implements ask {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bhi> d = ask.a(bhi::values);
   private final String e;

   private bhi(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
