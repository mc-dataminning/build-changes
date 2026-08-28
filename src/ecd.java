import com.mojang.serialization.Codec;

public enum ecd implements bak {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   @Deprecated
   public static final Codec<ecd> e = ayu.c(ecd::valueOf);
   private final String f;
   private final wy g;

   private ecd(final String $$0) {
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
