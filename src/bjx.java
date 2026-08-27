import com.mojang.serialization.Codec;

public enum bjx implements auk {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bjx> d = auk.a(bjx::values);
   private final String e;

   private bjx(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
