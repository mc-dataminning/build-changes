import com.mojang.serialization.Codec;

public enum dfj implements bai {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<dfj> d = bai.a(dfj::values);
   private final String e;

   private dfj(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
