import com.mojang.serialization.Codec;

public enum brm implements azp {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<brm> d = azp.a(brm::values);
   private final String e;

   private brm(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
