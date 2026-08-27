import com.mojang.serialization.Codec;

public enum dzq implements avj {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<dzq> e = avj.a(dzq::values);
   private final String f;

   private dzq(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
