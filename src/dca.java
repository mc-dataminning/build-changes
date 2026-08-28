import com.mojang.serialization.Codec;

public enum dca implements baj {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<dca> d = baj.a(dca::values);
   private final String e;

   private dca(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
