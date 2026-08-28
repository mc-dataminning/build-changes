import com.mojang.serialization.Codec;

public enum ejh implements azc {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<ejh> f = azc.a(ejh::values);
   private final String g;

   private ejh(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
