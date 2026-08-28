import com.mojang.serialization.Codec;

public enum bst implements baf {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bst> d = baf.a(bst::values);
   private final String e;

   private bst(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
