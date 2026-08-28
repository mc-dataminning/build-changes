import com.mojang.serialization.Codec;

public enum bro implements azk {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bro> d = azk.a(bro::values);
   private final String e;

   private bro(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
