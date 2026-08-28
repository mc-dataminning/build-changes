import com.mojang.serialization.Codec;

public enum eqw implements azu {
   a("ignore_waterlogging"),
   b("apply_waterlogging");

   public static Codec<eqw> c = azu.b(eqw::values);
   private final String d;

   private eqw(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
