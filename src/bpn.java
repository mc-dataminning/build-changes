import com.mojang.serialization.Codec;

public enum bpn implements ayq {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bpn> d = ayq.a(bpn::values);
   private final String e;

   private bpn(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
