import com.mojang.serialization.Codec;

public enum ejx implements azj {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<ejx> f = azj.a(ejx::values);
   private final String g;

   private ejx(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
