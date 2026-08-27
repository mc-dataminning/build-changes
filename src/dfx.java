import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfx extends ddr implements dfs {
   public static final MapCodec<dfx> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfs.a.e.fieldOf("weathering_state").forGetter(cxq::c), u()).apply($$0, dfx::new)
   );
   private final dfs.a g;

   @Override
   public MapCodec<dfx> a() {
      return f;
   }

   public dfx(dfs.a $$0, djf.d $$1) {
      super($$1);
      this.g = $$0;
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(djg $$0) {
      return dfs.c($$0.b()).isPresent();
   }

   public dfs.a g() {
      return this.g;
   }
}
