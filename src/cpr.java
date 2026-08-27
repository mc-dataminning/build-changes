import com.mojang.serialization.Codec;

public enum cpr implements avj {
   a("building"),
   b("redstone"),
   c("equipment"),
   d("misc");

   public static final Codec<cpr> e = avj.a(cpr::values);
   private final String f;

   private cpr(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
