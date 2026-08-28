import com.mojang.serialization.Codec;

public enum eqt implements bai {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<eqt> f = bai.a(eqt::values);
   private final String g;

   private eqt(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
