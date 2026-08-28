import com.mojang.serialization.Codec;

public enum dag implements azk {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<dag> d = azk.a(dag::values);
   private final String e;

   private dag(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
