import com.mojang.serialization.Codec;

public enum esy implements bax {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<esy> f = bax.a(esy::values);
   private final String g;

   private esy(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
