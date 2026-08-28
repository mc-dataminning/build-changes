import com.mojang.serialization.Codec;

public enum dgr implements bao {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<dgr> d = bao.a(dgr::values);
   private final String e;

   private dgr(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
