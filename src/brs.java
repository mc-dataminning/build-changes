import com.mojang.serialization.Codec;

public enum brs implements azu {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<brs> d = azu.a(brs::values);
   private final String e;

   private brs(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
