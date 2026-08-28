import com.mojang.serialization.Codec;

public enum btg implements azv {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<btg> d = azv.a(btg::values);
   private final String e;

   private btg(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
