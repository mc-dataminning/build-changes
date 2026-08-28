import com.mojang.serialization.Codec;

public enum dfp implements bak {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<dfp> d = bak.a(dfp::values);
   private final String e;

   private dfp(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
