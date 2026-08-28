import com.mojang.serialization.Codec;

public enum btz implements bba {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<btz> d = bba.a(btz::values);
   private final String e;

   private btz(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
