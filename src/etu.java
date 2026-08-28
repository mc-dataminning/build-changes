import com.mojang.serialization.Codec;

public enum etu implements bai {
   a("ignore_waterlogging"),
   b("apply_waterlogging");

   public static Codec<etu> c = bai.b(etu::values);
   private final String d;

   private etu(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
