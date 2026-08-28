import com.mojang.serialization.Codec;

public enum eco implements bam {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   @Deprecated
   public static final Codec<eco> e = ayw.c(eco::valueOf);
   private final String f;
   private final xa g;

   private eco(final String $$0) {
      this.f = $$0;
      this.g = xa.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.f;
   }

   public xa a() {
      return this.g;
   }
}
