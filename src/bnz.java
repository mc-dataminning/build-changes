import com.mojang.serialization.Codec;

public enum bnz implements axq {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bnz> d = axq.a(bnz::values);
   private final String e;

   private bnz(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
