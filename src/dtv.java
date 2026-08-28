import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtv extends dmt implements dtt {
   public static final MapCodec<dtv> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyj.a.fieldOf("block_set_type").forGetter(dmt::b), dtt.a.e.fieldOf("weathering_state").forGetter(dtv::q), t()).apply($$0, dtv::new)
   );
   private final dtt.a m;

   @Override
   public MapCodec<dtv> a() {
      return l;
   }

   protected dtv(dyj $$0, dtt.a $$1, dxt.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if ($$0.c(dmt.f) == dyp.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dxu $$0) {
      return dtt.c($$0.b()).isPresent();
   }

   public dtt.a q() {
      return this.m;
   }
}
