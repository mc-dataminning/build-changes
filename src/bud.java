import com.mojang.serialization.Codec;

public enum bud implements bba {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bud> d = bba.a(bud::values);
   private final String e;

   private bud(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
