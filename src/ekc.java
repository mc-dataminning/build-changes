import com.mojang.serialization.Codec;

public enum ekc implements azk {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<ekc> f = azk.a(ekc::values);
   private final String g;

   private ekc(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
