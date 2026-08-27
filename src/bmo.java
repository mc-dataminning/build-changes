import com.mojang.serialization.Codec;

public enum bmo implements axc {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bmo> d = axc.a(bmo::values);
   private final String e;

   private bmo(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
