import com.mojang.serialization.Codec;

public enum bkz implements avl {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bkz> d = avl.a(bkz::values);
   private final String e;

   private bkz(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
