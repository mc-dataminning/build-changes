import com.mojang.serialization.Codec;

public enum ber implements apr {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<ber> d = apr.a(ber::values);
   private final String e;

   private ber(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
