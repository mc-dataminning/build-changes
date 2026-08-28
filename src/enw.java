import com.mojang.serialization.Codec;

public enum enw implements azv {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<enw> f = azv.a(enw::values);
   private final String g;

   private enw(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
