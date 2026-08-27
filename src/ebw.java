import com.mojang.serialization.Codec;

public enum ebw implements axc {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<ebw> e = axc.a(ebw::values);
   private final String f;

   private ebw(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
