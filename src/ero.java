import com.mojang.serialization.Codec;

public enum ero implements bba {
   a("ignore_waterlogging"),
   b("apply_waterlogging");

   public static Codec<ero> c = bba.b(ero::values);
   private final String d;

   private ero(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
