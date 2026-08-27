import com.mojang.serialization.Codec;

public enum boa implements axq {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<boa> d = axq.a(boa::values);
   private final String e;

   private boa(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
