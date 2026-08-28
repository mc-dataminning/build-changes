import com.mojang.serialization.Codec;

public enum bue implements bba {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bue> d = bba.a(bue::values);
   private final String e;

   private bue(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
