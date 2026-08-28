import com.mojang.serialization.Codec;

public enum ded implements bba {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<ded> d = bba.a(ded::values);
   private final String e;

   private ded(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
