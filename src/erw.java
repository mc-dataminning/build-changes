import com.mojang.serialization.Codec;

public enum erw implements bba {
   a("ignore_waterlogging"),
   b("apply_waterlogging");

   public static Codec<erw> c = bba.b(erw::values);
   private final String d;

   private erw(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
