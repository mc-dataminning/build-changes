import com.mojang.serialization.Codec;

public enum bsf implements azy {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bsf> d = azy.a(bsf::values);
   private final String e;

   private bsf(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
