import com.mojang.serialization.Codec;

public enum bhd implements asf {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bhd> d = asf.a(bhd::values);
   private final String e;

   private bhd(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
