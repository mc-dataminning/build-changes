import com.mojang.serialization.Codec;

public enum ere implements bak {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<ere> f = bak.a(ere::values);
   private final String g;

   private ere(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
