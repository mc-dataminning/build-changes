import com.mojang.serialization.Codec;

public enum epn implements baj {
   a("ignore_waterlogging"),
   b("apply_waterlogging");

   public static Codec<epn> c = baj.b(epn::values);
   private final String d;

   private epn(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
