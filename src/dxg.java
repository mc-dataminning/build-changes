import com.mojang.serialization.Codec;

public enum dxg implements aub {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<dxg> e = aub.a(dxg::values);
   private final String f;

   private dxg(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
