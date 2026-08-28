import com.mojang.serialization.Codec;

public enum dbr implements bab {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<dbr> d = bab.a(dbr::values);
   private final String e;

   private dbr(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
