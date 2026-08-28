import com.mojang.serialization.Codec;

public enum dfu implements bak {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<dfu> d = bak.a(dfu::values);
   private final String e;

   private dfu(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
