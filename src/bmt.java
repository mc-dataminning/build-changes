import com.mojang.serialization.Codec;

public enum bmt implements axc {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bmt> d = axc.a(bmt::values);
   private final String e;

   private bmt(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
