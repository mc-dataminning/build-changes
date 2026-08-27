import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dme extends dlz implements dma {
   public static final MapCodec<dme> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dma.a.e.fieldOf("weathering_state").forGetter(dme::k), u()).apply($$0, dme::new)
   );
   private final dma.a f;

   @Override
   protected MapCodec<dme> a() {
      return e;
   }

   protected dme(dma.a $$0, dpx.d $$1) {
      super($$1);
      this.f = $$0;
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
      return this.f;
   }
}
