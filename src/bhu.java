import com.mojang.serialization.Codec;

public enum bhu implements asr {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bhu> d = asr.a(bhu::values);
   private final String e;

   private bhu(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
