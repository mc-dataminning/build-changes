import com.mojang.serialization.Codec;

public enum bsk implements azz {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bsk> d = azz.a(bsk::values);
   private final String e;

   private bsk(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
