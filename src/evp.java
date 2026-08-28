import com.mojang.serialization.Codec;

public enum evp implements bao {
   a("ignore_waterlogging"),
   b("apply_waterlogging");

   public static Codec<evp> c = bao.b(evp::values);
   private final String d;

   private evp(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
