import com.mojang.serialization.Codec;

public enum emt implements bai {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<emt> f = bai.a(emt::values);
   private final String g;

   private emt(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
