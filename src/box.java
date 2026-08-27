import com.mojang.serialization.Codec;

public enum box implements aye {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<box> d = aye.a(box::values);
   private final String e;

   private box(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
