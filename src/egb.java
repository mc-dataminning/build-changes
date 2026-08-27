import com.mojang.serialization.Codec;

public enum egb implements ayg {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<egb> e = ayg.a(egb::values);
   private final String f;

   private egb(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
