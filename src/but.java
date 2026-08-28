import com.mojang.serialization.Codec;

public enum but implements bai {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<but> d = bai.a(but::values);
   private final String e;

   private but(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
