import com.mojang.serialization.Codec;

public enum ddv implements azv {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<ddv> d = azv.a(ddv::values);
   private final String e;

   private ddv(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
