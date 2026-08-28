import com.mojang.serialization.Codec;

public enum btt implements azv {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<btt> d = azv.a(btt::values);
   private final String e;

   private btt(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
