import com.mojang.serialization.Codec;

public enum eit implements azs {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<eit> f = azs.a(eit::values);
   private final String g;

   private eit(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
