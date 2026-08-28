import com.mojang.serialization.Codec;

public enum euu implements bak {
   a("ignore_waterlogging"),
   b("apply_waterlogging");

   public static Codec<euu> c = bak.b(euu::values);
   private final String d;

   private euu(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
