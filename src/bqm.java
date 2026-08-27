import com.mojang.serialization.Codec;

public enum bqm implements ayx {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bqm> d = ayx.a(bqm::values);
   private final String e;

   private bqm(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
