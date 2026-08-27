import com.mojang.serialization.Codec;

public enum cps implements avk {
   a("building"),
   b("redstone"),
   c("equipment"),
   d("misc");

   public static final Codec<cps> e = avk.a(cps::values);
   private final String f;

   private cps(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
