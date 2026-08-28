import com.mojang.serialization.Codec;

public enum brr implements azu {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<brr> d = azu.a(brr::values);
   private final String e;

   private brr(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
