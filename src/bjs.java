import com.mojang.serialization.Codec;

public enum bjs implements aug {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bjs> d = aug.a(bjs::values);
   private final String e;

   private bjs(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
