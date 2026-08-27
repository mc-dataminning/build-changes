import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfz extends dfb implements dfs {
   public static final MapCodec<dfz> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(djv.a.fieldOf("block_set_type").forGetter(dfb::g), dfs.a.e.fieldOf("weathering_state").forGetter(dfz::s), u()).apply($$0, dfz::new)
   );
   private final dfs.a n;

   @Override
   public MapCodec<dfz> a() {
      return m;
   }

   protected dfz(djv $$0, dfs.a $$1, djf.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(djg $$0) {
      return dfs.c($$0.b()).isPresent();
   }

   public dfs.a s() {
      return this.n;
   }
}
