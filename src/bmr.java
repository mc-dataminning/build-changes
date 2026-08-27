import com.mojang.serialization.Codec;

public enum bmr implements axc {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bmr> d = axc.a(bmr::values);
   private final String e;

   private bmr(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
