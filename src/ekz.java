import com.mojang.serialization.Codec;

public enum ekz implements azy {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<ekz> f = azy.a(ekz::values);
   private final String g;

   private ekz(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
