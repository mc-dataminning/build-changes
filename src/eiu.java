import com.mojang.serialization.Codec;

public enum eiu implements azt {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<eiu> f = azt.a(eiu::values);
   private final String g;

   private eiu(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
