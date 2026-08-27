import com.mojang.serialization.Codec;

public enum dvv implements asr {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<dvv> e = asr.a(dvv::values);
   private final String f;

   private dvv(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
