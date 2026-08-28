import com.mojang.serialization.Codec;

public enum bsn implements bab {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<bsn> d = bab.a(bsn::values);
   private final String e;

   private bsn(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
