import com.mojang.serialization.Codec;

public enum del implements bag {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<del> d = bag.a(del::values);
   private final String e;

   private del(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
