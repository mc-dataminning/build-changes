import com.mojang.serialization.Codec;

public enum biv implements atr {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<biv> d = atr.a(biv::values);
   private final String e;

   private biv(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
