import com.mojang.serialization.Codec;

public enum but implements bak {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<but> d = bak.a(but::values);
   private final String e;

   private but(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
