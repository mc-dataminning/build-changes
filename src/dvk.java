import com.mojang.serialization.Codec;

public enum dvk implements ash {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<dvk> e = ash.a(dvk::values);
   private final String f;

   private dvk(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
