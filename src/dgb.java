import com.mojang.serialization.Codec;

public enum dgb implements bak {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<dgb> d = bak.a(dgb::values);
   private final String e;

   private dgb(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
