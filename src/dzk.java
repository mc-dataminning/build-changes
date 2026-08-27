import com.mojang.serialization.Codec;

public enum dzk implements ave {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<dzk> e = ave.a(dzk::values);
   private final String f;

   private dzk(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
