import com.mojang.serialization.Codec;

public enum epu implements bai {
   a("ignore_waterlogging"),
   b("apply_waterlogging");

   public static Codec<epu> c = bai.b(epu::values);
   private final String d;

   private epu(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
