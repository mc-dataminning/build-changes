import com.mojang.serialization.Codec;

public enum eqz implements azv {
   a("ignore_waterlogging"),
   b("apply_waterlogging");

   public static Codec<eqz> c = azv.b(eqz::values);
   private final String d;

   private eqz(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
