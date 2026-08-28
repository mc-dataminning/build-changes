import com.mojang.serialization.Codec;

public enum bur implements bak {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bur> d = bak.a(bur::values);
   private final String e;

   private bur(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
