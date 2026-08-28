import com.mojang.serialization.Codec;

public enum ecq implements bao {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   @Deprecated
   public static final Codec<ecq> e = ayy.c(ecq::valueOf);
   private final String f;
   private final xc g;

   private ecq(final String $$0) {
      this.f = $$0;
      this.g = xc.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.f;
   }

   public xc a() {
      return this.g;
   }
}
