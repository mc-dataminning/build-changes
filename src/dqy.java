import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqy extends dph implements dqs {
   public static final MapCodec<dqy> J = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dqs.a.e.fieldOf("weathering_state").forGetter(din::c), dus.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), t()).apply($$0, dqy::new)
   );
   private final dqs.a K;

   @Override
   public MapCodec<dqy> a() {
      return J;
   }

   public dqy(dqs.a $$0, dus $$1, dur.d $$2) {
      super($$1, $$2);
      this.K = $$0;
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
      return this.K;
   }
}
