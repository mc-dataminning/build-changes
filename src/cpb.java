import com.mojang.serialization.Codec;

public enum cpb implements aut {
   a("building"),
   b("redstone"),
   c("equipment"),
   d("misc");

   public static final Codec<cpb> e = aut.a(cpb::values);
   private final String f;

   private cpb(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
