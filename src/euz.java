import com.mojang.serialization.Codec;

public enum euz implements bak {
   a("ignore_waterlogging"),
   b("apply_waterlogging");

   public static Codec<euz> c = bak.b(euz::values);
   private final String d;

   private euz(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
