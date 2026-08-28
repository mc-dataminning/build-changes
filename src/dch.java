import com.mojang.serialization.Codec;

public enum dch implements bai {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<dch> d = bai.a(dch::values);
   private final String e;

   private dch(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
