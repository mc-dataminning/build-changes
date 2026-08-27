import com.mojang.serialization.Codec;

public enum bqt implements ayz {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bqt> d = ayz.a(bqt::values);
   private final String e;

   private bqt(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
