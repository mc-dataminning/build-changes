import com.mojang.serialization.Codec;

public enum bhp implements asr {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bhp> d = asr.a(bhp::values);
   private final String e;

   private bhp(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
