import com.mojang.serialization.Codec;

public enum bvb implements bak {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bvb> d = bak.a(bvb::values);
   private final String e;

   private bvb(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
