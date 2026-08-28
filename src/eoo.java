import com.mojang.serialization.Codec;

public enum eoo implements baq {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<eoo> f = baq.a(eoo::values);
   private final String g;

   private eoo(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
