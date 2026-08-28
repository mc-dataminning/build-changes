import com.mojang.serialization.Codec;

public enum brk implements azs {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<brk> d = azs.a(brk::values);
   private final String e;

   private brk(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
