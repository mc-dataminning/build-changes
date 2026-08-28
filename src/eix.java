import com.mojang.serialization.Codec;

public enum eix implements azu {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<eix> f = azu.a(eix::values);
   private final String g;

   private eix(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
