import com.mojang.serialization.Codec;

public enum eby implements bak {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   @Deprecated
   public static final Codec<eby> e = ayu.c(eby::valueOf);
   private final String f;
   private final wy g;

   private eby(final String $$0) {
      this.f = $$0;
      this.g = wy.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.f;
   }

   public wy a() {
      return this.g;
   }
}
