import com.mojang.serialization.Codec;

public enum bug implements bag {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bug> d = bag.a(bug::values);
   private final String e;

   private bug(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
