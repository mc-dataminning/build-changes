import com.mojang.serialization.Codec;

public enum dxs implements aug {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<dxs> e = aug.a(dxs::values);
   private final String f;

   private dxs(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
