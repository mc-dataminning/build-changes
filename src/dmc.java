import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmc extends dfb implements dma {
   public static final MapCodec<dmc> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dqn.a.fieldOf("block_set_type").forGetter(dfb::b), dma.a.e.fieldOf("weathering_state").forGetter(dmc::k), u()).apply($$0, dmc::new)
   );
   private final dma.a m;

   @Override
   public MapCodec<dmc> a() {
      return l;
   }

   protected dmc(dqn $$0, dma.a $$1, dpx.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if ($$0.c(dfb.f) == dqu.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean e_(dpy $$0) {
      return dma.c($$0.b()).isPresent();
   }

   public dma.a k() {
      return this.m;
   }
}
