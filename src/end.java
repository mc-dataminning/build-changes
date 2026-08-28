import com.mojang.serialization.Codec;

public enum end implements azk {
   a("ignore_waterlogging"),
   b("apply_waterlogging");

   public static Codec<end> c = azk.b(end::values);
   private final String d;

   private end(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
