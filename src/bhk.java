import com.mojang.serialization.Codec;

public enum bhk implements ash {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bhk> d = ash.a(bhk::values);
   private final String e;

   private bhk(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
