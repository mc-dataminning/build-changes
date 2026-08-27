import com.mojang.serialization.Codec;

public enum dzr implements avk {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<dzr> e = avk.a(dzr::values);
   private final String f;

   private dzr(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
