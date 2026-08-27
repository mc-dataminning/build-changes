import com.mojang.serialization.Codec;

public enum bqr implements ayx {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bqr> d = ayx.a(bqr::values);
   private final String e;

   private bqr(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
