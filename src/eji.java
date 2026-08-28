import com.mojang.serialization.Codec;

public enum eji implements azc {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<eji> f = azc.a(eji::values);
   private final String g;

   private eji(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
