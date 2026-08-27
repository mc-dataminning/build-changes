import com.mojang.serialization.Codec;

public enum bnv implements axq {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bnv> d = axq.a(bnv::values);
   private final String e;

   private bnv(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
