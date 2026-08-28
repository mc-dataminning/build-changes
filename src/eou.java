import com.mojang.serialization.Codec;

public enum eou implements azv {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<eou> f = azv.a(eou::values);
   private final String g;

   private eou(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
