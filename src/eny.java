import com.mojang.serialization.Codec;

public enum eny implements azv {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<eny> f = azv.a(eny::values);
   private final String g;

   private eny(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
