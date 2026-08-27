import com.mojang.serialization.Codec;

public enum bpi implements ayq {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bpi> d = ayq.a(bpi::values);
   private final String e;

   private bpi(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
