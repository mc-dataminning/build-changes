import com.mojang.serialization.Codec;

public enum czn implements ayz {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<czn> d = ayz.a(czn::values);
   private final String e;

   private czn(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
