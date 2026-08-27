import com.mojang.serialization.Codec;

public enum eke implements azg {
   a("none"),
   b("bury"),
   c("bury_proper"),
   d("beard_thin"),
   e("beard_box");

   public static final Codec<eke> f = azg.a(eke::values);
   private final String g;

   private eke(String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
