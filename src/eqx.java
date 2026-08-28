import com.mojang.serialization.Codec;

public enum eqx implements azv {
   a("ignore_waterlogging"),
   b("apply_waterlogging");

   public static Codec<eqx> c = azv.b(eqx::values);
   private final String d;

   private eqx(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
