import com.mojang.serialization.Codec;

public enum bni implements axg {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bni> d = axg.a(bni::values);
   private final String e;

   private bni(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
