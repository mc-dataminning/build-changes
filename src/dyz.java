import com.mojang.serialization.Codec;

public enum dyz implements aut {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<dyz> e = aut.a(dyz::values);
   private final String f;

   private dyz(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
