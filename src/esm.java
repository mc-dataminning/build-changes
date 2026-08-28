import com.mojang.serialization.Codec;

public enum esm implements bam {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<esm> f = bam.a(esm::values);
   private final String g;

   private esm(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
