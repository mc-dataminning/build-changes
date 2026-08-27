import com.mojang.serialization.Codec;

public enum bhi implements asf {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bhi> d = asf.a(bhi::values);
   private final String e;

   private bhi(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
