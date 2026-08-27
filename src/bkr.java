import com.mojang.serialization.Codec;

public enum bkr implements ave {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bkr> d = ave.a(bkr::values);
   private final String e;

   private bkr(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
