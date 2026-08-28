import com.mojang.serialization.Codec;

public enum dbo implements azz {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<dbo> d = azz.a(dbo::values);
   private final String e;

   private dbo(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
