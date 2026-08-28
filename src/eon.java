import com.mojang.serialization.Codec;

public enum eon implements bba {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<eon> f = bba.a(eon::values);
   private final String g;

   private eon(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
