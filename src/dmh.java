import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmh extends dli implements dma {
   public static final MapCodec<dmh> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dqn.a.fieldOf("block_set_type").forGetter(dli::k), dma.a.e.fieldOf("weathering_state").forGetter(dmh::s), u()).apply($$0, dmh::new)
   );
   private final dma.a n;

   @Override
   public MapCodec<dmh> a() {
      return m;
   }

   protected dmh(dqn $$0, dma.a $$1, dpx.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dpy $$0) {
      return dma.c($$0.b()).isPresent();
   }

   public dma.a s() {
      return this.n;
   }
}
