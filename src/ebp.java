import com.mojang.serialization.Codec;

public enum ebp implements axc {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<ebp> e = axc.a(ebp::values);
   private final String f;

   private ebp(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
