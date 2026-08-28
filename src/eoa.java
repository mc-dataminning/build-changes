import com.mojang.serialization.Codec;

public enum eoa implements azy {
   a("ignore_waterlogging"),
   b("apply_waterlogging");

   public static Codec<eoa> c = azy.b(eoa::values);
   private final String d;

   private eoa(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
