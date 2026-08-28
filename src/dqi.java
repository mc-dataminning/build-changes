import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqi extends dho {
   protected static final MapCodec<lu> c = lx.i
      .q()
      .comapFlatMap($$0 -> $$0 instanceof lu $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a SimpleParticleType: " + $$0), $$0 -> $$0)
      .fieldOf("particle_options");
   public static final MapCodec<dqi> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), t()).apply($$0, dqi::new));
   protected final lu e;

   @Override
   public MapCodec<? extends dqi> a() {
      return d;
   }

   protected dqi(lu $$0, dvc.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(lq.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.e, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
