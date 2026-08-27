import com.mojang.serialization.Codec;

public enum bhs implements asp {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bhs> d = asp.a(bhs::values);
   private final String e;

   private bhs(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
