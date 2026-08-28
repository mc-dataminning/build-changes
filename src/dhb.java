import com.mojang.serialization.Codec;

public enum dhb implements bax {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<dhb> d = bax.a(dhb::values);
   private final String e;

   private dhb(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
