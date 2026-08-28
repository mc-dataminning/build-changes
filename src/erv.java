import com.mojang.serialization.Codec;

public enum erv implements azv {
   a("ignore_waterlogging"),
   b("apply_waterlogging");

   public static Codec<erv> c = azv.b(erv::values);
   private final String d;

   private erv(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
