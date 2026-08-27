import com.mojang.serialization.Codec;

public enum bkh implements aut {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bkh> d = aut.a(bkh::values);
   private final String e;

   private bkh(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
