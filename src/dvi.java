import com.mojang.serialization.Codec;

public enum dvi implements asf {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<dvi> e = asf.a(dvi::values);
   private final String f;

   private dvi(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
