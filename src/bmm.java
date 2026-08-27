import com.mojang.serialization.Codec;

public enum bmm implements axc {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bmm> d = axc.a(bmm::values);
   private final String e;

   private bmm(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
