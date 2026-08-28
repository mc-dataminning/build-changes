import com.mojang.serialization.Codec;

public enum buw implements bak {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<buw> d = bak.a(buw::values);
   private final String e;

   private buw(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
