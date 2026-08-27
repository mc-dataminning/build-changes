import com.mojang.serialization.Codec;

public enum bnd implements axg {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bnd> d = axg.a(bnd::values);
   private final String e;

   private bnd(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
