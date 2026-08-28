import com.mojang.serialization.Codec;

public enum eoo implements azz {
   a("ignore_waterlogging"),
   b("apply_waterlogging");

   public static Codec<eoo> c = azz.b(eoo::values);
   private final String d;

   private eoo(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
