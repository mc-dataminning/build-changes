import com.mojang.serialization.Codec;

public enum bre implements azc {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bre> d = azc.a(bre::values);
   private final String e;

   private bre(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
