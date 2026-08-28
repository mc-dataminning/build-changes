import com.mojang.serialization.Codec;

public enum bvm implements bam {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bvm> d = bam.a(bvm::values);
   private final String e;

   private bvm(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
