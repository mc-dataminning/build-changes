import com.mojang.serialization.Codec;

public enum btf implements bai {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<btf> d = bai.a(btf::values);
   private final String e;

   private btf(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
