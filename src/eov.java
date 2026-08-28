import com.mojang.serialization.Codec;

public enum eov implements bba {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<eov> f = bba.a(eov::values);
   private final String g;

   private eov(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
