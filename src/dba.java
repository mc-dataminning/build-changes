import com.mojang.serialization.Codec;

public enum dba implements azy {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<dba> d = azy.a(dba::values);
   private final String e;

   private dba(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
