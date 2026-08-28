import com.mojang.serialization.Codec;

public enum brd implements azc {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<brd> d = azc.a(brd::values);
   private final String e;

   private brd(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
