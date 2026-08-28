import com.mojang.serialization.Codec;

public enum eda implements bax {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   @Deprecated
   public static final Codec<eda> e = azg.c(eda::valueOf);
   private final String f;
   private final xg g;

   private eda(final String $$0) {
      this.f = $$0;
      this.g = xg.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.f;
   }

   public xg a() {
      return this.g;
   }
}
