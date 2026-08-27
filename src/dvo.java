import com.mojang.serialization.Codec;

public enum dvo implements ask {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<dvo> e = ask.a(dvo::values);
   private final String f;

   private dvo(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
