import com.mojang.serialization.Codec;

public enum bso implements baf {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bso> d = baf.a(bso::values);
   private final String e;

   private bso(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
