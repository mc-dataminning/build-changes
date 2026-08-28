import com.mojang.serialization.Codec;

public enum eqy implements azv {
   a("ignore_waterlogging"),
   b("apply_waterlogging");

   public static Codec<eqy> c = azv.b(eqy::values);
   private final String d;

   private eqy(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
