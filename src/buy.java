import com.mojang.serialization.Codec;

public enum buy implements bak {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<buy> d = bak.a(buy::values);
   private final String e;

   private buy(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
