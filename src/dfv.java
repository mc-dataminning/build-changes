import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfv extends cwp implements dfs {
   public static final MapCodec<dfv> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfs.a.e.fieldOf("weathering_state").forGetter(cxq::c), u()).apply($$0, dfv::new)
   );
   private final dfs.a e;

   @Override
   public MapCodec<dfv> a() {
      return d;
   }

   public dfv(dfs.a $$0, djf.d $$1) {
      super($$1);
      this.e = $$0;
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
      return this.e;
   }
}
