import com.mojang.serialization.Codec;

public enum ejb implements ayz {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<ejb> f = ayz.a(ejb::values);
   private final String g;

   private ejb(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
