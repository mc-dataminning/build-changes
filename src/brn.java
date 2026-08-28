import com.mojang.serialization.Codec;

public enum brn implements azj {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<brn> d = azj.a(brn::values);
   private final String e;

   private brn(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
