import com.mojang.serialization.Codec;

public enum dvj implements ash {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<dvj> e = ash.a(dvj::values);
   private final String f;

   private dvj(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
