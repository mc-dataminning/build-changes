import com.mojang.serialization.Codec;

public enum brj implements azk {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<brj> d = azk.a(brj::values);
   private final String e;

   private brj(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
