import com.mojang.serialization.Codec;

public enum ddc implements azv {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<ddc> d = azv.a(ddc::values);
   private final String e;

   private ddc(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
