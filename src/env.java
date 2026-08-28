import com.mojang.serialization.Codec;

public enum env implements azu {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<env> f = azu.a(env::values);
   private final String g;

   private env(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
