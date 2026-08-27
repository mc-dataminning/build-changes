import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmd extends dcv implements dma {
   public static final MapCodec<dmd> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dma.a.e.fieldOf("weathering_state").forGetter(ddw::c), u()).apply($$0, dmd::new)
   );
   private final dma.a e;

   @Override
   public MapCodec<dmd> a() {
      return d;
   }

   public dmd(dma.a $$0, dpx.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dpy $$0) {
      return dma.c($$0.b()).isPresent();
   }

   public dma.a k() {
      return this.e;
   }
}
