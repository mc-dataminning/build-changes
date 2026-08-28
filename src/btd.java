import com.mojang.serialization.Codec;

public enum btd implements azu {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<btd> d = azu.a(btd::values);
   private final String e;

   private btd(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
