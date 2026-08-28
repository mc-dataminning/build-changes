import com.mojang.serialization.Codec;

public enum bte implements azv {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bte> d = azv.a(bte::values);
   private final String e;

   private bte(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
