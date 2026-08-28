import com.mojang.serialization.Codec;

public enum czq implements azc {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<czq> d = azc.a(czq::values);
   private final String e;

   private czq(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
