import com.mojang.serialization.Codec;

public enum bkx implements avk {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bkx> d = avk.a(bkx::values);
   private final String e;

   private bkx(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
