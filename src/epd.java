import com.mojang.serialization.Codec;

public enum epd implements baf {
   a("ignore_waterlogging"),
   b("apply_waterlogging");

   public static Codec<epd> c = baf.b(epd::values);
   private final String d;

   private epd(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
