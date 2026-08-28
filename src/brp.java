import com.mojang.serialization.Codec;

public enum brp implements azs {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<brp> d = azs.a(brp::values);
   private final String e;

   private brp(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
