import com.mojang.serialization.Codec;

public enum emm implements baj {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<emm> f = baj.a(emm::values);
   private final String g;

   private emm(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
