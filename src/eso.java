import com.mojang.serialization.Codec;

public enum eso implements bao {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<eso> f = bao.a(eso::values);
   private final String g;

   private eso(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
