import com.mojang.serialization.Codec;

public enum edn implements axq {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<edn> e = axq.a(edn::values);
   private final String f;

   private edn(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
