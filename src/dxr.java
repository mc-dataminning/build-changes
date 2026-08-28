import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxr extends dwq implements dxk {
   public static final MapCodec<dxr> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ecf.a.fieldOf("block_set_type").forGetter(dwq::q), dxk.a.e.fieldOf("weathering_state").forGetter(dxr::r), t()).apply($$0, dxr::new)
   );
   private final dxk.a h;

   @Override
   public MapCodec<dxr> a() {
      return g;
   }

   protected dxr(ecf $$0, dxk.a $$1, ebp.d $$2) {
      super($$0, $$2);
      this.h = $$1;
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(ebq $$0) {
      return dxk.c($$0.b()).isPresent();
   }

   public dxk.a r() {
      return this.h;
   }
}
