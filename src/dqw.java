import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqw extends dqr implements dqs {
   public static final MapCodec<dqw> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dqs.a.e.fieldOf("weathering_state").forGetter(dqw::l), t()).apply($$0, dqw::new)
   );
   private final dqs.a f;

   @Override
   protected MapCodec<dqw> a() {
      return e;
   }

   protected dqw(dqs.a $$0, dur.d $$1) {
      super($$1);
      this.f = $$0;
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
      return this.f;
   }
}
