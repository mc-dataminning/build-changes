import com.mojang.serialization.Codec;

public enum bul implements bag {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bul> d = bag.a(bul::values);
   private final String e;

   private bul(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
