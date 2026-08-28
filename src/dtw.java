import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtw extends dmu implements dtu {
   public static final MapCodec<dtw> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyk.a.fieldOf("block_set_type").forGetter(dmu::b), dtu.a.e.fieldOf("weathering_state").forGetter(dtw::q), t()).apply($$0, dtw::new)
   );
   private final dtu.a m;

   @Override
   public MapCodec<dtw> a() {
      return l;
   }

   protected dtw(dyk $$0, dtu.a $$1, dxu.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if ($$0.c(dmu.f) == dyq.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dxv $$0) {
      return dtu.c($$0.b()).isPresent();
   }

   public dtu.a q() {
      return this.m;
   }
}
