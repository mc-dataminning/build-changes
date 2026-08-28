import com.mojang.serialization.Codec;

public enum dae implements azj {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<dae> d = azj.a(dae::values);
   private final String e;

   private dae(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
