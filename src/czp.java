import com.mojang.serialization.Codec;

public enum czp implements azc {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<czp> d = azc.a(czp::values);
   private final String e;

   private czp(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
