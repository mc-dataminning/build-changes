import com.mojang.serialization.Codec;

public enum btq implements baq {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<btq> d = baq.a(btq::values);
   private final String e;

   private btq(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
