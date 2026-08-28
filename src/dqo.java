import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqo extends dhu {
   protected static final MapCodec<lv> c = ly.i
      .q()
      .comapFlatMap($$0 -> $$0 instanceof lv $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<dqo> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), t()).apply($$0, dqo::new));
   protected final lv e;

   @Override
   public MapCodec<? extends dqo> a() {
      return d;
   }

   protected dqo(lv $$0, dvi.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(lr.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.e, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
