import com.mojang.serialization.Codec;

public enum bqx implements azg {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bqx> d = azg.a(bqx::values);
   private final String e;

   private bqx(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
