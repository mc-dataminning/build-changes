import com.mojang.serialization.Codec;

public enum bsy implements bag {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bsy> d = bag.a(bsy::values);
   private final String e;

   private bsy(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
