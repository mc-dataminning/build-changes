import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtw extends dkl implements dtt {
   public static final MapCodec<dtw> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtt.a.e.fieldOf("weathering_state").forGetter(dln::c), t()).apply($$0, dtw::new)
   );
   private final dtt.a e;

   @Override
   public MapCodec<dtw> a() {
      return d;
   }

   public dtw(dtt.a $$0, dxt.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dxu $$0, ash $$1, jh $$2, bam $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dxu $$0) {
      return dtt.c($$0.b()).isPresent();
   }

   public dtt.a q() {
      return this.e;
   }
}
