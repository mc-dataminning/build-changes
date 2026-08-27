import com.mojang.serialization.Codec;

public enum bnu implements axq {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bnu> d = axq.a(bnu::values);
   private final String e;

   private bnu(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
