import com.mojang.serialization.Codec;

public enum ddb implements azu {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<ddb> d = azu.a(ddb::values);
   private final String e;

   private ddb(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
