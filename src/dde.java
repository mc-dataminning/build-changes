import com.mojang.serialization.Codec;

public enum dde implements azv {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<dde> d = azv.a(dde::values);
   private final String e;

   private dde(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
