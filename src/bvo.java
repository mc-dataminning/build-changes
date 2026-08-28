import com.mojang.serialization.Codec;

public enum bvo implements bao {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bvo> d = bao.a(bvo::values);
   private final String e;

   private bvo(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
