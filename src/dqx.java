import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqx extends doq implements dqs {
   public static final MapCodec<dqx> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dqs.a.e.fieldOf("weathering_state").forGetter(din::c), t()).apply($$0, dqx::new)
   );
   private final dqs.a g;

   @Override
   public MapCodec<dqx> a() {
      return f;
   }

   public dqx(dqs.a $$0, dur.d $$1) {
      super($$1);
      this.g = $$0;
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dus $$0) {
      return dqs.c($$0.b()).isPresent();
   }

   public dqs.a l() {
      return this.g;
   }
}
