import com.mojang.serialization.Codec;

public enum dec implements bba {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<dec> d = bba.a(dec::values);
   private final String e;

   private dec(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
