import com.mojang.serialization.Codec;

public enum eln implements azz {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<eln> f = azz.a(eln::values);
   private final String g;

   private eln(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
