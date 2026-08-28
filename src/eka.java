import com.mojang.serialization.Codec;

public enum eka implements azk {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<eka> f = azk.a(eka::values);
   private final String g;

   private eka(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
