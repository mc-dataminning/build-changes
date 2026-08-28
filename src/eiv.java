import com.mojang.serialization.Codec;

public enum eiv implements azu {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<eiv> f = azu.a(eiv::values);
   private final String g;

   private eiv(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
