import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxm extends dpv implements dxk {
   public static final MapCodec<dxm> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ecf.a.fieldOf("block_set_type").forGetter(dpv::b), dxk.a.e.fieldOf("weathering_state").forGetter(dxm::q), t()).apply($$0, dxm::new)
   );
   private final dxk.a h;

   @Override
   public MapCodec<dxm> a() {
      return g;
   }

   protected dxm(ecf $$0, dxk.a $$1, ebp.d $$2) {
      super($$0, $$2);
      this.h = $$1;
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$0.c(dpv.c) == ecm.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(ebq $$0) {
      return dxk.c($$0.b()).isPresent();
   }

   public dxk.a q() {
      return this.h;
   }
}
