import com.mojang.serialization.Codec;

public enum bhn implements ask {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bhn> d = ask.a(bhn::values);
   private final String e;

   private bhn(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
