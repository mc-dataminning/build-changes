import com.mojang.serialization.Codec;

public enum euf implements bak {
   a("ignore_waterlogging"),
   b("apply_waterlogging");

   public static Codec<euf> c = bak.b(euf::values);
   private final String d;

   private euf(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
