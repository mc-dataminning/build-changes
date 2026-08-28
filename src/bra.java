import com.mojang.serialization.Codec;

public enum bra implements ayz {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bra> d = ayz.a(bra::values);
   private final String e;

   private bra(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
