import com.mojang.serialization.Codec;

public enum bpc implements ayg {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bpc> d = ayg.a(bpc::values);
   private final String e;

   private bpc(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
