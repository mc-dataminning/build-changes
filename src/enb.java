import com.mojang.serialization.Codec;

public enum enb implements azk {
   a("ignore_waterlogging"),
   b("apply_waterlogging");

   public static Codec<enb> c = azk.b(enb::values);
   private final String d;

   private enb(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
