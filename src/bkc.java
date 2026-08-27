import com.mojang.serialization.Codec;

public enum bkc implements aut {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bkc> d = aut.a(bkc::values);
   private final String e;

   private bkc(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
