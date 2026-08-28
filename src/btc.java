import com.mojang.serialization.Codec;

public enum btc implements baj {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<btc> d = baj.a(btc::values);
   private final String e;

   private btc(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
