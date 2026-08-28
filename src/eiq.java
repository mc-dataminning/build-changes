import com.mojang.serialization.Codec;

public enum eiq implements azp {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<eiq> f = azp.a(eiq::values);
   private final String g;

   private eiq(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
