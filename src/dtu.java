import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtu extends dma implements dtt {
   public static final MapCodec<dtu> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtt.a.e.fieldOf("weathering_state").forGetter(dtu::q), t()).apply($$0, dtu::new)
   );
   private final dtt.a e;

   @Override
   protected MapCodec<dtu> a() {
      return d;
   }

   public dtu(dtt.a $$0, dxt.d $$1) {
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
