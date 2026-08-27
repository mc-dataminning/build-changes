import com.mojang.serialization.Codec;

public enum dvt implements asp {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<dvt> e = asp.a(dvt::values);
   private final String f;

   private dvt(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
