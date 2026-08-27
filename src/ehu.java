import com.mojang.serialization.Codec;

public enum ehu implements ayx {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<ehu> e = ayx.a(ehu::values);
   private final String f;

   private ehu(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
