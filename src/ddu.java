import com.mojang.serialization.Codec;

public enum ddu implements baq {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<ddu> d = baq.a(ddu::values);
   private final String e;

   private ddu(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
