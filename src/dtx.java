import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtx extends dts implements dtt {
   public static final MapCodec<dtx> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtt.a.e.fieldOf("weathering_state").forGetter(dtx::q), t()).apply($$0, dtx::new)
   );
   private final dtt.a f;

   @Override
   protected MapCodec<dtx> a() {
      return e;
   }

   protected dtx(dtt.a $$0, dxt.d $$1) {
      super($$1);
      this.f = $$0;
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
      return this.f;
   }
}
