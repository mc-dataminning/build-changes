import com.mojang.serialization.Codec;

public enum dbw implements bag {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<dbw> d = bag.a(dbw::values);
   private final String e;

   private dbw(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
