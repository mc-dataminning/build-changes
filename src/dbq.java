import com.mojang.serialization.Codec;

public enum dbq implements baf {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<dbq> d = baf.a(dbq::values);
   private final String e;

   private dbq(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
