import com.mojang.serialization.Codec;

public enum erm implements bak {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<erm> f = bak.a(erm::values);
   private final String g;

   private erm(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
