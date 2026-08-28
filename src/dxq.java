import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxq extends dvs implements dxk {
   public static final MapCodec<dxq> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxk.a.e.fieldOf("weathering_state").forGetter(dor::c), ebq.a.fieldOf("base_state").forGetter($$0x -> $$0x.f), t()).apply($$0, dxq::new)
   );
   private final dxk.a h;

   @Override
   public MapCodec<dxq> a() {
      return g;
   }

   public dxq(dxk.a $$0, ebq $$1, ebp.d $$2) {
      super($$1, $$2);
      this.h = $$0;
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(ebq $$0) {
      return dxk.c($$0.b()).isPresent();
   }

   public dxk.a q() {
      return this.h;
   }
}
