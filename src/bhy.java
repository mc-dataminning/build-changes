import com.mojang.serialization.Codec;

public enum bhy implements asu {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bhy> d = asu.a(bhy::values);
   private final String e;

   private bhy(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
