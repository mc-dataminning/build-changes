import com.mojang.serialization.Codec;

public enum ert implements bak {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<ert> f = bak.a(ert::values);
   private final String g;

   private ert(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
