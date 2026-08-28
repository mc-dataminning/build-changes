import com.mojang.serialization.Codec;

public enum bvx implements bax {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bvx> d = bax.a(bvx::values);
   private final String e;

   private bvx(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
