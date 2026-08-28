import com.mojang.serialization.Codec;

public enum ddd implements azv {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<ddd> d = azv.a(ddd::values);
   private final String e;

   private ddd(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
