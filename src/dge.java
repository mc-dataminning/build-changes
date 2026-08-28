import com.mojang.serialization.Codec;

public enum dge implements bak {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<dge> d = bak.a(dge::values);
   private final String e;

   private dge(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
