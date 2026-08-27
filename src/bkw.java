import com.mojang.serialization.Codec;

public enum bkw implements avj {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bkw> d = avj.a(bkw::values);
   private final String e;

   private bkw(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
