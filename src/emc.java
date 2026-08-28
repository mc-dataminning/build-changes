import com.mojang.serialization.Codec;

public enum emc implements baf {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<emc> f = baf.a(emc::values);
   private final String g;

   private emc(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
