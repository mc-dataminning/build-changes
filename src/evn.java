import com.mojang.serialization.Codec;

public enum evn implements bam {
   a("ignore_waterlogging"),
   b("apply_waterlogging");

   public static Codec<evn> c = bam.b(evn::values);
   private final String d;

   private evn(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
