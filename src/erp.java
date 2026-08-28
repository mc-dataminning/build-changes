import com.mojang.serialization.Codec;

public enum erp implements baq {
   a("ignore_waterlogging"),
   b("apply_waterlogging");

   public static Codec<erp> c = baq.b(erp::values);
   private final String d;

   private erp(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
