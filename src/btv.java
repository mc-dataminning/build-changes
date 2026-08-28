import com.mojang.serialization.Codec;

public enum btv implements baq {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<btv> d = baq.a(btv::values);
   private final String e;

   private btv(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
