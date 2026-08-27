import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmg extends dkp implements dma {
   public static final MapCodec<dmg> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dma.a.e.fieldOf("weathering_state").forGetter(ddw::c), dpy.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dmg::new)
   );
   private final dma.a J;

   @Override
   public MapCodec<dmg> a() {
      return I;
   }

   public dmg(dma.a $$0, dpy $$1, dpx.d $$2) {
      super($$1, $$2);
      this.J = $$0;
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
      return this.J;
   }
}
