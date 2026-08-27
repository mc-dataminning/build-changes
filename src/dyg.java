import com.mojang.serialization.Codec;

public class dyg extends dyv {
   public static final Codec<dyg> a = dfj.b.fieldOf("block_state").xmap(dyg::new, $$0 -> $$0.b).codec();
   private final dfj b;

   public dyg(dfj $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dfj $$0, asc $$1) {
      return $$0 == this.b;
   }

   @Override
   protected dyw<?> a() {
      return dyw.c;
   }
}
