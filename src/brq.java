import com.mojang.serialization.Codec;

public enum brq implements azt {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<brq> d = azt.a(brq::values);
   private final String e;

   private brq(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
