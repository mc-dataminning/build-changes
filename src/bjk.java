import com.mojang.serialization.Codec;

public enum bjk implements aub {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bjk> d = aub.a(bjk::values);
   private final String e;

   private bjk(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
