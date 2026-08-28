import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtz extends dsi implements dtt {
   public static final MapCodec<dtz> J = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtt.a.e.fieldOf("weathering_state").forGetter(dln::c), dxu.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), t()).apply($$0, dtz::new)
   );
   private final dtt.a K;

   @Override
   public MapCodec<dtz> a() {
      return J;
   }

   public dtz(dtt.a $$0, dxu $$1, dxt.d $$2) {
      super($$1, $$2);
      this.K = $$0;
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
      return this.K;
   }
}
