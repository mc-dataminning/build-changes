import com.mojang.serialization.Codec;

public enum ehw implements ayz {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<ehw> e = ayz.a(ehw::values);
   private final String f;

   private ehw(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
