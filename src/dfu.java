import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfu extends cyv implements dfs {
   public static final MapCodec<dfu> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(djv.a.fieldOf("block_set_type").forGetter(cyv::b), dfs.a.e.fieldOf("weathering_state").forGetter(dfu::g), u()).apply($$0, dfu::new)
   );
   private final dfs.a m;

   @Override
   public MapCodec<dfu> a() {
      return l;
   }

   protected dfu(djv $$0, dfs.a $$1, djf.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
      if ($$0.c(cyv.f) == dkc.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean e_(djg $$0) {
      return dfs.c($$0.b()).isPresent();
   }

   public dfs.a g() {
      return this.m;
   }
}
