import com.mojang.serialization.Codec;

public enum elr implements bab {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<elr> f = bab.a(elr::values);
   private final String g;

   private elr(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
