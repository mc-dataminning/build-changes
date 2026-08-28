import com.mojang.serialization.Codec;

public enum eun implements bak {
   a("ignore_waterlogging"),
   b("apply_waterlogging");

   public static Codec<eun> c = bak.b(eun::values);
   private final String d;

   private eun(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
