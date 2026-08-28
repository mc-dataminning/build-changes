import com.mojang.serialization.Codec;

public enum btb implements azv {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<btb> d = azv.a(btb::values);
   private final String e;

   private btb(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
