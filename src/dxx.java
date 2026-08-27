import com.mojang.serialization.Codec;

public enum dxx implements auk {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<dxx> e = auk.a(dxx::values);
   private final String f;

   private dxx(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
