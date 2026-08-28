import com.mojang.serialization.Codec;

public enum ery implements bak {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<ery> f = bak.a(ery::values);
   private final String g;

   private ery(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
