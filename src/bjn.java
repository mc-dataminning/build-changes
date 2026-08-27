import com.mojang.serialization.Codec;

public enum bjn implements aug {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bjn> d = aug.a(bjn::values);
   private final String e;

   private bjn(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
